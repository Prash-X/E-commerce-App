package dev.prashant.EcomPaymentService.service;

import com.razorpay.RazorpayException;

public interface PaymentService {
    String  doPayment(String email, String phone, Long amount, String orderId) throws RazorpayException;
}
