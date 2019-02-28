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
	
	
	/* This REST API is not working/
	 * tried the following json string in boomerang, 
	 * bt not working. getting a 415 error.
	 * 
	 * PUT + http://localhost:8080/creditcardws/webapi/pay
	 * 
	 * {
		   "cardNumber" : "7668768687",
		   "csvNumber" : "886",
		   "nameOnCard" : "gvjhg"
		}
	 * 
	 */
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void payByCreditCard(CardDetails test) {

		System.out.println( " ----- " + test);
		
		//CardDetails cardDetails System.out.println(cardCompany + " -> " + cardDetails.getCardNumber());		
	}
	
	
	@GET
	public String getDefault() {
		return "testinggggg";
	}
	
	
	
	/* This web service works
	 * 
	 * @POST
	 * 
	 * @Path("/cardtype")
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON) public void
	 * payByCreditCardHardCoded(String cardType) {
	 * 
	 * System.out.println( " ----- " + cardType);
	 * 
	 * CreditCard masterCard = new MasterCard(); CreditCard visaCard = new
	 * VisaCard();
	 * 
	 * CreditCardService cardService = new CreditCardService();
	 * cardService.payByCreditCard(masterCard, CardFactory.cardOne);
	 * cardService.payByCreditCard(visaCard, CardFactory.cardTwo);
	 * 
	 * }
	 */
	
	
	
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
