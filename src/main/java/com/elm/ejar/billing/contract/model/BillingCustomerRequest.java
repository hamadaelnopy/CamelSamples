
package com.elm.ejar.billing.contract.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BillingCustomerRequest {

    @SerializedName("HEADER")
    @Expose
    private Header hEADER;
    @SerializedName("CUSTOMERS_INFO")
    @Expose
    private List<Customersinfo> cUSTOMERSINFO = null;

    public Header getHEADER() {
        return hEADER;
    }

    public void setHEADER(Header hEADER) {
        this.hEADER = hEADER;
    }

    public List<Customersinfo> getCUSTOMERSINFO() {
        return cUSTOMERSINFO;
    }

    public void setCUSTOMERSINFO(List<Customersinfo> cUSTOMERSINFO) {
        this.cUSTOMERSINFO = cUSTOMERSINFO;
    }

    @Override
    public String toString() {
        return "BillingCustomerRequest{" + "hEADER=" + hEADER + ", cUSTOMERSINFO=" + cUSTOMERSINFO + '}';
    }

    
    
    
}
