package com.saga.payment.domain.in;

import com.saga.payment.application.messaging.api.OrderEvent;
import com.saga.payment.domain.model.Claim;
import com.saga.payment.domain.model.Order;
import com.saga.payment.domain.model.Payment;

import java.util.List;
import java.util.UUID;

public interface PaymentDomainServiceApi {

    List<Payment> getAll();

    void processClaim(Claim claim);

    void initiateBankTransaction();

    boolean cancelPayment(UUID paymentId);

    void processOrder(Order order);
}
