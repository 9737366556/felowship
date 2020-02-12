package com.bridgelabs.Oops.cliniqueManagement.service;

import java.io.IOException;
import java.util.List;

import com.bridgelabs.Oops.cliniqueManagement.dto.AppointmentDTO;
import com.bridgelabs.Oops.cliniqueManagement.dto.DoctorsDTO;
import com.bridgelabs.Oops.cliniqueManagement.dto.PatientsDTO;

/**
 * purpose : To maintain functionality of the project
 * 
 * @author Nikunj Balar
 *
 */
public interface CliniqueService {

	//for add new doctor
	public List<DoctorsDTO> addDoctor(List<DoctorsDTO> list);
	
	// for add patient
	public List<PatientsDTO> addPatients(List<PatientsDTO> list);

	// for doctor details
	public void doctorDetails(List<DoctorsDTO> list);
	
	// for patient details
	public void patientDetails(List<PatientsDTO> list);
	
	// for take an appointment
	public List<AppointmentDTO> takeAppointment(List<AppointmentDTO> aList,List<DoctorsDTO> dList,List<PatientsDTO> pList) throws IOException;
	
	// print appointment details 
	public void appointmentDetails(List<AppointmentDTO> list , int patientID);
	
	// cancel appointment
	public List<AppointmentDTO> declineAppointment(List<AppointmentDTO> list , int patientID);
	
}
