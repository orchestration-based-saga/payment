package com.saga.payment.domain.model;

import com.saga.payment.domain.model.enums.TransactionStatus;
import lombok.Builder;

import java.math.BigDecimal;
import java.util.UUID;

@Builder
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

    public Payment updateStatus(TransactionStatus status) {
        return new Payment(id, transactionAmount, paidAmount, status, transactionId, orderId, bankTransactionId, customerId);
    }
}
