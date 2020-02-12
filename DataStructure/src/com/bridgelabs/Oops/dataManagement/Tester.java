package com.bridgelabs.Oops.dataManagement;

import java.io.IOException;
import java.util.List;

import com.bridgelabs.Oops.dataManagement.controller.InventoryController;
import com.bridgelabs.Oops.dataManagement.dto.InventoryDto;

/**
 * purpose : Main function of Inventory Management 
 * 
 * @author Nikunj Balar
 *
 */
public class Tester {
	public static void main(String[] args) {

		InventoryController controller = new InventoryController();
		// read file and print all the data of different inventory
		try {
			List<InventoryDto> list = controller.readFile();
			for (InventoryDto iDTO : list) {
				System.out.println(iDTO);
				int total = (int) (iDTO.getQuantity() * iDTO.getPrice());
				System.out.println("total price for inventory = " + total);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
