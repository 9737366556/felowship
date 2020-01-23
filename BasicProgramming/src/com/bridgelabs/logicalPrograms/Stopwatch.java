package com.bridgelabs.logicalPrograms;

import com.bridgelabs.utility.LogicalUtility;

/**
 * Purpose: To measuring the time that elapses between the start and end clicks.
 * 
 * @author Nikunj Balar
 *
 */
public class Stopwatch {
	public static void main(String[] args) {
		System.out.println("main function of Stopwatch class started");
		System.out.println("elapse time "+LogicalUtility.elapseStopwatch()); 
		System.out.println("main function of Stopwatch class ended");
	}
}
