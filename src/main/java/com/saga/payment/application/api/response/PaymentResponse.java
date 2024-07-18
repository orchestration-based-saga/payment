package com.saga.payment.application.api.response;

import java.math.BigDecimal;
import java.util.UUID;

public record PaymentResponse(
        UUID id,
        BigDecimal transactionAmount,
        BigDecimal paidAmount
) {
}
