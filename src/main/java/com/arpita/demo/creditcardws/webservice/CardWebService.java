package com.arpita.demo.creditcardws.webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.arpita.demo.creditcardws.model.CardDetails;


@Path("/pay")
public class CardWebService {
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void payByCreditCard(CardDetails test) {

		System.out.println( " ----- " + test);
		
		//CardDetails cardDetails System.out.println(cardCompany + " -> " + cardDetails.getCardNumber());		
	}
	
	
	@GET
	public String getDefault() {
		return "testinggggg";
	}

}
