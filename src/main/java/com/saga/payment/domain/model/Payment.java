package com.saga.payment.domain.model;

import com.saga.payment.domain.model.enums.TransactionStatus;

import java.math.BigDecimal;
import java.util.UUID;

public record Payment(
        UUID id,
        BigDecimal transactionAmount,
        BigDecimal paidAmount,
        TransactionStatus status,
        UUID transactionId,
        String orderId,
        String bankTransactionId,
        UUID customerId
) {
}
