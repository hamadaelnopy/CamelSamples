/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elm.hamada.camelsampales;

import com.elm.ejar.billing.contract.model.BillingCustomerRequest;
import com.elm.ejar.entity.BillingMapping;

/**
 *
 * @author hyousef
 */
public class BatchContractRequest {

    BillingCustomerRequest billingCustomerRequest;
    BillingMapping billingMapping;
    Boolean uploadToSadad;
    

    public BatchContractRequest(BillingCustomerRequest billingCustomerRequest, BillingMapping billingMapping) {
        this.billingCustomerRequest = billingCustomerRequest;
        this.billingMapping = billingMapping;
    }
    
    

    public BillingCustomerRequest getBillingCustomerRequest() {
        return billingCustomerRequest;
    }

    public void setBillingCustomerRequest(BillingCustomerRequest billingCustomerRequest) {
        this.billingCustomerRequest = billingCustomerRequest;
    }

    public BillingMapping getBillingMapping() {
        return billingMapping;
    }

    public void setBillingMapping(BillingMapping billingMapping) {
        this.billingMapping = billingMapping;
    }

    @Override
    public String toString() {
        return "BatchContractRequest{" + "billingCustomerRequest=" + billingCustomerRequest + ", billingMapping=" + billingMapping  + '}';
    }

    public void setUploadToSadad(Boolean uploadToSadad) {
        this.uploadToSadad = uploadToSadad;
    }

    public Boolean getUploadToSadad() {
        return uploadToSadad;
    }

    
    
    
    
  
    
    
  
}
