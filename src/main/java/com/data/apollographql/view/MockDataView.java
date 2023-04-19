package com.data.apollographql.view;

import java.util.List;

public class MockDataView {

	private int id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String state;
	private List<Prescriptions> prescriptions;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<Prescriptions> getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(List<Prescriptions> prescriptions) {
		this.prescriptions = prescriptions;
	}

}
