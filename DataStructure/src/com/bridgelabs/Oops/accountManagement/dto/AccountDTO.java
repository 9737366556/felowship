package com.bridgelabs.Oops.accountManagement.dto;


/**
 * Purpose : For Data transfer from server to json
 * 
 * @author Nikunj Balar
 *
 */
public class AccountDTO {

	private String name;
	private int numOfShare;
	private double prise;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumOfShare() {
		return numOfShare;
	}
	public void setNumOfShare(int numOfShare) {
		this.numOfShare = numOfShare;
	}
	public double getPrise() {
		return prise;
	}
	public void setPrise(double prise) {
		this.prise = prise;
	}
	@Override
	public String toString() {
		return "AccountDTO [name=" + name + ", numOfShare=" + numOfShare + ", prise=" + prise + ", getName()="
				+ getName() + ", getNumOfShare()=" + getNumOfShare() + ", getPrise()=" + getPrise() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
