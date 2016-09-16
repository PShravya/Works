package com.fii.ccapp.validation.model;

/**
 * @author Shravya Peddiraju 
 * Entity class of customer which contains all the
 * required properties of the customer.
 */
public class Customer {

	private String fName;
	private String lName;
	private String email;
	private String contact;
	private CreditCard card;

	public void setFName(String fName) {

		this.fName = fName;

	}

	public String getFname() {

		return fName;
	}

	public void setLName(String lName) {

		this.lName = lName;

	}

	public String getlname() {

		return lName;
	}

	public void setEmail(String email) {

		this.email = email;

	}

	public String getEmail() {

		return email;
	}

	public void setContact(String contact) {

		this.contact = contact;

	}

	public String getContact() {

		return contact;
	}

	public CreditCard getCard() {
		return card;
	}

	public void setCard(CreditCard card) {
		this.card = card;
	}
}
