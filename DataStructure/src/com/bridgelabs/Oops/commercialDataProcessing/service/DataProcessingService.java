package com.bridgelabs.Oops.commercialDataProcessing.service;

import java.util.List;

import com.bridgelabs.Oops.commercialDataProcessing.dto.CompanyDTO;
import com.bridgelabs.Oops.commercialDataProcessing.dto.CustomerDTO;
import com.bridgelabs.Oops.commercialDataProcessing.dto.TransectionDTO;

/**
 * purpose : To maintain functionality of the project
 * 
 * @author Nikunj Balar
 *
 */
public interface DataProcessingService {

	//for add new company details 
	public List<CompanyDTO> addCompany(List<CompanyDTO> list);
	
	// for show all companies name
	public void showCompanies(List<CompanyDTO> list);
	
	// for showing all the customer of particular company
	public void customerOf(List<CustomerDTO> list , String name);
	
	// for showing the transaction of the perticular customer
	public void transactionOf(List<TransectionDTO> list , String name);

	// to buy share
	public List<TransectionDTO> buyShare(List<CompanyDTO> comList , List<CustomerDTO> cusList ,List<TransectionDTO> tranList );
}
