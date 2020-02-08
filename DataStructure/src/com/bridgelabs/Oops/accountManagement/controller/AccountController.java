package com.bridgelabs.Oops.accountManagement.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.bridgelabs.Oops.accountManagement.dto.AccountDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * Purpose : To read and write data into json file 
 * 
 * @author Nikunj Balar
 *
 */
public class AccountController {

	static ObjectMapper mapper = new ObjectMapper();
	
	 File file = new File("/home/bridgeit/Desktop/BridgelabzNikunj/DataStructure/src/com/bridgelabs/Oops/accountManagement/accountManagement.json");

	 // function for read data from json file
	 public List<AccountDTO> readFile() throws IOException {
		 List<AccountDTO> list = mapper.readValue(file, new TypeReference<List<AccountDTO>>() {});
		 return list;
	 }
	 //function for write data into json file  
	 public void writeFile( List<AccountDTO> list ) throws IOException {
		 mapper.writerWithDefaultPrettyPrinter().writeValue(file, list);
	 }
}
