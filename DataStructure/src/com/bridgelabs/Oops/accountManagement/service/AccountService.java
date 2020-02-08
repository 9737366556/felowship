 package com.bridgelabs.Oops.accountManagement.service;

import java.util.List;

import com.bridgelabs.Oops.accountManagement.dto.AccountDTO;
import com.bridgelabs.utility.DataStructureUtility;
import com.bridgelabs.utility.Utility;


/**
 * Purpose : To do function of the project 
 * 
 * @author Nikunj Balar
 *
 */
public class AccountService {

	AccountDTO dto = new AccountDTO();
	// function for add new share
	public List<AccountDTO> addShare(List<AccountDTO> list) {
		try {
			System.out.println("Enter Share name");
			dto.setName(DataStructureUtility.stringInput());
			System.out.println("Enter number of share ");
			dto.setNumOfShare(Utility.integerInput());
			System.out.println("Enter share prise");
			dto.setPrise(Utility.doubleInput());
			list.add(dto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Share detailse added succesfully");
		return list;
	}

	// function to remove share base on name 
	public List<AccountDTO> removeShare(List<AccountDTO> list ,String name) {
		try {
			int i = 0;
			boolean find = false;
			for (AccountDTO iDTO : list) {
				if (iDTO.getName().equalsIgnoreCase(name)) {
					list.remove(i);
					find = true;
					System.out.println("inventory remove sucessfuly");
					break;
				}
				i++;
			}
			if (!find)
				System.out.println("inventory not found");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	// function to calculate the total price of share base on share name
	public double totalOfEachShare(List<AccountDTO> list , String name) {
		double totalOFShare=0.0;
		try {
			for (AccountDTO iDTO : list) {
				if (iDTO.getName().equalsIgnoreCase(name)) {
					totalOFShare= iDTO.getNumOfShare() * iDTO.getPrise();
				}
				else 
				System.out.println("Share not found");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return totalOFShare;
	}

	// function to calculate total share price of company 
	public double totalShareCapital(List<AccountDTO> list) {
		double shareCapital = 0.0;
		double total;
		try {
			for (AccountDTO dto : list) {
				total = dto.getNumOfShare() * dto.getPrise();
				shareCapital += total;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return shareCapital;
	}
}
