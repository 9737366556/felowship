package com.bridgelabs.Oops.commercialDataProcessing.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.bridgelabs.Oops.commercialDataProcessing.dto.CompanyDTO;
import com.bridgelabs.Oops.commercialDataProcessing.dto.CustomerDTO;
import com.bridgelabs.Oops.commercialDataProcessing.dto.TransectionDTO;
import com.bridgelabs.utility.DataStructureUtility;
import com.bridgelabs.utility.Utility;

/**
 * purpose : Implementation of method of service interface
 * 
 * @author Nikunj Balar
 *
 */
public class DataProcessingServiceImpl implements DataProcessingService {

	CompanyDTO dto = new CompanyDTO();

	@Override
	// for add company details 
	public List<CompanyDTO> addCompany(List<CompanyDTO> list) {
		System.out.println("Enter company name");
		dto.setCompanyName(DataStructureUtility.stringInput());
		System.out.println("Enter number of share");
		dto.setNoOfShare(Utility.integerInput());
		System.out.println("Enter price of each share");
		dto.setPrice(Utility.doubleInput());
		// add object into list
		list.add(dto);
		//return list object
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
			if (dto.getCompanyName().equals(name))
				System.out.println(dto);
		}
	}

	@Override
	// To show the transaction of particular customer base on customer name
	public void transactionOf(List<TransectionDTO> list, String name) {
		System.out.println("All transaction of customer " + name);
		for (TransectionDTO dto : list) {
			if (dto.getCusName().equals(name))
				System.out.println(dto);
		}
	}

	@Override
	// to buy new share
	public List<TransectionDTO> buyShare(List<CompanyDTO> comList, List<CustomerDTO> cusList,
			List<TransectionDTO> tranList) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Enter company name");
		String comName=DataStructureUtility.stringInput();
		for (int i = 0; i < comList.size(); i++) {
			if(comList.get(i).getCompanyName().equals(comName) == false) {
				System.out.println("Available share is "+comList.get(i).getNoOfShare());
				System.out.println("how many you want among them");
				int share= Utility.integerInput();
				if(comList.get(i).getNoOfShare() >= share && share > 0) {
					
				}
			}else {
				addCompany(comList);
				
			}
		}

		return tranList;
	}
}