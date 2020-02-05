package com.bridgelabs.Oops.addressBookProblem.service;

import java.util.List;

import com.bridgelabs.Oops.addressBookProblem.dto.AddressBookDTO;

public interface AddressBookService {

	public List<AddressBookDTO> addAddress(List<AddressBookDTO> list);
	
	public List<AddressBookDTO> removeShare(List<AddressBookDTO> list ,String name);

	public List<AddressBookDTO> editAddress(List<AddressBookDTO> list, String remove);
	
	public void showAddress(List<AddressBookDTO> list, String name);
	
	public List<AddressBookDTO> sortByLName(List<AddressBookDTO> list);
	
	public List<AddressBookDTO> sortByZip(List<AddressBookDTO> list) ;
	
}
