package com.fii.ccapp.validation.model;

/**
 * @author Shravya Peddiraju
 */
public class CreditCard {

	private String cardNumber, nameOnCard, ssn, cvv;
	private CreditCard card;

	public void setcardNumber(String cardNumber) {

		this.cardNumber = cardNumber;
	}

	public String getcardNumber() {

		return cardNumber;
	}

	public void setNameOnCard(String nameOnCard) {

		this.nameOnCard = nameOnCard;
	}

	public String getNameOnCard() {

		return nameOnCard;
	}

	public void setSsn(String ssn) {

		this.ssn = ssn;
	}

	public String getSsn() {

		return ssn;
	}

	public void setCvv(String cvv) {

		this.cvv = cvv;
	}

	public String getCvv() {

		return cvv;
	}
}
