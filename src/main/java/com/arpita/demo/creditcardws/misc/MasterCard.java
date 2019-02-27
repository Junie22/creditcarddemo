package com.arpita.demo.creditcardws.misc;

import com.arpita.demo.creditcardws.model.CardDetails;
import com.arpita.demo.creditcardws.model.interfaces.CreditCard;

public class MasterCard implements CreditCard {
	
	@Override
	public boolean checkValidity(CardDetails cardDetails) {
		
		if(cardDetails != null && cardDetails.getCardNumber() != null) {
			return true;
		}
		
		return false;
	}

	@Override
	public void performTransaction(CardDetails carddetails) {

		//write back to the DB
		System.out.println("Write back to Master Card DB");
	}

}
