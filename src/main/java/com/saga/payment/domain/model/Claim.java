package com.saga.payment.domain.model;

import com.saga.payment.domain.model.enums.ClaimStatus;

import java.math.BigDecimal;

public record Claim(
        Integer id,
        Integer itemId,
        String orderId,
        BigDecimal refundAmount,
        ClaimStatus status
) {
}
