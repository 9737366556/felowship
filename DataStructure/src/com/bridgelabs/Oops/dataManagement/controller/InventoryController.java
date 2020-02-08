package com.bridgelabs.Oops.dataManagement.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.bridgelabs.Oops.dataManagement.dto.InventoryDto;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Purpose : To control the flow of the data
 * 
 * @author Nikunj Balar
 *
 */
public class InventoryController {
	
	// helps to map the data with the jsonFile 
	static ObjectMapper mapper = new ObjectMapper();
	File file = new File(
			"/home/bridgeit/Desktop/BridgelabzNikunj/DataStructure/src/com/bridgelabs/Oops/dataManagement/inventoryManagemant.json");

	// to read data from inventory file
	public List<InventoryDto> readFile() throws IOException {
		List<InventoryDto> list = mapper.readValue(file, new TypeReference<List<InventoryDto>>() {});
		return list;
	}
	
	// For write data into inventory file
	public void writeFile(List<InventoryDto> list) throws JsonGenerationException, JsonMappingException, IOException   {
		mapper.writerWithDefaultPrettyPrinter().writeValue(file, list); 
	}
	
}
