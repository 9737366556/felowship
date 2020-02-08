package com.bridgelabs.Oops.dataManagement;

import java.util.List;

import com.bridgelabs.Oops.dataManagement.controller.InventoryController;
import com.bridgelabs.Oops.dataManagement.dto.InventoryDto;
import com.bridgelabs.Oops.dataManagement.service.InventoryService;
import com.bridgelabs.utility.Utility;

/**
 * purpose : Main function of Inventory Management
 * 
 * @author Nikunj Balar
 *
 */
public class ModifyInventoryTester {
	public static void main(String[] args) {
		try {
			InventoryController controller = new InventoryController();
			InventoryService service = new InventoryService();
			int choice = 0;

			do {
				System.out.println("Chose from following option");
				System.out.println("1.AddInventory \t 2.RemoveInventory \t 3.CalculationInventory");
				List<InventoryDto> read = controller.readFile();
				choice = Utility.integerInput();
				if (choice <= 3 && choice >= 1) {

					switch (choice) {
					case 1:
						// for add inventory
						List<InventoryDto> list1 = service.addInventory(read);
						// write jsonFile
						controller.writeFile(list1);
						break;

					case 2:
						// for removing the inventory
						List<InventoryDto> list2 = service.removeInventory(read);
						// write jsonFile
						controller.writeFile(list2);
						break;

					case 3:
						// fot calculate total of inventory
						service.calculationInventory(read);
						break;
					}
				} else
					System.out.println("Enter valid input");
				System.out.println("For More transaction press 1 \t for exite press any key");
				int n = Utility.integerInput();
				if (n == 1)
					continue;
				else {
					System.out.println("thank you");
					break;
				}
			} while (choice <= 3 && choice >= 1);

		} catch (Exception e) {
			System.err.println("you have an Exception in main function of inventory management");
			System.out.println(e.getClass());
		}
	}
}
