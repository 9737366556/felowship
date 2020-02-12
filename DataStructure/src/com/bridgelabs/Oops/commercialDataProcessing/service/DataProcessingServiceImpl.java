package com.bridgelabs.Oops.commercialDataProcessing.service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.bridgelabs.Oops.commercialDataProcessing.controller.CommercialController;
import com.bridgelabs.Oops.commercialDataProcessing.dto.CompanyDTO;
import com.bridgelabs.Oops.commercialDataProcessing.dto.CustomerDTO;
import com.bridgelabs.Oops.commercialDataProcessing.dto.TransectionDTO;
import com.bridgelabs.utility.DataStructureUtility;
import com.bridgelabs.utility.Utility;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * purpose : Implementation of method of service interface
 * 
 * @author Nikunj Balar
 *
 */
public class DataProcessingServiceImpl implements DataProcessingService {

	CompanyDTO cDto = new CompanyDTO();
	TransectionDTO tDto = new TransectionDTO();
	CommercialController controller = new CommercialController(); 
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime dateTime = LocalDateTime.now();

	@Override
	// for add company details
	public List<CompanyDTO> addCompany(List<CompanyDTO> list) {
		System.out.println("Enter company name");
		cDto.setCompanyName(DataStructureUtility.stringInput());
		System.out.println("Enter number of share");
		cDto.setNoOfShare(Utility.integerInput());
		System.out.println("Enter price of each share");
		cDto.setPrice(Utility.doubleInput());
		// add object into list
		list.add(cDto);
		// return list object
		return list;
	}

	@Override
	// function to show all the company name
	public void showCompanies(List<CompanyDTO> list) {
		System.out.println("all available companies");
		for (CompanyDTO dto : list) {
			System.out.println(dto);
		}
	}

	@Override
	// to show all the customer of the particular company
	public void customerOf(List<CustomerDTO> list, String name) {
		System.out.println("All Customer of company " + name);
		for (CustomerDTO dto : list) {
			if (cDto.getCompanyName().equals(name))
				System.out.println(dto);
		}
	}

	@Override
	// To show the transaction of particular customer base on customer name
	public void transactionOf(List<TransectionDTO> list, String name) {
		System.out.println("All transaction of customer " + name);
		for (TransectionDTO dto : list) {
			if (dto.getCompanyName().equals(name))
				System.out.println(dto);
		}
	}

	@Override
	// to buy new share
	public List<TransectionDTO> buyShare(List<CompanyDTO> comList,
			List<TransectionDTO> tranList) throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("Enter company name");
		String comName = DataStructureUtility.stringInput();
		// search for company name 
		for (int i = 0; i < comList.size(); i++) {
			// if company name found than continue with the transaction 
			if (comList.get(i).getCompanyName().equals(comName)) {
				System.out.println("how many you want to buy");
				int share = Utility.integerInput();
				// added share into company share
				comList.get(i).setNoOfShare(comList.get(i).getNoOfShare() + share);
				// set value for transaction
				tDto.setCompanyName(comList.get(i).getCompanyName());
				tDto.setNoOfShare(share);
				tDto.setPrice(comList.get(i).getPrice());
				tDto.setDateTime(dtf.format(dateTime));
				controller.writeCompany(comList);
				// add object into list 
				tranList.add(tDto);
			}
			// if company name not found 
			else 
				System.out.println("Enter valid company name");
		}
		// return transaction list
		return tranList;
	}

	@Override
	// function for sell share
	public List<TransectionDTO> sellShare(List<CompanyDTO> comList, List<TransectionDTO> tranList) throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("Enter company name");
		String comName = DataStructureUtility.stringInput();
		// search for company 
		for (int i = 0; i < comList.size(); i++) {
			// if company found than continue with the function
			if(comList.get(i).getCompanyName().equals(comName)) {
				// check for number of company share
				System.out.println("total share of the company is "+comList.get(i).getNoOfShare());
				System.out.println("how many you want to sell");
				int share = Utility.integerInput();
				// if share is lesser than total company share than do transaction
				if(share >0 && share <= comList.get(i).getNoOfShare()) {
					// set new number of share 
					comList.get(i).setNoOfShare(comList.get(i).getNoOfShare() - share);
					// set transaction details
					tDto.setCompanyName(comList.get(i).getCompanyName());
					tDto.setNoOfShare(share);
					tDto.setPrice(comList.get(i).getPrice());
					tDto.setDateTime(dtf.format(dateTime));
					controller.writeCompany(comList);
					// add transaction into list
					tranList.add(tDto);
				}
				// if share is more than total company share
				else 
					System.out.println("Enter valid input");
			}
			// if company not found
			else {
				System.out.println("Enter valid company name");
			}
		}
		// return transaction
		return tranList;
	}
}