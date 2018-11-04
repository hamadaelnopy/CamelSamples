package com.elm.ejar.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BillingMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private long billingMappingId;

	
	private String billingCorrelationId;

	
	private String billingRequestId;

	
	private short billingResult;

	
	private boolean billingResultBool;

	
	private String billingResultMessage;

	
	private long brogerageOfficeCrNumber;

	
	private String brogerageOfficeEmail;

	
	private String brogerageOfficeFullname;

	
	private String brogerageOfficeMobile;

	
	private String contractNumber;

	
	private short contractVersion;

	
	private Date creationDate;

	
	private String lessorEmail;

	
	private String lessorFullname;

	
	private String lessorIbanNumber;

	
	private String lessorIdNumber;

	
	private String lessorMobile;
	
	
	private Integer lessorNationality;
	
	
	private Short lessorIdType;

	
	private Date modificationDate;

	
	private String tenantEmail;

	
	private String tenantFullname;


	private String tenantIdNumber;

	
	private String tenantMobile;

	
	private String billingOperation;
	
	
	private String virtualAccountNumber;
	
	
	
	
	private Date startDate;
	
	
	private Date endDate;

	

	
	private String cancelBSFContract;
    private BigDecimal totalAmount;
	
	
	

	public String getCancelBSFContract() {
		return cancelBSFContract;
	}

	public void setCancelBSFContract(String cancelBSFContract) {
		this.cancelBSFContract = cancelBSFContract;
	}

	public BillingMapping() {
	}

	public long getBillingMappingId() {
		return this.billingMappingId;
	}

	public void setBillingMappingId(long billingMappingId) {
		this.billingMappingId = billingMappingId;
	}

	public String getBillingCorrelationId() {
		return this.billingCorrelationId;
	}

	public void setBillingCorrelationId(String billingCorrelationId) {
		this.billingCorrelationId = billingCorrelationId;
	}

	public String getBillingRequestId() {
		return this.billingRequestId;
	}

	public void setBillingRequestId(String billingRequestId) {
		this.billingRequestId = billingRequestId;
	}

	public short getBillingResult() {
		return this.billingResult;
	}

	public void setBillingResult(short billingResult) {
		this.billingResult = billingResult;
	}

	public boolean getBillingResultBool() {
		return this.billingResultBool;
	}

	public void setBillingResultBool(boolean billingResultBool) {
		this.billingResultBool = billingResultBool;
	}

	public String getBillingResultMessage() {
		return this.billingResultMessage;
	}

	public void setBillingResultMessage(String billingResultMessage) {
		this.billingResultMessage = billingResultMessage;
	}

	public long getBrogerageOfficeCrNumber() {
		return this.brogerageOfficeCrNumber;
	}

	public void setBrogerageOfficeCrNumber(long brogerageOfficeCrNumber) {
		this.brogerageOfficeCrNumber = brogerageOfficeCrNumber;
	}

	public String getBrogerageOfficeEmail() {
		return this.brogerageOfficeEmail;
	}

	public void setBrogerageOfficeEmail(String brogerageOfficeEmail) {
		this.brogerageOfficeEmail = brogerageOfficeEmail;
	}

	public String getBrogerageOfficeFullname() {
		return this.brogerageOfficeFullname;
	}

	public void setBrogerageOfficeFullname(String brogerageOfficeFullname) {
		this.brogerageOfficeFullname = brogerageOfficeFullname;
	}

	public String getBrogerageOfficeMobile() {
		return this.brogerageOfficeMobile;
	}

	public void setBrogerageOfficeMobile(String brogerageOfficeMobile) {
		this.brogerageOfficeMobile = brogerageOfficeMobile;
	}

	public String getContractNumber() {
		return this.contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public short getContractVersion() {
		return this.contractVersion;
	}

	public void setContractVersion(short contractVersion) {
		this.contractVersion = contractVersion;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getLessorEmail() {
		return this.lessorEmail;
	}

	public void setLessorEmail(String lessorEmail) {
		this.lessorEmail = lessorEmail;
	}

	public String getLessorFullname() {
		return this.lessorFullname;
	}

	public void setLessorFullname(String lessorFullname) {
		this.lessorFullname = lessorFullname;
	}

	public String getLessorIbanNumber() {
		return this.lessorIbanNumber;
	}

	public void setLessorIbanNumber(String lessorIbanNumber) {
		this.lessorIbanNumber = lessorIbanNumber;
	}

	public String getLessorIdNumber() {
		return this.lessorIdNumber;
	}

	public void setLessorIdNumber(String lessorIdNumber) {
		this.lessorIdNumber = lessorIdNumber;
	}

	public String getLessorMobile() {
		return this.lessorMobile;
	}

	public void setLessorMobile(String lessorMobile) {
		this.lessorMobile = lessorMobile;
	}

	public Date getModificationDate() {
		return this.modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	public String getTenantEmail() {
		return this.tenantEmail;
	}

	public void setTenantEmail(String tenantEmail) {
		this.tenantEmail = tenantEmail;
	}

	public String getTenantFullname() {
		return this.tenantFullname;
	}

	public void setTenantFullname(String tenantFullname) {
		this.tenantFullname = tenantFullname;
	}

	public String getTenantIdNumber() {
		return this.tenantIdNumber;
	}

	public void setTenantIdNumber(String tenantIdNumber) {
		this.tenantIdNumber = tenantIdNumber;
	}

	public String getTenantMobile() {
		return this.tenantMobile;
	}

	public void setTenantMobile(String tenantMobile) {
		this.tenantMobile = tenantMobile;
	}

	public void setBillingOperation(String billingOperation) {
		this.billingOperation = billingOperation;
	}

	public String getBillingOperation() {
		return billingOperation;
	}
	public void setVirtualAccountNumber(String virtualAccountNumber) {
		this.virtualAccountNumber = virtualAccountNumber;
	}
	public String getVirtualAccountNumber() {
		return virtualAccountNumber;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public Integer getLessorNationality() {
		return lessorNationality;
	}

	public void setLessorNationality(Integer lessorNationality) {
		this.lessorNationality = lessorNationality;
	}

	public Short getLessorIdType() {
		return lessorIdType;
	}

	public void setLessorIdType(Short lessorIdType) {
		this.lessorIdType = lessorIdType;
	}

    @Override
    public String toString() {
        return "BillingMapping{" + "billingMappingId=" + billingMappingId + ", billingCorrelationId=" + billingCorrelationId + ", billingRequestId=" + billingRequestId + ", billingResult=" + billingResult + ", billingResultBool=" + billingResultBool + ", billingResultMessage=" + billingResultMessage + ", brogerageOfficeCrNumber=" + brogerageOfficeCrNumber + ", brogerageOfficeEmail=" + brogerageOfficeEmail + ", brogerageOfficeFullname=" + brogerageOfficeFullname + ", brogerageOfficeMobile=" + brogerageOfficeMobile + ", contractNumber=" + contractNumber + ", contractVersion=" + contractVersion + ", creationDate=" + creationDate + ", lessorEmail=" + lessorEmail + ", lessorFullname=" + lessorFullname + ", lessorIbanNumber=" + lessorIbanNumber + ", lessorIdNumber=" + lessorIdNumber + ", lessorMobile=" + lessorMobile + ", lessorNationality=" + lessorNationality + ", lessorIdType=" + lessorIdType + ", modificationDate=" + modificationDate + ", tenantEmail=" + tenantEmail + ", tenantFullname=" + tenantFullname + ", tenantIdNumber=" + tenantIdNumber + ", tenantMobile=" + tenantMobile + ", billingOperation=" + billingOperation + ", virtualAccountNumber=" + virtualAccountNumber + ", startDate=" + startDate + ", endDate=" + endDate + ", cancelBSFContract=" + cancelBSFContract + ", totalAmount=" + totalAmount + '}';
    }
        
        
        
}