package com.bridgelabs.Oops.cliniqueManagement.dto;

/**
 * purpose : To transer the data from server to the json
 * 
 * @author Nikunj Balar
 *
 */
public class PatientsDTO {

	private String name;
	private int iD;
	private long mobileNumber;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PatientsDTO [name=" + name + ", iD=" + iD + ", mobileNumber=" + mobileNumber + ", age=" + age + "]";
	}

}
