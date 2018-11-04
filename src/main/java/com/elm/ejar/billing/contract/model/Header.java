
package com.elm.ejar.billing.contract.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Header {

    @SerializedName("REQUEST_ID")
    @Expose
    private String rEQUESTID;
    @SerializedName("DATE")
    @Expose
    private String dATE;
    @SerializedName("PACKAGE_CODE")
    @Expose
    private String pACKAGECODE;
    @SerializedName("TYPE")
    @Expose
    private String tYPE;
    @SerializedName("BILLER_CODE")
    @Expose
    private String bILLERCODE;

    public String getREQUESTID() {
        return rEQUESTID;
    }

    public void setREQUESTID(String rEQUESTID) {
        this.rEQUESTID = rEQUESTID;
    }

    public String getDATE() {
        return dATE;
    }

    public void setDATE(String dATE) {
        this.dATE = dATE;
    }

    public String getPACKAGECODE() {
        return pACKAGECODE;
    }

    public void setPACKAGECODE(String pACKAGECODE) {
        this.pACKAGECODE = pACKAGECODE;
    }

    public String getTYPE() {
        return tYPE;
    }

    public void setTYPE(String tYPE) {
        this.tYPE = tYPE;
    }

    public String getBILLERCODE() {
        return bILLERCODE;
    }

    public void setBILLERCODE(String bILLERCODE) {
        this.bILLERCODE = bILLERCODE;
    }

}
