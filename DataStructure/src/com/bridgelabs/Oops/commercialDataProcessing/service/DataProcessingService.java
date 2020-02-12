package com.bridgelabs.Oops.commercialDataProcessing.service;

import java.io.IOException;
import java.util.List;

import com.bridgelabs.Oops.commercialDataProcessing.dto.CompanyDTO;
import com.bridgelabs.Oops.commercialDataProcessing.dto.CustomerDTO;
import com.bridgelabs.Oops.commercialDataProcessing.dto.TransectionDTO;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * purpose : To maintain functionality of the project
 * 
 * @author Nikunj Balar
 *
 */
public interface DataProcessingService {

	// for add new company details
	public List<CompanyDTO> addCompany(List<CompanyDTO> list);

	// for show all companies name
	public void showCompanies(List<CompanyDTO> list);

	// for showing all the customer of particular company
	public void customerOf(List<CustomerDTO> list, String name);

	// for showing the transaction of the perticular customer
	public void transactionOf(List<TransectionDTO> list, String name);

	// to buy share
	public List<TransectionDTO> buyShare(List<CompanyDTO> comList, List<TransectionDTO> tranList)
			throws JsonGenerationException, JsonMappingException, IOException;

	// to sell share
	public List<TransectionDTO> sellShare(List<CompanyDTO> comList, List<TransectionDTO> tranList)
			throws JsonGenerationException, JsonMappingException, IOException;
}
