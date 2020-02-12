package com.bridgelabs.Oops.cliniqueManagement;

import java.util.List;

import com.bridgelabs.Oops.cliniqueManagement.controller.CliniqueManagementController;
import com.bridgelabs.Oops.cliniqueManagement.dto.AppointmentDTO;
import com.bridgelabs.Oops.cliniqueManagement.dto.DoctorsDTO;
import com.bridgelabs.Oops.cliniqueManagement.dto.PatientsDTO;
import com.bridgelabs.Oops.cliniqueManagement.service.CliniqueService;
import com.bridgelabs.Oops.cliniqueManagement.service.CliniqueServiceImpl;
import com.bridgelabs.utility.Utility;

/**
 * purpose : Main function of CliniqueManagement 
 * 
 * @author Nikunj Balar
 *
 */
public class Tester {
	public static void main(String[] args) {
		try {
			CliniqueService service = new CliniqueServiceImpl();

			CliniqueManagementController controller = new CliniqueManagementController();

			int choise = 0;
			do {
				// showing all doctor name
				System.out.println("All doctor name");
				List<DoctorsDTO> dList = controller.readDocFile();
				for (DoctorsDTO dto : dList) 
					System.out.println(cDto.getName());
				// showing all patient name 
				System.out.println("All patient name");
				List<PatientsDTO> pList = controller.readPetFile();
				for (PatientsDTO dto : pList) 
					System.out.println(cDto.getName());
				// showing all appoint for doctor
				System.out.println("All Appointment for doctor");
				List<AppointmentDTO> aList = controller.readApFile();
				for (AppointmentDTO dto : aList)
					System.out.println(cDto.getDoctorName());
				System.out.println("chose from following");
				System.out.println(
						"1.AddDoctor \t2.AddPatient \t3.showDoctorsDetails \t4.showPatientsDetails \t5.TakeAppointment \n6.showAppointment \t7.declineAppointment");
				choise = Utility.integerInput();
				if (choise < 8 && choise > 0) {

					switch (choise) {
					case 1:
						// for add doctor 
						List<DoctorsDTO> list1 = service.addDoctor(dList);
						// write doctor file
						controller.writeDocFile(list1);
						break;

					case 2:
						// for add patient details
						List<PatientsDTO> list2 = service.addPatients(pList);
						// write patient file 
						controller.writePatFile(list2);
						break;

					case 3:
						//for print all the doctor name 
						System.out.println("Details of Doctors are as follow");
						service.doctorDetails(dList);
						break;

					case 4:
						// for print all the patient name
						System.out.println("Details of Patients are as follow");
						service.patientDetails(pList);
						break;

					case 5:
						// for take an appointment
						List<AppointmentDTO> list5 = service.takeAppointment(aList, dList ,pList);
						// write appointment file 
						controller.writeApFile(list5);
						break;

					case 6:
						// for printing appointment details base on patient id
						System.out.println("Enter pationtID");
						int patientID = Utility.integerInput();
						service.appointmentDetails(aList, patientID);
						break;

					case 7:
						// for cancel appointment
						System.out.println("Enter patientID");
						int patientId = Utility.integerInput();
						List<AppointmentDTO> list7=service.declineAppointment(aList, patientId);
						// write appointment file 
						controller.writeApFile(list7);
						break;

					}
				} else {
					System.out.println("Enter valid choise");
				}
			} while (choise > 0 && choise < 8);

		} catch (Exception e) {
			System.err.println(e.getClass());
		}
	}
}