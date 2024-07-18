package com.saga.payment.domain.in;

import com.saga.payment.domain.model.Payment;

import java.util.List;

public interface PaymentDomainServiceApi {

    List<Payment> getAll();
}
