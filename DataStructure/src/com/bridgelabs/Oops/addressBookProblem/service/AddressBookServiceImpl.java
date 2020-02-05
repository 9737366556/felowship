package com.bridgelabs.Oops.addressBookProblem.service;

import java.util.List;

import com.bridgelabs.Oops.addressBookProblem.dto.AddressBookDTO;
import com.bridgelabs.utility.DataStructureUtility;
import com.bridgelabs.utility.Utility;

public class AddressBookServiceImpl implements AddressBookService {

	AddressBookDTO dto = new AddressBookDTO();

	@Override
	public List<AddressBookDTO> addAddress(List<AddressBookDTO> list) {
		try {
			System.out.println("Enter First name");
			dto.setfName(DataStructureUtility.stringInput());
			System.out.println("Enter Last name");
			dto.setlName(DataStructureUtility.stringInput());
			System.out.println("Enter address");
			dto.setAddress(DataStructureUtility.stringInput());
			System.out.println("Enter city name");
			dto.setCity(DataStructureUtility.stringInput());
			System.out.println("Enter state name");
			dto.setState(DataStructureUtility.stringInput());
			System.out.println("Enter pincode");
			dto.setZip(Utility.integerInput());
			System.out.println("Enter your phone number");
			dto.setNumber(DataStructureUtility.longInput());
			list.add(dto);
			System.out.println(dto);
		} catch (Exception e) {
			System.err.println("you have an exception in addAddress function of AddressBookServiceImpl" + e.getClass());
			System.err.println(e.getMessage());
		}
		System.out.println("Address added sucessfully");
		return list;
	}

	@Override
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
	public List<AddressBookDTO> editAddress(List<AddressBookDTO> list, String name) {
		for (AddressBookDTO dto : list) {
			if (dto.getfName().equalsIgnoreCase(name)) {
				System.out.println("Address found ... ");
				int choise = 0;
				do {
					System.out.println("what you want to change");
					System.out.println("1.lastName \t 2.Address \t 3.city \t 4.state \t 5.pincode \t 6.number ");
					choise = Utility.integerInput();

					switch (choise) {
					case 1:
						System.out.println("Enter last name");
						dto.setlName(DataStructureUtility.stringInput());
						break;

					case 2:
						System.out.println("Enter address");
						dto.setAddress(DataStructureUtility.stringInput());
						break;

					case 3:
						System.out.println("Enter city name");
						dto.setCity(DataStructureUtility.stringInput());
						break;

					case 4:
						System.out.println("Enter state name");
						dto.setState(DataStructureUtility.stringInput());
						break;

					case 5:
						System.out.println("Enter pincode number");
						dto.setZip(Utility.integerInput());
						break;

					case 6:
						System.out.println("Enter number");
						dto.setNumber(DataStructureUtility.longInput());
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
			if (dto.getfName().equalsIgnoreCase(name)) {
				System.out.println(dto);
				break;
			}
		}
	}

	@Override
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