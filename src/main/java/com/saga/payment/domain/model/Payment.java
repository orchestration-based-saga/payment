package com.saga.payment.domain.model;

import java.math.BigDecimal;
import java.util.UUID;

public record Payment(
        UUID id,
        BigDecimal transactionAmount,
        BigDecimal paidAmount
) {
}
