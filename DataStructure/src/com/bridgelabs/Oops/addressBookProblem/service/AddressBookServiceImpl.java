package com.bridgelabs.Oops.addressBookProblem.service;

import java.util.List;

import com.bridgelabs.Oops.addressBookProblem.dto.AddressBookDTO;
import com.bridgelabs.utility.DataStructureUtility;
import com.bridgelabs.utility.Utility;

/**
 * purpose : Implementation of method of service interface
 * 
 * @author Nikunj Balar
 *
 */
public class AddressBookServiceImpl implements AddressBookService {

	AddressBookDTO dto = new AddressBookDTO();

	@Override
	// add new address
	public List<AddressBookDTO> addAddress(List<AddressBookDTO> list) {
		try {
			System.out.println("Enter First name");
			cDto.setfName(DataStructureUtility.stringInput());
			System.out.println("Enter Last name");
			cDto.setlName(DataStructureUtility.stringInput());
			System.out.println("Enter address");
			cDto.setAddress(DataStructureUtility.stringInput());
			System.out.println("Enter city name");
			cDto.setCity(DataStructureUtility.stringInput());
			System.out.println("Enter state name");
			cDto.setState(DataStructureUtility.stringInput());
			System.out.println("Enter pincode");
			cDto.setZip(Utility.integerInput());
			System.out.println("Enter your phone number");
			cDto.setNumber(DataStructureUtility.longInput());
			list.add(cDto);
			System.out.println(cDto);
		} catch (Exception e) {
			System.err.println("you have an exception in addAddress function of AddressBookServiceImpl" + e.getClass());
			System.err.println(e.getMessage());
		}
		System.out.println("Address added sucessfully");
		return list;
	}

	@Override
	// remove address from list base on name
	public List<AddressBookDTO> removeShare(List<AddressBookDTO> list, String name) {
		try {
			int i = 0;
			boolean find = false;
			for (AddressBookDTO iDTO : list) {
				if (iDTO.getfName().equalsIgnoreCase(name)) {
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
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return list;
	}

	@Override
	// edit address base on name
	public List<AddressBookDTO> editAddress(List<AddressBookDTO> list, String name) {
		for (AddressBookDTO dto : list) {
			if (cDto.getfName().equalsIgnoreCase(name)) {
				System.out.println("Address found ... ");
				int choise = 0;
				do {
					System.out.println("what you want to change");
					System.out.println("1.lastName \t 2.Address \t 3.city \t 4.state \t 5.pincode \t 6.number ");
					choise = Utility.integerInput();

					switch (choise) {
					case 1:
						// edit last name
						System.out.println("Enter last name");
						cDto.setlName(DataStructureUtility.stringInput());
						break;

					case 2:
						// edit address
						System.out.println("Enter address");
						cDto.setAddress(DataStructureUtility.stringInput());
						break;

					case 3:
						// Edit city name 
						System.out.println("Enter city name");
						cDto.setCity(DataStructureUtility.stringInput());
						break;

					case 4:
						// Edit state name
						System.out.println("Enter state name");
						cDto.setState(DataStructureUtility.stringInput());
						break;

					case 5:
						// edit pincod 
						System.out.println("Enter pincode number");
						cDto.setZip(Utility.integerInput());
						break;

					case 6:
						// Edit number
						System.out.println("Enter number");
						cDto.setNumber(DataStructureUtility.longInput());
						break;

					default:
						System.out.println("no such case found");
						break;
					}
				} while (choise > 0 && choise < 7);
			}
		}
		return list;
	}

	public void showAddress(List<AddressBookDTO> list, String name) {
		for (AddressBookDTO dto : list) {
			if (cDto.getfName().equalsIgnoreCase(name)) {
				System.out.println(cDto);
				break;
			}
		}
	}

	@Override
	// function for sort by zip code
	public List<AddressBookDTO> sortByZip(List<AddressBookDTO> list) {

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).getZip() > list.get(j).getZip()) {
					AddressBookDTO temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		return list;
	}

	@Override
	// sort by last name
	public List<AddressBookDTO> sortByLName(List<AddressBookDTO> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).getlName().compareTo(list.get(j).getlName()) < 0) {
					AddressBookDTO temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}else if(list.get(i).getlName().equals(list.get(j).getlName())) {
					if(list.get(i).getfName().compareTo(list.get(j).getfName()) <0) {
						AddressBookDTO temp = list.get(i);
						list.set(i, list.get(j));
						list.set(j, temp);
					}
				}
			}
		}
		return list;
	}
}