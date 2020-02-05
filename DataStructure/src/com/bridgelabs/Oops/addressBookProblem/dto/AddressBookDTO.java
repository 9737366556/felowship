package com.bridgelabs.Oops.addressBookProblem.dto;

import java.io.Serializable;

public class AddressBookDTO implements Comparable<AddressBookDTO> {
	private String fName;
	private String lName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private long number;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}



	@Override
	public int compareTo(AddressBookDTO arg0) {
		return 0;
	}

	@Override
	public String toString() {
		return "AddressBookDTO [fName=" + fName + ", lName=" + lName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", number=" + number + "]";
	}

}
