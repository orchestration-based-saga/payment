package com.saga.payment.domain.service;

import com.saga.payment.domain.in.PaymentDomainServiceApi;
import com.saga.payment.domain.model.Payment;
import com.saga.payment.domain.out.PaymentRepositoryApi;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PaymentDomainService implements PaymentDomainServiceApi {
    private final PaymentRepositoryApi paymentRepositoryApi;

    @Override
    public List<Payment> getAll() {
        return paymentRepositoryApi.findAll();
    }
}
