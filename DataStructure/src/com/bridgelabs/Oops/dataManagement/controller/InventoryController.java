package com.bridgelabs.Oops.dataManagement.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.bridgelabs.Oops.dataManagement.dto.InventoryDto;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InventoryController {
	
	static ObjectMapper mapper = new ObjectMapper();
	File file = new File(
			"/home/bridgeit/Desktop/BridgelabzNikunj/DataStructure/src/com/bridgelabs/Oops/dataManagement/inventoryManagemant.json");

	public List<InventoryDto> readFile() throws IOException {

		List<InventoryDto> list = mapper.readValue(file, new TypeReference<List<InventoryDto>>() {});

		return list;
	}
	
	public void writeFile(List<InventoryDto> list) throws JsonGenerationException, JsonMappingException, IOException   {
		mapper.writerWithDefaultPrettyPrinter().writeValue(file, list); 
	}
	
}
