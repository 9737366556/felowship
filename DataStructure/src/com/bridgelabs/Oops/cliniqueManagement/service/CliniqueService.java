package com.bridgelabs.Oops.cliniqueManagement.service;

import java.io.IOException;
import java.util.List;

import com.bridgelabs.Oops.cliniqueManagement.dto.AppointmentDTO;
import com.bridgelabs.Oops.cliniqueManagement.dto.DoctorsDTO;
import com.bridgelabs.Oops.cliniqueManagement.dto.PatientsDTO;

public interface CliniqueService {

	public List<DoctorsDTO> addDoctor(List<DoctorsDTO> list);
	
	public List<PatientsDTO> addPatients(List<PatientsDTO> list);

	public void doctorDetails(List<DoctorsDTO> list);
	
	public void patientDetails(List<PatientsDTO> list);
	
	public List<AppointmentDTO> takeAppointment(List<AppointmentDTO> aList,List<DoctorsDTO> dList,List<PatientsDTO> pList) throws IOException;
	
	public void appointmentDetails(List<AppointmentDTO> list , int patientID);
	
	public List<AppointmentDTO> declineAppointment(List<AppointmentDTO> list , int patientID);
	
}
