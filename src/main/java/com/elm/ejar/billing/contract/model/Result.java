
package com.elm.ejar.billing.contract.model;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SerializedName("Result")
    @Expose
    private Short result;
    @SerializedName("ResultMessage")
    @Expose
    private String resultMessage;
    @SerializedName("ResultBool")
    @Expose
    private Boolean resultBool;
    @SerializedName("CorrelationId")
    @Expose
    private String correlationId;
    @SerializedName("RequestId")
    @Expose
    private String requestId;

    @SerializedName("ErrorCode")
    @Expose
    private  Short errorCode;
    
    public Short getResult() {
        return result;
    }

    public void setResult(Short result) {
        this.result = result;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public Boolean getResultBool() {
        return resultBool;
    }

    public void setResultBool(Boolean resultBool) {
        this.resultBool = resultBool;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public String toString() {
        return "Result{" + "result=" + result + ", resultMessage=" + resultMessage + ", resultBool=" + resultBool + ", correlationId=" + correlationId + ", requestId=" + requestId + '}';
    }
    
    public Result() {
		
	}
    
    public void setErrorCode(Short errorCode) {
		this.errorCode = errorCode;
	}
    
    public Short getErrorCode() {
		return errorCode;
	}
    


}
