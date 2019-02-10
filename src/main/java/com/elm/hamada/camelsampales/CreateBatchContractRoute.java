/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elm.hamada.camelsampales;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Predicate;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

/**
 *
 * @author hyousef
 */
public class CreateBatchContractRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:Q_BATCH_CONTRACT_CREATION")
                .id("CreateBatchContractRoute")
                .errorHandler(deadLetterChannel("direct:DeadLetterTest").useOriginalMessage().onPrepareFailure(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        System.out.println("on faliure header value : " + exchange.getIn().getHeader("cocowawa"));
                        exchange.getIn().setHeader("cocowawa", "habal fe el header");
                    }
                }))
                .onException(IOException.class)
                            .useOriginalMessage()
                            .asyncDelayedRedelivery()
                            .logExhausted(true)
                            .logHandled(true)
                            .retriesExhaustedLogLevel(LoggingLevel.ERROR)
                            .retryAttemptedLogLevel(LoggingLevel.WARN)
                            .useExponentialBackOff()
                            .maximumRedeliveries("5")
                            .redeliveryDelay("100")
                            .end()
                .onException(Exception.class)
                            .useOriginalMessage()
                            .asyncDelayedRedelivery()
                            .logExhausted(true)
                            .logHandled(true)
                            .retriesExhaustedLogLevel(LoggingLevel.ERROR)
                            .retryAttemptedLogLevel(LoggingLevel.WARN)
                            .redeliveryDelay("100")
                            .retryWhile(new Predicate() {
                                @Override
                                public boolean matches(Exchange exchange) {
                                    String endDateHeader = (String) exchange.getIn().getHeader("endDate");
                                    SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
                                    Date endDate = null;
                                    try {
                                        endDate = df.parse(endDateHeader);
                                    } catch (ParseException ex) {
                                        Logger.getLogger(CreateBatchContractRoute.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    return endDate.after(new Date());
                                }
                            })
                            .end()
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        throw new NullPointerException();//To change body of generated methods, choose Tools | Templates.
                    }
                })
                .unmarshal().json(JsonLibrary.Gson, BatchContractRequestCollection.class)
                //  .setProperty("originalMessage", body())
                //.setBody(simple("${body.batchContractRequests}"))
                .split(simple("${body.batchContractRequests}"))
                //.unmarshal().json(JsonLibrary.Gson, BatchContractRequest.class)
                //.convertBodyTo(BatchContractRequest.class)
                // .unmarshal().json(JsonLibrary.Gson, BatchContractRequest.class)
                // .log("${body}")
                .to("seda:CreateBatchContractRoute_singleContract")
                .end();

        from("seda:CreateBatchContractRoute_singleContract")
                .setProperty("billingCustomerRequest", body().method("getBillingCustomerRequest"))
                .setHeader("ACTION_TYPE", simple("${body.billingMapping.billingOperation}"))
                .setHeader("BILLING_MAPPING_ID", simple("${body.billingMapping.billingMappingId}"))
                .setHeader("CONTRACT_NUMBER", simple("${body.billingMapping.contractNumber}"))
                .setHeader("CONTRACT_OR_CUSTOMER", simple("CUSTOMER"))
                .setHeader("trialsCounter", simple("0"))
                .choice().when().simple("${body.uploadToSadad} == 'True'")
                .setBody(simple("${body.billingMapping}"))
                .marshal().json(JsonLibrary.Gson)
                .convertBodyTo(String.class)
                .to("seda:CreateBatchContractRoute_singleContract_bsfUpdate")
                .end()
                .setBody(simple("${property.billingCustomerRequest}"))
                .marshal().json(JsonLibrary.Gson)
                .convertBodyTo(String.class)
                .to("seda:CreateBatchContractRoute_singleContract_billingUpdate")
                .end();

        from("seda:CreateBatchContractRoute_singleContract_bsfUpdate")
                .log("start BSF part route")
                //                .log("${header.ACTION_TYPE}")
                //                .log("${header.BILLING_MAPPING_ID}")
                //                .log("${header.CONTRACT_NUMBER}")
                //                .log("${header.CONTRACT_OR_CUSTOMER}")
                .log("${body}");
        from("seda:CreateBatchContractRoute_singleContract_billingUpdate")
                .log("${header.ACTION_TYPE}")
                .log("${header.BILLING_MAPPING_ID}")
                .log("${header.CONTRACT_NUMBER}")
                .log("${header.CONTRACT_OR_CUSTOMER}")
                .log("${header.trialsCounter}")
                .log("${body}");

        from("direct:DeadLetterTest")
                .log("cocowawa")
                .log("${header.cocowawa}");
        // .log("${header.kokowawa}")
        //.log("${body}");

    }

}
