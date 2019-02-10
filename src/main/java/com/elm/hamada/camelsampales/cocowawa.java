/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elm.hamada.camelsampales;

import com.elm.ejar.billing.contract.model.BillingCustomerRequest;
import com.elm.ejar.billing.contract.model.Customersinfo;
import com.elm.ejar.entity.BillingMapping;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import org.apache.camel.CamelContext;
import org.apache.camel.LoggingLevel;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.processor.interceptor.Tracer;

/**
 *
 * @author hyousef
 */
public class cocowawa {

    public static void main(String[] args) throws Exception {
        CamelContext camelContext = new DefaultCamelContext();
        camelContext.addRoutes(new CreateBatchContractRoute());
        Gson gson = new Gson();
        List<BatchContractRequest> pojo = preparePOJO();
        BatchContractRequestCollection batchContractRequestCollection = new BatchContractRequestCollection();
        batchContractRequestCollection.setBatchContractRequests(pojo);
        String json = gson.toJson(batchContractRequestCollection);
        camelContext.setTracing(true);
        System.out.println(json);
        Tracer tracer = new Tracer();
        tracer.setTraceOutExchanges(true);

        tracer.setLogLevel(LoggingLevel.DEBUG);
        camelContext.addInterceptStrategy(tracer);
        camelContext.start();
        /* wait indefinitely */

        camelContext.createProducerTemplate().sendBodyAndHeader("direct:Q_BATCH_CONTRACT_CREATION", json,"endDate","201902101354");
        Object obj = new Object();
        synchronized (obj) {
            obj.wait();
        }
    }

    static List<BatchContractRequest> preparePOJO() {
        List<BatchContractRequest> batchContractRequests = new ArrayList<BatchContractRequest>();

        BillingMapping mapping = new BillingMapping();
        mapping.setContractNumber("contract 123");
        mapping.setBillingMappingId(123L);
        BillingMapping mapping2 = new BillingMapping();
        mapping.setBillingOperation("Create");

        mapping2.setContractNumber("contract 456");
        mapping2.setBillingMappingId(456L);

        mapping2.setBillingOperation("Update");

        BillingCustomerRequest billingCustomerRequest = new BillingCustomerRequest();
        List<Customersinfo> customersinfos = new ArrayList<Customersinfo>();
        Customersinfo customersinfo = new Customersinfo();
        customersinfo.setCUSTOMERUNIQUENUMBER("contacrt 123");
        customersinfo.setBILLINGPERIOD("billing cocowawa");
        customersinfos.add(customersinfo);
        billingCustomerRequest.setCUSTOMERSINFO(customersinfos);

        BillingCustomerRequest billingCustomerRequest2 = new BillingCustomerRequest();
        List<Customersinfo> customersinfos2 = new ArrayList<Customersinfo>();
        Customersinfo customersinfo2 = new Customersinfo();
        customersinfo2.setCUSTOMERUNIQUENUMBER("contacrt 567");
        customersinfo2.setBILLINGPERIOD("billing kokowawa");
        customersinfos2.add(customersinfo);
        billingCustomerRequest2.setCUSTOMERSINFO(customersinfos2);

        BatchContractRequest batchContractRequest = new BatchContractRequest(billingCustomerRequest, mapping);
        BatchContractRequest batchContractRequest1 = new BatchContractRequest(billingCustomerRequest2, mapping2);
        batchContractRequest.setUploadToSadad(Boolean.TRUE);
        batchContractRequest1.setUploadToSadad(Boolean.TRUE);
        batchContractRequests.add(batchContractRequest);
        batchContractRequests.add(batchContractRequest1);
        
        return batchContractRequests;

    }

}
