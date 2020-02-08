package com.bridgelabs.Oops.addressBookProblem;

import java.util.List;

import com.bridgelabs.Oops.addressBookProblem.controller.AddressBookController;
import com.bridgelabs.Oops.addressBookProblem.dto.AddressBookDTO;
import com.bridgelabs.Oops.addressBookProblem.service.AddressBookService;
import com.bridgelabs.Oops.addressBookProblem.service.AddressBookServiceImpl;
import com.bridgelabs.utility.DataStructureUtility;
import com.bridgelabs.utility.Utility;

/**
 * purpose : main function of address book
 * 
 * @author Nikunj Balar
 *
 */
public class Test {

	public static void main(String[] args) {
		try {
			AddressBookService service = new AddressBookServiceImpl();
			AddressBookController controller = new AddressBookController();

			int choise = 0;
			do {
				// showing all exesting address
				System.out.println("Exesting Address");
				List<AddressBookDTO> list = controller.readFile();
				for (AddressBookDTO adto : list) {
					System.out.println(adto.getfName());
				}

				System.out.println("chose from following");
				System.out.println(
						"1.Add Address \t 2.Delet Address \t 3.Edit Address \t 4.showAddress \t 5.sortByPincode \t 6.sortByLname");
				choise = Utility.integerInput();
				if (choise > 0 && choise < 7) {
					switch (choise) {
					case 1:
						// function to add new address
						List<AddressBookDTO> list1 = service.addAddress(list);
						// function for write json file
						controller.writeFile(list1);
						break;

					case 2:
						System.out.println("Enter name you want to delet");
						String name = DataStructureUtility.stringInput();
						// function to delete address
						List<AddressBookDTO> list2 = service.removeShare(list, name);
						// function for write json file
						controller.writeFile(list2);
						break;

					case 3:
						System.out.println("Enter name that you want to Edit");
						String remove = DataStructureUtility.stringInput();
						// function for edit address
						List<AddressBookDTO> list3 = service.editAddress(list, remove);
						// function for write json file
						controller.writeFile(list3);
						break;

					case 4:
						System.out.println("Enter name that you want to show address");
						String fName = DataStructureUtility.stringInput();
						// function for show perticular address
						service.showAddress(list, fName);
						break;

					case 5:
						// function to sort all the address base on pincode 
						List<AddressBookDTO> list4 = service.sortByZip(list);
						// function for write json file
						controller.writeFile(list4);
						break;

					case 6:
						// function to sort all address base on last name
						List<AddressBookDTO> list5 = service.sortByLName(list);
						// function for write json file
						controller.writeFile(list5);
						break;

					default:
						System.out.println("no such case found");
						break;
					}
				} else
					System.out.println("Enter valid choise");

			} while (choise < 7 && choise > 0);

		} catch (Exception e) {
			System.err.println("you have an exception in " + e.getClass());
		}
	}
}
