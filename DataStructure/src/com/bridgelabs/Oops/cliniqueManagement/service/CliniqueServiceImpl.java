package com.bridgelabs.Oops.cliniqueManagement.service;

import java.io.IOException;
import java.util.List;

import com.bridgelabs.Oops.cliniqueManagement.controller.CliniqueManagementController;
import com.bridgelabs.Oops.cliniqueManagement.dto.AppointmentDTO;
import com.bridgelabs.Oops.cliniqueManagement.dto.DoctorsDTO;
import com.bridgelabs.Oops.cliniqueManagement.dto.PatientsDTO;
import com.bridgelabs.utility.DataStructureUtility;
import com.bridgelabs.utility.Utility;

/**
 * purpose : Implementation of method of service interface
 * 
 * @author Nikunj Balar
 *
 */
public class CliniqueServiceImpl implements CliniqueService {

	DoctorsDTO doctor = new DoctorsDTO();
	PatientsDTO patient = new PatientsDTO();
	AppointmentDTO appointment = new AppointmentDTO();
	CliniqueManagementController controller = new CliniqueManagementController();

	@Override
	// for add new doctor
	public List<DoctorsDTO> addDoctor(List<DoctorsDTO> list) {
		try {
			System.out.println("Enter name of doctor");
			doctor.setName(DataStructureUtility.stringInput());
			System.out.println("Enter id of doctor");
			doctor.setId(Utility.integerInput());
			System.out.println("Enter Speciality of the doctor");
			doctor.setSpecialization(DataStructureUtility.stringInput());
			System.out.println("at what time doctor is available");
			System.out.println("1.AM \t 2.PM \t 3.both");
			int key = Utility.integerInput();
			if (key > 0 && key < 4) {
				switch (key) {
				case 1:
					doctor.setAvailability("AM");
					break;
				case 2:
					doctor.setAvailability("PM");
					break;
				case 3:
					doctor.setAvailability("both");
					break;
				}
			}
			// add details into list 
			list.add(doctor);
			System.out.println("Data added sucessfully ");
		} catch (Exception e) {
			System.out.println("you have an Exception in Service of " + e.getClass());
		}
		//return list object
		return list;
	}

	@Override
	// for add patient details
	public List<PatientsDTO> addPatients(List<PatientsDTO> list) {
		try {
			System.out.println("Enter name of patient");
			patient.setName(DataStructureUtility.stringInput());
			System.out.println("Enter id of patient");
			patient.setiD(Utility.integerInput());
			System.out.println("enter patient mobilenumber");
			patient.setMobileNumber(DataStructureUtility.longInput());
			System.out.println("enter age of patient");
			patient.setAge(Utility.integerInput());
			// adding details into list 
			list.add(patient);
			System.out.println("Data added sucessfully ");
		} catch (Exception e) {
			System.out.println(e.getClass());
		}
		// return list object
		return list;
	}

	@Override
	// function for print all the details of each doctor
	public void doctorDetails(List<DoctorsDTO> list) {
		for (DoctorsDTO doctor : list) {
			System.out.println(doctor);
		}
	}

	@Override
	// function for print all the details of each patient
	public void patientDetails(List<PatientsDTO> list) {
		for (PatientsDTO patients : list) {
			System.out.println(patients);
		}
	}

	@Override
	// function for print particular appointment details base on patient id
	public void appointmentDetails(List<AppointmentDTO> list, int patientID) {
		for (AppointmentDTO dto : list) {
			if (dto.getPatientId() == patientID) {
				System.out.println(dto);
			}
		}
	}

	@Override
	// cancel the appointment base on patient id
	public List<AppointmentDTO> declineAppointment(List<AppointmentDTO> list, int patientID) {
		int temp = 0;
		for (AppointmentDTO dto : list) {
			if (dto.getPatientId() == patientID) {
				System.out.println(dto);
				// for conformation of cancel appointment 
				System.out.println("you want to reject your appointment that press 1 else press any number");
				int n = Utility.integerInput();
				if (n == 1) {
					//remove that appointment
					list.remove(temp);
				}
				temp++;
			}
		}
		// return updated list
		return list;
	}

	@Override
	// for taking new appointment 
	public List<AppointmentDTO> takeAppointment(List<AppointmentDTO> aList, List<DoctorsDTO> dList,
			List<PatientsDTO> pList) throws IOException {
		int count, n = 0;
		int[] ar = new int[dList.size()];
		// counting each doctor total appointment for a day 
		for (int i = 0; i < dList.size(); i++) {
			count = 0;
			for (int j = 0; j < aList.size(); j++) {
				if (dList.get(i).getName().equals(aList.get(j).getDoctorName())) {
					count++;
				}
			}
			ar[i] = count;
		}
		// for finding doctor is available or not 
		// if available than giving appointment
		System.out.println("Enter Doctorname");
		String name = DataStructureUtility.stringInput();
		for (int i = 0; i < dList.size(); i++) {
			// check doctor is in list of the doctor list or not
			if (dList.get(i).getName().equals(name)) {
				// if doctor found than check there availability
				if (ar[i] < 5) {
					appointment.setDoctorName(name);
					System.out.println("Enter patient name ");
					String pName = DataStructureUtility.stringInput();
					// check patient are in lists or not
					for (int j = 0; j < pList.size(); j++) {
						// if patient found 
						if (pList.get(j).getName().equals(pName)) {
							appointment.setPatientName(pName);
							appointment.setPatientId(pList.get(j).getiD());
							n++;
						}
					}
					//if patient not fount
					if (n == 0) {
						// add patient details
						List<PatientsDTO> list = addPatients(pList);
						appointment.setPatientId(list.get(0).getiD());
						appointment.setPatientName(list.get(0).getName());
						controller.writePatFile(list);
					}
					appointment.setDoctorSpecialization(dList.get(i).getSpecialization());
					appointment.setDoctorAvailability(dList.get(i).getAvailability());
					appointment.setDoctorAppointment(ar[i] + 1);
					// add appointment details into list
					aList.add(appointment);
				} else
					System.out.println("doctor is not free today");
			}
		}
		//return appoint list
		return aList;
	}
}
