package com.bridgelabs.Oops.addressBookProblem;

import java.util.List;

import com.bridgelabs.Oops.addressBookProblem.controller.AddressBookController;
import com.bridgelabs.Oops.addressBookProblem.dto.AddressBookDTO;
import com.bridgelabs.Oops.addressBookProblem.service.AddressBookService;
import com.bridgelabs.Oops.addressBookProblem.service.AddressBookServiceImpl;
import com.bridgelabs.utility.DataStructureUtility;
import com.bridgelabs.utility.Utility;

public class Test {

	public static void main(String[] args) {
		try {
			AddressBookService service = new AddressBookServiceImpl();
			AddressBookController controller = new AddressBookController();

			int choise = 0;
			do {
				System.out.println("Exesting Address");
				List<AddressBookDTO> list = controller.readFile();
				for (AddressBookDTO adto : list) {
					System.out.println(adto.getfName());
				}
				
				System.out.println("chose from following");
				System.out.println("1.Add Address \t 2.Delet Address \t 3.Edit Address \t 4.showAddress \t 5.sortByPincode \t 6.sortByLname");
				choise = Utility.integerInput();
				if (choise > 0 && choise < 7) {
					switch (choise) {
					case 1:
						List<AddressBookDTO> list1 = service.addAddress(list);
						controller.writeFile(list1);
						break;

					case 2:
						System.out.println("Enter name you want to delet");
						String name = DataStructureUtility.stringInput();
						List<AddressBookDTO> list2 = service.removeShare(list , name);
						controller.writeFile(list2);
						break;

						
					case 3:
						System.out.println("Enter name that you want to Edit");
						String remove = DataStructureUtility.stringInput();
						List <AddressBookDTO> list3 = service.editAddress(list , remove);
						controller.writeFile(list3);
						break;
						
					case 4:
						System.out.println("Enter name that you want to show address");
						String fName = DataStructureUtility.stringInput();
						service.showAddress(list, fName);
						break;
					
					case 5:
						List<AddressBookDTO> list4=service.sortByZip(list);
						controller.writeFile(list4);
						break;
						
					case 6:
						List<AddressBookDTO> list5=service.sortByLName(list);
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
