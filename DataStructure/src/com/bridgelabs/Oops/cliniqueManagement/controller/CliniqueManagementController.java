package com.bridgelabs.Oops.cliniqueManagement.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.bridgelabs.Oops.cliniqueManagement.dto.AppointmentDTO;
import com.bridgelabs.Oops.cliniqueManagement.dto.DoctorsDTO;
import com.bridgelabs.Oops.cliniqueManagement.dto.PatientsDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CliniqueManagementController {

	static ObjectMapper mapper= new ObjectMapper(); 
	File apFile = new File("/home/bridgeit/Desktop/BridgelabzNikunj/DataStructure/src/com/bridgelabs/Oops/cliniqueManagement/appointment.json");
	File docFile = new File("/home/bridgeit/Desktop/BridgelabzNikunj/DataStructure/src/com/bridgelabs/Oops/cliniqueManagement/docList.json");
	File patFile = new File("/home/bridgeit/Desktop/BridgelabzNikunj/DataStructure/src/com/bridgelabs/Oops/cliniqueManagement/patList.json");

	public List<DoctorsDTO> readDocFile() throws IOException {
		List<DoctorsDTO> list = mapper.readValue(docFile, new TypeReference<List<DoctorsDTO>>() {
		});
		return list;
	}

	public void writeDocFile(List<DoctorsDTO> list) throws IOException {
		mapper.writerWithDefaultPrettyPrinter().writeValue(docFile, list);
	}
	
	public List<PatientsDTO> readPetFile() throws IOException {
		List<PatientsDTO> list = mapper.readValue(patFile, new TypeReference<List<PatientsDTO>>() {
		});
		return list;
	}
	
	public void writePatFile(List<PatientsDTO> list) throws IOException {
		mapper.writerWithDefaultPrettyPrinter().writeValue(patFile, list);
	}
	
	public List<AppointmentDTO> readApFile() throws IOException {
		List<AppointmentDTO> list = mapper.readValue(apFile, new TypeReference<List<AppointmentDTO>>() {
		});
		return list;
	}

	public void writeApFile(List<AppointmentDTO> list) throws IOException {
		mapper.writerWithDefaultPrettyPrinter().writeValue(apFile, list);
	}
}
