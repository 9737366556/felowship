package com.bridgelabs.Oops.accountManagement;

import java.util.List;

import com.bridgelabs.Oops.accountManagement.controller.AccountController;
import com.bridgelabs.Oops.accountManagement.dto.AccountDTO;
import com.bridgelabs.Oops.accountManagement.service.AccountService;
import com.bridgelabs.utility.DataStructureUtility;
import com.bridgelabs.utility.Utility;

/**
 * Purpose : Main function of accountManagement
 * 
 * @author Nikunj Balar
 *
 */
public class Tester {
	public static void main(String[] args) {
		try {
			AccountDTO dto = new AccountDTO();
			AccountService service = new AccountService();
			AccountController controller = new AccountController();
			int choise = 0;
			do {
				// printing all share name
				System.out.println("Your Share name ");
				List<AccountDTO> list = controller.readFile();
				for (AccountDTO iDTO : list) {
					System.out.println(iDTO.getName());
				}
				System.out.println("chose from following");
				System.out.println("1.Add Share \t 2.Remove Share \t 3.Total Each Share \t 4.Total ShareCapital");
				choise = Utility.integerInput();
				if (choise > 0 && choise < 5) {
					switch (choise) {
					case 1:
						// case for add share into list
						List<AccountDTO> list1 = service.addShare(list);
						// function for write json file
						controller.writeFile(list1);
						break;

					case 2:
						System.out.println("Enter Name of share that you want to remove");
						String sName = DataStructureUtility.stringInput();
						// function for delete share base on name of share
						List<AccountDTO> list2 = service.removeShare(list, sName);
						// function for write json file
						controller.writeFile(list2);
						break;

					case 3:
						System.out.println("Enter name of inventory that you want to calculate");
						String name = DataStructureUtility.stringInput();
						// function for calculate each share base on name 
						double totalOFShare = service.totalOfEachShare(list, name);
						System.out.println("your total of " + name + " shares price is " + totalOFShare);
						break;

					case 4:
						// calculate total share capital of the company
						double totalShareCapital = service.totalShareCapital(list);
						System.out.println("Your total share capital is " + totalShareCapital);
						break;

					}
				} else
					System.out.println("Enter valid option");

			} while (choise < 5);
		} catch (Exception e) {
			System.err.println(e.getClass());
			System.err.println("you have an Exception in main function of class Tester ");
		}
	}
}
