package com.saga.payment.domain.out;

import com.saga.payment.domain.model.Payment;

import java.math.BigDecimal;
import java.util.List;

public interface PaymentRepositoryApi {

    List<Payment> findAll();

    void createPayment(String orderId, BigDecimal amount);

    void createBankTransaction(List<Payment> payments);
}
