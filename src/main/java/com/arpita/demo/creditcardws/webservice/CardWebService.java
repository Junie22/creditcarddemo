package com.arpita.demo.creditcardws.webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.arpita.demo.creditcardws.factory.CardFactory;
import com.arpita.demo.creditcardws.interfaces.CreditCard;
import com.arpita.demo.creditcardws.misc.MasterCard;
import com.arpita.demo.creditcardws.misc.VisaCard;
import com.arpita.demo.creditcardws.model.CardDetails;
import com.arpita.demo.creditcardws.service.CreditCardService;


@Path("/pay")
public class CardWebService {


	/* This is the sameple JSON String to enter in postman
	 * DONT use boomerang, somehow it was not working with POST JSON call
	 * 
	 * 
	 * Inside postman, use POST, this URL : http://localhost:8080/creditcardws/webapi/pay
	 * add in header: Content-Type value application/json
	 * and finally the following json data inside raw 
	 * {
		   "cardNumber" : "7668768687",
		   "csvNumber" : "886",
		   "nameOnCard" : "gvjhg"
		}
	 * 
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void payByCreditCard(CardDetails userCardDetails) {

		System.out.println(userCardDetails);
	}


	@GET
	public String getDefault() {
		return "testinggggg";
	}



	@GET
	@Path("/cardtype")
	@Consumes(MediaType.APPLICATION_JSON)
	public void payByCreditCardHardCoded() {

		CreditCard masterCard = new MasterCard();
		CreditCard visaCard = new VisaCard();

		CreditCardService cardService = new CreditCardService();
		cardService.payByCreditCard(masterCard, CardFactory.cardOne);
		cardService.payByCreditCard(visaCard, CardFactory.cardTwo);
	}




}
