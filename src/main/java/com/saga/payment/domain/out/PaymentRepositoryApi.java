package com.saga.payment.domain.out;

import com.saga.payment.domain.model.Payment;

import java.math.BigDecimal;
import java.util.List;

public interface PaymentRepositoryApi {

    List<Payment> findAll();

    Payment createPayment(String orderId, BigDecimal amount);

    List<Payment> createBankTransaction(List<Payment> payments);
}
