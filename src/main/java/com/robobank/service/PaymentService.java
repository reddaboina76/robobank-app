package com.robobank.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.robobank.impl.PaymentServiceImpl;
import com.robobank.pojo.CardPayment;

@Path(value="/banking/payment")
public class PaymentService {

	@POST
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Path(value="/cardPay")
	public Response cardPayment(CardPayment card) {
		System.out.println("Enter PaymentService :: cardPayment");
		PaymentServiceImpl cardImpl = new PaymentServiceImpl();
		double remaingBalance = cardImpl.CardPayment(card);
		System.out.println("Exit PaymentService :: cardPayment");
		return Response.status(200).entity(""+remaingBalance).build();
	}
}
