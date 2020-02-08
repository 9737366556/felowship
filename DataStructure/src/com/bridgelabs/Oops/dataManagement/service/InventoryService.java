package com.bridgelabs.Oops.dataManagement.service;

import java.util.List;
import java.util.Scanner;

import com.bridgelabs.Oops.dataManagement.dto.InventoryDto;
import com.bridgelabs.utility.Utility;

/**
 * purpose : To maintain functionality of the project
 * 
 * @author Nikunj Balar
 *
 */
public class InventoryService {
	Scanner s = new Scanner(System.in);
	InventoryDto dto = new InventoryDto();

	// for add new inventory
	public List<InventoryDto> addInventory(List<InventoryDto> list) {
		try {
			System.out.println("Enter Name of inventory");
			dto.setName(s.nextLine());
			System.out.println("Enter price of inventory per kg");
			dto.setPrice(Utility.doubleInput());
			System.out.println("Enter quantity of inventory in kg");
			dto.setQuantity(Utility.integerInput());
			// add inventory into list
			list.add(dto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("inventory added successfully");
		// return list of inventory object
		return list;
	}

	// function to remove inventory 
	public List<InventoryDto> removeInventory(List<InventoryDto> list) {
		try {
			// printing all inventory name
			for (InventoryDto iDTO : list) {
				System.out.println(iDTO.getName());
			}
			// remove inventory based on Name of inventory
			int i = 0;
			boolean find = false;
			System.out.println("Enter Name of inventory that you want to remove");
			String name = s.nextLine();
			for (InventoryDto iDTO : list) {
				// if inventory found than remove it
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
		// return list object
		return list;
	}
	 
	// function for calculate particular inventory total price 
	public void calculationInventory(List<InventoryDto> list) {
		try {
			// printing all the name of the inventory
			for (InventoryDto iDTO : list) {
				System.out.println(iDTO.getName());
			}
			// calculate inventory total price
			System.out.println("Enter name of inventory that you want to calculate");
			String name = s.nextLine();

			for (InventoryDto iDTO : list) {
				if (iDTO.getName().equalsIgnoreCase(name)) {
					int total = (int) iDTO.getPrice() * iDTO.getQuantity();
					System.out.println("Total of " + iDTO.getName() + " inventory is " + total);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}