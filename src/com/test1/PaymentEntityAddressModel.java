package com.test1;

public class PaymentEntityAddressModel {
	private Integer paymentKey;
	private String countryCode;
	private String branchInfo;
	private String streetAddress1;
	private String streetAddress2;
	private String streetAddress3;
	private String streetAddress4;
	private String streetAddress5;
	private String city;
	private String state;
	private String landMark;
	private String zipcode;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public PaymentEntityAddressModel() {

	}

	public PaymentEntityAddressModel(Integer paymentKey, String countryCode, String branchInfo, String streetAddress1,
			String streetAddress2, String streetAddress3, String streetAddress4, String streetAddress5, String city,
			String state, String landMark, String zipcode, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.paymentKey = paymentKey;
		this.countryCode = countryCode;
		this.branchInfo = branchInfo;
		this.streetAddress1 = streetAddress1;
		this.streetAddress2 = streetAddress2;
		this.streetAddress3 = streetAddress3;
		this.streetAddress4 = streetAddress4;
		this.streetAddress5 = streetAddress5;
		this.city = city;
		this.state = state;
		this.landMark = landMark;
		this.zipcode = zipcode;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getPaymentKey() {
		return paymentKey;
	}

	public void setPaymentKey(Integer paymentKey) {
		this.paymentKey = paymentKey;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getBranchInfo() {
		return branchInfo;
	}

	public void setBranchInfo(String branchInfo) {
		this.branchInfo = branchInfo;
	}

	public String getStreetAddress1() {
		return streetAddress1;
	}

	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}

	public String getStreetAddress2() {
		return streetAddress2;
	}

	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}

	public String getStreetAddress3() {
		return streetAddress3;
	}

	public void setStreetAddress3(String streetAddress3) {
		this.streetAddress3 = streetAddress3;
	}

	public String getStreetAddress4() {
		return streetAddress4;
	}

	public void setStreetAddress4(String streetAddress4) {
		this.streetAddress4 = streetAddress4;
	}

	public String getStreetAddress5() {
		return streetAddress5;
	}

	public void setStreetAddress5(String streetAddress5) {
		this.streetAddress5 = streetAddress5;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
