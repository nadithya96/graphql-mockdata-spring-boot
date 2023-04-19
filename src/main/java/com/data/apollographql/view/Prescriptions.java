package com.data.apollographql.view;

public class Prescriptions {

	private int id;
	private String name;
	private String prescribedDate;
	private String state;
	private int quantity;
	private int daySuppy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrescribedDate() {
		return prescribedDate;
	}

	public void setPrescribedDate(String prescribedDate) {
		this.prescribedDate = prescribedDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getDaySuppy() {
		return daySuppy;
	}

	public void setDaySuppy(int daySuppy) {
		this.daySuppy = daySuppy;
	}

}
