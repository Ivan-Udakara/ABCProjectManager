package com.abc.app.model;

public class EmployeeModel {
	private int id;
	private String firstName;
	private String lastName;
	private String gender;
	private String residentialAddress;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the residentialAddress
	 */
	public String getResidentialAddress() {
		return residentialAddress;
	}

	/**
	 * @param residentialAddress
	 *            the residentialAddress to set
	 */
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
}
