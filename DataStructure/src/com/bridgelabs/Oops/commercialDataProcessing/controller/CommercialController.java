package com.bridgelabs.Oops.commercialDataProcessing.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.bridgelabs.Oops.commercialDataProcessing.dto.CompanyDTO;
import com.bridgelabs.Oops.commercialDataProcessing.dto.CustomerDTO;
import com.bridgelabs.Oops.commercialDataProcessing.dto.TransectionDTO;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Purpose : To control the flow of the data
 * 
 * @author Nikunj Balar
 *
 */
public class CommercialController {

	// helps to map the data from json to dto
	ObjectMapper mapper = new ObjectMapper();

	File comFile = new File(
			"/home/bridgeit/Desktop/BridgelabzNikunj/DataStructure/src/com/bridgelabs/Oops/commercialDataProcessing/company.json");
	File custFile = new File(
			"/home/bridgeit/Desktop/BridgelabzNikunj/DataStructure/src/com/bridgelabs/Oops/commercialDataProcessing/customer.json");
	File transactionFile = new File(
			"/home/bridgeit/Desktop/BridgelabzNikunj/DataStructure/src/com/bridgelabs/Oops/commercialDataProcessing/transaction.json");

	// for read company details fromjsonFile
	public List<CompanyDTO> readCompany() throws JsonParseException, JsonMappingException, IOException {
		List<CompanyDTO> list = mapper.readValue(comFile, new TypeReference<List<CompanyDTO>>() {
		});
		return list;
	}

	// for write company details into jsonFile
	public void writeCompany(List<CompanyDTO> list) throws JsonGenerationException, JsonMappingException, IOException {
		mapper.writerWithDefaultPrettyPrinter().writeValue(comFile, list);
	}

	// for read customer details jsonFile
	public List<CustomerDTO> readCustomer() throws JsonParseException, JsonMappingException, IOException {
		List<CustomerDTO> list = mapper.readValue(custFile, new TypeReference<List<CustomerDTO>>() {
		});
		return list;
	}

	// for write customer details into jsonFile
	public void writeCustomer(List<CustomerDTO> list)
			throws JsonGenerationException, JsonMappingException, IOException {
		mapper.writerWithDefaultPrettyPrinter().writeValue(custFile, list);
	}

	// for read transaction details fromjsonFile
	public List<TransectionDTO> readTransaction() throws JsonParseException, JsonMappingException, IOException {
		List<TransectionDTO> list = mapper.readValue(transactionFile, new TypeReference<List<TransectionDTO>>() {
		});
		return list;
	}

	// for write transaction details into jsonFile
	public void writeTransaction(List<TransectionDTO> list)
			throws JsonGenerationException, JsonMappingException, IOException {
		mapper.writerWithDefaultPrettyPrinter().writeValue(transactionFile, list);
	}
}
