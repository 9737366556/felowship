package com.bridgelabs.Oops.addressBookProblem.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.bridgelabs.Oops.addressBookProblem.dto.AddressBookDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AddressBookController {

	ObjectMapper mapper = new ObjectMapper();

	File file = new File(
			"/home/bridgeit/Desktop/BridgelabzNikunj/DataStructure/src/com/bridgelabs/Oops/addressBookProblem/addressBook.json");

	public List<AddressBookDTO> readFile() throws IOException {
		List<AddressBookDTO> list = mapper.readValue(file, new TypeReference<List<AddressBookDTO>>() {
		});
		return list;
	}

	public void writeFile(List<AddressBookDTO> list) throws IOException {
		mapper.writerWithDefaultPrettyPrinter().writeValue(file, list);
	}
}