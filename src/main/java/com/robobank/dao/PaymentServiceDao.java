package com.robobank.dao;

import com.robobank.pojo.CardPayment;

public class PaymentServiceDao {

	public double CardPayment(CardPayment card) {
		System.out.println("Enter PaymentServiceDao :: cardPayment");
		//hit database and update balance
		System.out.println("Exit PaymentServiceDao :: cardPayment");
		return 7000;
	}

}
