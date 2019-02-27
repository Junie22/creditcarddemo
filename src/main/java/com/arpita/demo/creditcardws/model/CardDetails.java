package com.arpita.demo.creditcardws.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CardDetails {
	
	//public enum CARD_TYPES { MASTERCARD, VISACARD }

	private String cardNumber;
	private String csvNumber;
	private String nameOnCard;
	//private CARD_TYPES typeOfCard;

	public CardDetails(String cardNumber, String csvNumber, String nameOnCard) {
		super();
		this.cardNumber = cardNumber;
		this.csvNumber = csvNumber;
		this.nameOnCard = nameOnCard;
	}
	
	public CardDetails() {
		
	}
	

	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCsvNumber() {
		return csvNumber;
	}
	public void setCsvNumber(String csvNumber) {
		this.csvNumber = csvNumber;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	/*
	 * public CARD_TYPES getTypeOfCard() { return typeOfCard; }
	 * 
	 * public void setTypeOfCard(CARD_TYPES typeOfCard) { this.typeOfCard =
	 * typeOfCard; }
	 */
}
