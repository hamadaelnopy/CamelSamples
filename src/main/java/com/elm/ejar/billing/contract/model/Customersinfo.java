
package com.elm.ejar.billing.contract.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Customersinfo {

    @SerializedName("CUSTOMER_DESCRIPTION")
    @Expose
    private String cUSTOMERDESCRIPTION;
    @SerializedName("CUSTOMER_EN_SHORT_NAME")
    @Expose
    private String cUSTOMERENSHORTNAME;
    @SerializedName("CUSTOMER_AR_SHORT_NAME")
    @Expose
    private String cUSTOMERARSHORTNAME;
    @SerializedName("CUSTOMER_EN_FULL_NAME")
    @Expose
    private String cUSTOMERENFULLNAME;
    @SerializedName("CUSTOMER_AR_FULL_NAME")
    @Expose
    private String cUSTOMERARFULLNAME;
    @SerializedName("CUSTOMER_UNIQUE_NUMBER")
    @Expose
    private String cUSTOMERUNIQUENUMBER;
    @SerializedName("CUSTOMER_TYPE")
    @Expose
    private String cUSTOMERTYPE;
    @SerializedName("CUSTOMER_ACTIVITY_STATUS")
    @Expose
    private String cUSTOMERACTIVITYSTATUS;
    @SerializedName("BILLING_PERIOD")
    @Expose
    private String bILLINGPERIOD;
    @SerializedName("LAST_BILLING_DATE")
    @Expose
    private String lASTBILLINGDATE;
    @SerializedName("CONTACT_INFO")
    @Expose
    private List<Contactinfo> cONTACTINFO = null;

    public String getCUSTOMERDESCRIPTION() {
        return cUSTOMERDESCRIPTION;
    }

    public void setCUSTOMERDESCRIPTION(String cUSTOMERDESCRIPTION) {
        this.cUSTOMERDESCRIPTION = cUSTOMERDESCRIPTION;
    }

    public String getCUSTOMERENSHORTNAME() {
        return cUSTOMERENSHORTNAME;
    }

    public void setCUSTOMERENSHORTNAME(String cUSTOMERENSHORTNAME) {
        this.cUSTOMERENSHORTNAME = cUSTOMERENSHORTNAME;
    }

    public String getCUSTOMERARSHORTNAME() {
        return cUSTOMERARSHORTNAME;
    }

    public void setCUSTOMERARSHORTNAME(String cUSTOMERARSHORTNAME) {
        this.cUSTOMERARSHORTNAME = cUSTOMERARSHORTNAME;
    }

    public String getCUSTOMERENFULLNAME() {
        return cUSTOMERENFULLNAME;
    }

    public void setCUSTOMERENFULLNAME(String cUSTOMERENFULLNAME) {
        this.cUSTOMERENFULLNAME = cUSTOMERENFULLNAME;
    }

    public String getCUSTOMERARFULLNAME() {
        return cUSTOMERARFULLNAME;
    }

    public void setCUSTOMERARFULLNAME(String cUSTOMERARFULLNAME) {
        this.cUSTOMERARFULLNAME = cUSTOMERARFULLNAME;
    }

    public String getCUSTOMERUNIQUENUMBER() {
        return cUSTOMERUNIQUENUMBER;
    }

    public void setCUSTOMERUNIQUENUMBER(String cUSTOMERUNIQUENUMBER) {
        this.cUSTOMERUNIQUENUMBER = cUSTOMERUNIQUENUMBER;
    }

    public String getCUSTOMERTYPE() {
        return cUSTOMERTYPE;
    }

    public void setCUSTOMERTYPE(String cUSTOMERTYPE) {
        this.cUSTOMERTYPE = cUSTOMERTYPE;
    }

    public String getCUSTOMERACTIVITYSTATUS() {
        return cUSTOMERACTIVITYSTATUS;
    }

    public void setCUSTOMERACTIVITYSTATUS(String cUSTOMERACTIVITYSTATUS) {
        this.cUSTOMERACTIVITYSTATUS = cUSTOMERACTIVITYSTATUS;
    }

    public String getBILLINGPERIOD() {
        return bILLINGPERIOD;
    }

    public void setBILLINGPERIOD(String bILLINGPERIOD) {
        this.bILLINGPERIOD = bILLINGPERIOD;
    }

    public String getLASTBILLINGDATE() {
        return lASTBILLINGDATE;
    }

    public void setLASTBILLINGDATE(String lASTBILLINGDATE) {
        this.lASTBILLINGDATE = lASTBILLINGDATE;
    }

    public List<Contactinfo> getCONTACTINFO() {
        return cONTACTINFO;	
    }

    public void setCONTACTINFO(List<Contactinfo> cONTACTINFO) {
        this.cONTACTINFO = cONTACTINFO;
    }

    @Override
    public String toString() {
        return "Customersinfo{" + "cUSTOMERDESCRIPTION=" + cUSTOMERDESCRIPTION + ", cUSTOMERENSHORTNAME=" + cUSTOMERENSHORTNAME + ", cUSTOMERARSHORTNAME=" + cUSTOMERARSHORTNAME + ", cUSTOMERENFULLNAME=" + cUSTOMERENFULLNAME + ", cUSTOMERARFULLNAME=" + cUSTOMERARFULLNAME + ", cUSTOMERUNIQUENUMBER=" + cUSTOMERUNIQUENUMBER + ", cUSTOMERTYPE=" + cUSTOMERTYPE + ", cUSTOMERACTIVITYSTATUS=" + cUSTOMERACTIVITYSTATUS + ", bILLINGPERIOD=" + bILLINGPERIOD + ", lASTBILLINGDATE=" + lASTBILLINGDATE + ", cONTACTINFO=" + cONTACTINFO + '}';
    }

}
