package com.arpita.demo.creditcardws.model.interfaces;

import com.arpita.demo.creditcardws.model.CardDetails;

public interface CreditCard {
	
	boolean checkValidity(CardDetails cardDetails);
	void performTransaction(CardDetails carddetails);
}
