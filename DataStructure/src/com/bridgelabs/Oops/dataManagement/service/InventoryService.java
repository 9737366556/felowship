package com.bridgelabs.Oops.dataManagement.service;

import java.util.List;
import java.util.Scanner;

import com.bridgelabs.Oops.dataManagement.dto.InventoryDto;
import com.bridgelabs.utility.Utility;

public class InventoryService {
	Scanner s = new Scanner(System.in);
	InventoryDto dto = new InventoryDto();

	public List<InventoryDto> addInventory(List<InventoryDto> list) {
		try {
			System.out.println("Enter Name of inventory");
			dto.setName(s.nextLine());
			System.out.println("Enter price of inventory per kg");
			dto.setPrice(Utility.doubleInput());
			System.out.println("Enter quantity of inventory in kg");
			dto.setQuantity(Utility.integerInput());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		list.add(dto);
		System.out.println("inventory added successfully");

		return list;
	}

	public List<InventoryDto> removeInventory(List<InventoryDto> list) {
		try {
			for (InventoryDto iDTO : list) {
				System.out.println(iDTO.getName());
			}
			int i = 0;
			boolean find = false;
			System.out.println("Enter Name of inventory that you want to remove");
			String name = s.nextLine();
			for (InventoryDto iDTO : list) {
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

	public List<InventoryDto> calculationInventory(List<InventoryDto> list) {
		try {
			for (InventoryDto iDTO : list) {
				System.out.println(iDTO.getName());
			}
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

		return list;
	}
}
