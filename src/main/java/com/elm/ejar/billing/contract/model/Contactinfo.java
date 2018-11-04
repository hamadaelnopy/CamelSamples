
package com.elm.ejar.billing.contract.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contactinfo {

    @SerializedName("CONTACT_EN_SHORT_NAME")
    @Expose
    private String cONTACTENSHORTNAME;
    @SerializedName("CONTACT_AR_SHORT_NAME")
    @Expose
    private String cONTACTARSHORTNAME;
    @SerializedName("CONTACT_EN_FULL_NAME")
    @Expose
    private String cONTACTENFULLNAME;
    @SerializedName("CONTACT_AR_FULL_NAME")
    @Expose
    private String cONTACTARFULLNAME;
    @SerializedName("CONTACT_EMAIL")
    @Expose
    private String cONTACTEMAIL;
    @SerializedName("CONTACT_MOBILE_NUMBER")
    @Expose
    private String cONTACTMOBILENUMBER;
    @SerializedName("CONTACT_UNIQUE_NUMBER")
    @Expose
    private String cONTACTUNIQUENUMBER;
    @SerializedName("CONTACT_TROLL")
    @Expose
    private String cONTACTTROLL;
    @SerializedName("CONTACT_IPAN")
    @Expose
    private String cONTACTIPAN;
    @SerializedName("CUSTOMER_ID")
    @Expose
    private String cUSTOMERID;

    public String getCONTACTENSHORTNAME() {
        return cONTACTENSHORTNAME;
    }

    public void setCONTACTENSHORTNAME(String cONTACTENSHORTNAME) {
        this.cONTACTENSHORTNAME = cONTACTENSHORTNAME;
    }

    public String getCONTACTARSHORTNAME() {
        return cONTACTARSHORTNAME;
    }

    public void setCONTACTARSHORTNAME(String cONTACTARSHORTNAME) {
        this.cONTACTARSHORTNAME = cONTACTARSHORTNAME;
    }

    public String getCONTACTENFULLNAME() {
        return cONTACTENFULLNAME;
    }

    public void setCONTACTENFULLNAME(String cONTACTENFULLNAME) {
        this.cONTACTENFULLNAME = cONTACTENFULLNAME;
    }

    public String getCONTACTARFULLNAME() {
        return cONTACTARFULLNAME;
    }

    public void setCONTACTARFULLNAME(String cONTACTARFULLNAME) {
        this.cONTACTARFULLNAME = cONTACTARFULLNAME;
    }

    public String getCONTACTEMAIL() {
        return cONTACTEMAIL;
    }

    public void setCONTACTEMAIL(String cONTACTEMAIL) {
        this.cONTACTEMAIL = cONTACTEMAIL;
    }

    public String getCONTACTMOBILENUMBER() {
        return cONTACTMOBILENUMBER;
    }

    public void setCONTACTMOBILENUMBER(String cONTACTMOBILENUMBER) {
        this.cONTACTMOBILENUMBER = cONTACTMOBILENUMBER;
    }

    public String getCONTACTUNIQUENUMBER() {
        return cONTACTUNIQUENUMBER;
    }

    public void setCONTACTUNIQUENUMBER(String cONTACTUNIQUENUMBER) {
        this.cONTACTUNIQUENUMBER = cONTACTUNIQUENUMBER;
    }

    public String getCONTACTTROLL() {
        return cONTACTTROLL;
    }

    public void setCONTACTTROLL(String cONTACTTROLL) {
        this.cONTACTTROLL = cONTACTTROLL;
    }

    public String getCONTACTIPAN() {
        return cONTACTIPAN;
    }

    public void setCONTACTIPAN(String cONTACTIPAN) {
        this.cONTACTIPAN = cONTACTIPAN;
    }

    public String getCUSTOMERID() {
        return cUSTOMERID;
    }

    public void setCUSTOMERID(String cUSTOMERID) {
        this.cUSTOMERID = cUSTOMERID;
    }

    @Override
    public String toString() {
        return "Contactinfo{" + "cONTACTENSHORTNAME=" + cONTACTENSHORTNAME + ", cONTACTARSHORTNAME=" + cONTACTARSHORTNAME + ", cONTACTENFULLNAME=" + cONTACTENFULLNAME + ", cONTACTARFULLNAME=" + cONTACTARFULLNAME + ", cONTACTEMAIL=" + cONTACTEMAIL + ", cONTACTMOBILENUMBER=" + cONTACTMOBILENUMBER + ", cONTACTUNIQUENUMBER=" + cONTACTUNIQUENUMBER + ", cONTACTTROLL=" + cONTACTTROLL + ", cONTACTIPAN=" + cONTACTIPAN + ", cUSTOMERID=" + cUSTOMERID + '}';
    }

}
