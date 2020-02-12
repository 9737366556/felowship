package com.bridgelabs.Oops;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDemo {
	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		FileReader read;
		try {
			read = new FileReader("/home/bridgeit/Desktop/BridgelabzNikunj/DataStructure/src/com/bridgelabs/Oops/dataManagement/dataManagement.json");

			Object obj=parser.parse(read);
			
			JSONArray list=(JSONArray)obj;
			System.out.println(list);
			
			list.forEach(emp -> parseObject((JSONObject)emp));

		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	static void parseObject(JSONObject employe) {
	 
		JSONObject obj= (JSONObject) employe.get("employee");
		
		String firstName=(String) obj.get("firstName");
		System.out.println(firstName);
		
		String lastName= (String)obj.get("lastName");
		System.out.println(lastName);
		
		String website = (String)obj.get("website");
		System.out.println(website);
	}
}
