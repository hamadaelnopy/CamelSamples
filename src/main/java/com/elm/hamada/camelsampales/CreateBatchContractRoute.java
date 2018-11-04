/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elm.hamada.camelsampales;

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
                .unmarshal().json(JsonLibrary.Gson, BatchContractRequestCollection.class)
                .setProperty("originalMessage", body())
                .setBody(simple("${body.batchContractRequests}"))
                .split(body())
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
                .to("seda:CreateBatchContractRoute_singleContract_bsfUpdate")
                .end()
                .setBody(simple("${property.billingCustomerRequest}"))
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
//                .log("${header.ACTION_TYPE}")
//                .log("${header.BILLING_MAPPING_ID}")
//                .log("${header.CONTRACT_NUMBER}")
//                .log("${header.CONTRACT_OR_CUSTOMER}")
                .log("${body}");
    }

}
