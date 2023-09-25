package com.test1;

public class PaymentEntity {
	private Integer paymentKey;
	private Integer recordKey;
	private String effectiveDate;
	private Integer institutionName;
	private String officeType;
	private String parentOfficeType;
	private String headOfficeKey;
	private String legalType;
	private String entityState;
	private String modifiedState;
	private String remarks;

	public PaymentEntity() {

	}

	public PaymentEntity(Integer paymentKey, Integer recordKey, String effectiveDate, Integer institutionName,
			String officeType, String parentOfficeType, String headOfficeKey, String legalType, String entityState,
			String modifiedState, String remarks) {
		super();
		this.paymentKey = paymentKey;
		this.recordKey = recordKey;
		this.effectiveDate = effectiveDate;
		this.institutionName = institutionName;
		this.officeType = officeType;
		this.parentOfficeType = parentOfficeType;
		this.headOfficeKey = headOfficeKey;
		this.legalType = legalType;
		this.entityState = entityState;
		this.modifiedState = modifiedState;
		this.remarks = remarks;
	}

	public Integer getPaymentKey() {
		return paymentKey;
	}

	public void setPaymentKey(Integer paymentKey) {
		this.paymentKey = paymentKey;
	}

	public Integer getRecordKey() {
		return recordKey;
	}

	public void setRecordKey(Integer recordKey) {
		this.recordKey = recordKey;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Integer getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(Integer institutionName) {
		this.institutionName = institutionName;
	}

	public String getOfficeType() {
		return officeType;
	}

	public void setOfficeType(String officeType) {
		this.officeType = officeType;
	}

	public String getParentOfficeType() {
		return parentOfficeType;
	}

	public void setParentOfficeType(String parentOfficeType) {
		this.parentOfficeType = parentOfficeType;
	}

	public String getHeadOfficeKey() {
		return headOfficeKey;
	}

	public void setHeadOfficeKey(String headOfficeKey) {
		this.headOfficeKey = headOfficeKey;
	}

	public String getLegalType() {
		return legalType;
	}

	public void setLegalType(String legalType) {
		this.legalType = legalType;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

	public String getModifiedState() {
		return modifiedState;
	}

	public void setModifiedState(String modifiedState) {
		this.modifiedState = modifiedState;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
