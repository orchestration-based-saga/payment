package com.saga.payment.domain.out;

import com.saga.payment.domain.model.CheckRefundProcess;
import com.saga.payment.domain.model.Payment;

public interface PaymentProducerApi {

    void send(Payment payment);

    void refundStatus(CheckRefundProcess process, boolean isCompleted);
}
