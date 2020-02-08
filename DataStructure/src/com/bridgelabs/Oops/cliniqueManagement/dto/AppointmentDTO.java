package com.bridgelabs.Oops.cliniqueManagement.dto;

/**
 * purpose : To transfer the data from server to the jsonFile
 * 
 * @author Nikunj Balar
 *
 */
public class AppointmentDTO {

	public String doctorName;
	public int patientId;
	public String patientName;
	public String doctorSpecialization;
	public String doctorAvailability;
	public int doctorAppointment;
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}
	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}
	public String getDoctorAvailability() {
		return doctorAvailability;
	}
	public void setDoctorAvailability(String doctorAvailability) {
		this.doctorAvailability = doctorAvailability;
	}
	public int getDoctorAppointment() {
		return doctorAppointment;
	}
	public void setDoctorAppointment(int doctorAppointment) {
		this.doctorAppointment = doctorAppointment;
	}
	@Override
	public String toString() {
		return "AppointmentDTO [doctorName=" + doctorName + ", patientId=" + patientId + ", patientName=" + patientName
				+ ", doctorSpecialization=" + doctorSpecialization + ", doctorAvailability=" + doctorAvailability
				+ ", doctorAppointment=" + doctorAppointment + "]";
	}
	
}
