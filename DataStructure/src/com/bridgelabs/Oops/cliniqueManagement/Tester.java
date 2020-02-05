package com.bridgelabs.Oops.cliniqueManagement;

import java.util.List;

import com.bridgelabs.Oops.cliniqueManagement.controller.CliniqueManagementController;
import com.bridgelabs.Oops.cliniqueManagement.dto.AppointmentDTO;
import com.bridgelabs.Oops.cliniqueManagement.dto.DoctorsDTO;
import com.bridgelabs.Oops.cliniqueManagement.dto.PatientsDTO;
import com.bridgelabs.Oops.cliniqueManagement.service.CliniqueService;
import com.bridgelabs.Oops.cliniqueManagement.service.CliniqueServiceImpl;
import com.bridgelabs.utility.Utility;

public class Tester {
	public static void main(String[] args) {
		try {
			CliniqueService service = new CliniqueServiceImpl();

			CliniqueManagementController controller = new CliniqueManagementController();

			int choise = 0;
			do {
				System.out.println("All doctor name");
				List<DoctorsDTO> dList = controller.readDocFile();
				for (DoctorsDTO dto : dList) 
					System.out.println(dto.getName());
				System.out.println("All patient name");
				List<PatientsDTO> pList = controller.readPetFile();
				for (PatientsDTO dto : pList) 
					System.out.println(dto.getName());
				System.out.println("All Apointment for doctor");
				List<AppointmentDTO> aList = controller.readApFile();
				for (AppointmentDTO dto : aList)
					System.out.println(dto.getDoctorName());
				System.out.println("chose from following");
				System.out.println(
						"1.AddDoctor \t2.AddPatient \t3.showDoctorsDetails \t4.showPatientsDetails \t5.TakeAppointment \n6.showAppointment \t7.declineAppointment");
				choise = Utility.integerInput();
				if (choise < 8 && choise > 0) {

					switch (choise) {
					case 1:
						List<DoctorsDTO> list1 = service.addDoctor(dList);
						controller.writeDocFile(list1);
						break;

					case 2:
						List<PatientsDTO> list2 = service.addPatients(pList);
						controller.writePatFile(list2);
						break;

					case 3:
						System.out.println("Details of Doctors are as follow");
						service.doctorDetails(dList);
						break;

					case 4:
						System.out.println("Details of Patients are as follow");
						service.patientDetails(pList);
						break;

					case 5:
						List<AppointmentDTO> list5 = service.takeAppointment(aList, dList ,pList);
						controller.writeApFile(list5);
						break;

					case 6:
						System.out.println("Enter pationtID");
						int patientID = Utility.integerInput();
						service.appointmentDetails(aList, patientID);
						break;

					case 7:
						System.out.println("Enter patientID");
						int patientId = Utility.integerInput();
						List<AppointmentDTO> list7=service.declineAppointment(aList, patientId);
						controller.writeApFile(list7);
						break;

					default:
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