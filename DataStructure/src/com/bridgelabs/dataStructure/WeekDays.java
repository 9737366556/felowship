package com.bridgelabs.dataStructure;

import com.bridgelabs.utility.DataStructureUtility;
import com.bridgelabs.utility.QueueLinkedList;

public class WeekDays {
	public static void main(String[] args) {
		int week=2;
		int month=1;
		int year=2020;
		
		
		QueueLinkedList queue=DataStructureUtility.weekDays( month, year);
	
		DataStructureUtility.printCalender(week ,queue);
		
		
		
	}
}
