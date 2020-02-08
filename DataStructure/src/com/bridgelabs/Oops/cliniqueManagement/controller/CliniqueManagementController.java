package com.bridgelabs.Oops.cliniqueManagement.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.bridgelabs.Oops.cliniqueManagement.dto.AppointmentDTO;
import com.bridgelabs.Oops.cliniqueManagement.dto.DoctorsDTO;
import com.bridgelabs.Oops.cliniqueManagement.dto.PatientsDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Purpose : To control the flow of the data
 * 
 * @author Nikunj Balar
 *
 */
public class CliniqueManagementController {

	// its help to mape the data with the property
	static ObjectMapper mapper = new ObjectMapper();
	File apFile = new File(
			"/home/bridgeit/Desktop/BridgelabzNikunj/DataStructure/src/com/bridgelabs/Oops/cliniqueManagement/appointment.json");
	File docFile = new File(
			"/home/bridgeit/Desktop/BridgelabzNikunj/DataStructure/src/com/bridgelabs/Oops/cliniqueManagement/docList.json");
	File patFile = new File(
			"/home/bridgeit/Desktop/BridgelabzNikunj/DataStructure/src/com/bridgelabs/Oops/cliniqueManagement/patList.json");

	// function to read doctor details file
	public List<DoctorsDTO> readDocFile() throws IOException {
		List<DoctorsDTO> list = mapper.readValue(docFile, new TypeReference<List<DoctorsDTO>>() {
		});
		return list;
	}

	// function to write doctor details file
	public void writeDocFile(List<DoctorsDTO> list) throws IOException {
		mapper.writerWithDefaultPrettyPrinter().writeValue(docFile, list);
	}

	// function to read patient details file
	public List<PatientsDTO> readPetFile() throws IOException {
		List<PatientsDTO> list = mapper.readValue(patFile, new TypeReference<List<PatientsDTO>>() {
		});
		return list;
	}

	// function to write patient details file
	public void writePatFile(List<PatientsDTO> list) throws IOException {
		mapper.writerWithDefaultPrettyPrinter().writeValue(patFile, list);
	}

	// function to read Appointment Details file
	public List<AppointmentDTO> readApFile() throws IOException {
		List<AppointmentDTO> list = mapper.readValue(apFile, new TypeReference<List<AppointmentDTO>>() {
		});
		return list;
	}

	// function to write Appointment details file
	public void writeApFile(List<AppointmentDTO> list) throws IOException {
		mapper.writerWithDefaultPrettyPrinter().writeValue(apFile, list);
	}
}
