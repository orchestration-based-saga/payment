package com.saga.payment.domain.out;

import com.saga.payment.domain.model.Payment;

import java.util.List;

public interface PaymentRepositoryApi {

    List<Payment> findAll();
}
