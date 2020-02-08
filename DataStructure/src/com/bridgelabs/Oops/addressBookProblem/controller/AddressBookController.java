package com.bridgelabs.Oops.addressBookProblem.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.bridgelabs.Oops.addressBookProblem.dto.AddressBookDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * purpose : To controls the flow of the data
 * 
 * @author Nikunj Balar
 *
 */
public class AddressBookController {

	ObjectMapper mapper = new ObjectMapper();

	File file = new File(
			"/home/bridgeit/Desktop/BridgelabzNikunj/DataStructure/src/com/bridgelabs/Oops/addressBookProblem/addressBook.json");

	// function to read json file 
	public List<AddressBookDTO> readFile() throws IOException {
		List<AddressBookDTO> list = mapper.readValue(file, new TypeReference<List<AddressBookDTO>>() {
		});
		return list;
	}

	// function to write json file 
	public void writeFile(List<AddressBookDTO> list) throws IOException {
		mapper.writerWithDefaultPrettyPrinter().writeValue(file, list);
	}
}