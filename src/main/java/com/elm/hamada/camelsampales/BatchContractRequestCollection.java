/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elm.hamada.camelsampales;

import java.util.List;

/**
 *
 * @author hyousef
 */
public class BatchContractRequestCollection {
 
    List<BatchContractRequest> batchContractRequests;

    public BatchContractRequestCollection() {
    }

    public void setBatchContractRequests(List<BatchContractRequest> batchContractRequests) {
        this.batchContractRequests = batchContractRequests;
    }

    public List<BatchContractRequest> getBatchContractRequests() {
        return batchContractRequests;
    }
    
    
}
