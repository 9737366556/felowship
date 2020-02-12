package com.bridgelabs.Oops.commercialDataProcessing;

import java.util.List;

import com.bridgelabs.Oops.commercialDataProcessing.controller.CommercialController;
import com.bridgelabs.Oops.commercialDataProcessing.dto.CompanyDTO;
import com.bridgelabs.Oops.commercialDataProcessing.dto.CustomerDTO;
import com.bridgelabs.Oops.commercialDataProcessing.dto.TransectionDTO;
import com.bridgelabs.Oops.commercialDataProcessing.service.DataProcessingService;
import com.bridgelabs.Oops.commercialDataProcessing.service.DataProcessingServiceImpl;
import com.bridgelabs.utility.DataStructureUtility;
import com.bridgelabs.utility.Utility;

/**
 * purpose : Main function of commercialData processor 
 * 
 * @author Nikunj Balar
 *
 */
public class Tester {
	public static void main(String[] args) {
		try {
			CommercialController controller = new CommercialController();
			DataProcessingService service = new DataProcessingServiceImpl();

			int choise = 0;
			do {
				// printing all company name
				System.out.println("all company name");
				List<CompanyDTO> comList = controller.readCompany();
				for (CompanyDTO comDTO : comList)
					System.out.println(comDTO.getCompanyName());
				// printing all customer name 
				System.out.println("All customer ");
				List<CustomerDTO> cusList = controller.readCustomer();
				for (CustomerDTO cusDTO : cusList)
					System.out.println(cusDTO.getCusName());
				// printing all transaction 
				System.out.println("All Transaction of company");
				List<TransectionDTO> tranList = controller.readTransaction();
				for (TransectionDTO traDTO : tranList)
					System.out.println(traDTO.getCompanyName());
				System.out.println("chose from following choise");
				System.out.println(
						"1.addCompany \t2.Show all Company details \t3.transaction of customer \t4.customer of company \t5.buyshare \t6.sellshare");
				choise = Utility.integerInput();
				if (choise > 0 && choise < 7) {
					switch (choise) {
					case 1:
						// function to add company details 
						List<CompanyDTO> list1 = service.addCompany(comList);
						// write company file
						controller.writeCompany(list1);
						break;

					case 2:
						// show all company 
						service.showCompanies(comList);
						break;

					case 3:
						// showing transaction of particular customer
						System.out.println("Enter customer name");
						String cusName = DataStructureUtility.stringInput();
						service.transactionOf(tranList, cusName);
						break;

					case 4:
						// showing all the customer of company
						System.out.println("Enter company name");
						String comName = DataStructureUtility.stringInput();
						service.customerOf(cusList, comName);
						break;

					case 5:
						// for buy new sahre
						List<TransectionDTO > list5 = service.buyShare(comList, tranList);
						controller.writeTransaction(list5);
						break;
						
					case 6 :
						// for sell share
						List<TransectionDTO> list6= service.sellShare(comList, tranList);
						controller.writeTransaction(list6);
						break;
					}
				} else
					System.out.println("Enter valid choise");

			} while (choise > 0 && choise < 7);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("you have an Exception in " + e.getClass());
		}
	}
}
