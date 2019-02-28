package com.arpita.demo.creditcardws.service;

import com.arpita.demo.creditcardws.interfaces.CreditCard;
import com.arpita.demo.creditcardws.model.CardDetails;

public class CreditCardService {

	
	public void payByCreditCard(CreditCard cardCompany, CardDetails cardInfo) {
		
		//call the corresponding credit card to do the transaction
		if (cardCompany.checkValidity(cardInfo)) {
			cardCompany.performTransaction(cardInfo);
		}
	}
	
}
