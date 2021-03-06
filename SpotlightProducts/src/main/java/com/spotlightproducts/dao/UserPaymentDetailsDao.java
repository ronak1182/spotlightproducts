package com.spotlightproducts.dao;

import javax.servlet.http.HttpServletRequest;

import com.spotlightproducts.businesslibrary.LoginUser;
import com.spotlightproducts.businesslibrary.UserPaymentDetails;

public class UserPaymentDetailsDao {

	private String fullName;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	private int zip_code;
	private int typeOfPayment;
	private String cardNumber;
	private String expirationDate;
	private int cvv;
	private String couponCode;

	public String getFullName() {
		return fullName;
	}

	public void setfullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZip_code() {
		return zip_code;
	}

	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}

	public int getTypeOfPayment() {
		return typeOfPayment;
	}

	public void setTypeOfPayment(int typeOfPayment) {
		this.typeOfPayment = typeOfPayment;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	// public DatabaseResponse saveUserOrderDetailsDao(){
	//
	// LoginUser newUser = new LoginUser();
	// return newUser.saveUserOrderDetails(this);
	// }

	public DatabaseResponse saveUserPaymentDetailsDao(HttpServletRequest request){

		UserPaymentDetails userPayment = new UserPaymentDetails();
		return userPayment.savePaymentDetails(this,request);
	}

}
