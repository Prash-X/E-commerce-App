package dev.prashant.EcomPaymentService.service;

import org.springframework.stereotype.Service;

@Service("stripe")
public class StripePaymentServiceImpl implements PaymentService{
    @Override
    public String doPayment(String email, String phone, Long amount, String orderId) {
        return null;
    }
}
