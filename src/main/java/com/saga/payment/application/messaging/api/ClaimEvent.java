package com.saga.payment.application.messaging.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.saga.payment.application.messaging.api.enums.ClaimEventStatus;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ClaimEvent(
        Integer id,
        Integer itemId,
        String orderId,
        BigDecimal refundAmount,
        ClaimEventStatus status
) {
}
