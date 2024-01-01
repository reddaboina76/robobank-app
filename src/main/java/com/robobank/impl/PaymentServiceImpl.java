package com.robobank.impl;

import com.robobank.dao.PaymentServiceDao;
import com.robobank.pojo.CardPayment;

public class PaymentServiceImpl {

	public double CardPayment(CardPayment card) {
		System.out.println("Enter PaymentServiceImpl :: cardPayment");
		PaymentServiceDao cardDao = new PaymentServiceDao();
		double remaingBalance = cardDao.CardPayment(card);
		System.out.println("Exit PaymentServiceImpl :: cardPayment");
		return remaingBalance;

	}

}
