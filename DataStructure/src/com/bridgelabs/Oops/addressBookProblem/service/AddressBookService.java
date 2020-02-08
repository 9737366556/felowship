package com.bridgelabs.Oops.addressBookProblem.service;

import java.util.List;

import com.bridgelabs.Oops.addressBookProblem.dto.AddressBookDTO;

/**
 * purpose : To maintain functionality of the project
 * 
 * @author Nikunj Balar
 *
 */
public interface AddressBookService {

	// add address
	public List<AddressBookDTO> addAddress(List<AddressBookDTO> list);
	// remove address base on name 
	public List<AddressBookDTO> removeShare(List<AddressBookDTO> list ,String name);
	// edit address base on name
	public List<AddressBookDTO> editAddress(List<AddressBookDTO> list, String remove);
	// show address the user want
	public void showAddress(List<AddressBookDTO> list, String name);
	// sort the address base on last name 
	public List<AddressBookDTO> sortByLName(List<AddressBookDTO> list);
	// sort the address base on zip 
	public List<AddressBookDTO> sortByZip(List<AddressBookDTO> list) ;
	
}
