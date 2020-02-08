package com.bridgelabs.Oops.commercialDataProcessing.dto;

/**
 * purpose : To transfer the data from server to the jsonFile
 * 
 * @author Nikunj Balar
 *
 */
public class TransectionDTO {

	private String cusName;
	private String companyName;
	private int noOfShare;
	private double price;
	private String dateTime;
	
	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getNoOfShare() {
		return noOfShare;
	}

	public void setNoOfShare(int noOfShare) {
		this.noOfShare = noOfShare;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String string) {
		this.dateTime = string;
	}

	@Override
	public String toString() {
		return "cusName=" + cusName + "\ncompanyName=" + companyName + "\nnoOfShare=" + noOfShare
				+ "\nprice=" + price + "\ndateTime=" + dateTime +"\n";
	}
}
