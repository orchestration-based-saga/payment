package com.saga.payment.application.messaging.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.saga.payment.application.messaging.api.enums.OrderStatus;

import java.math.BigDecimal;
import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public record OrderEvent(
        Integer id,
        OrderStatus status,
        String orderId,
        UUID customerId,
        BigDecimal grandTotal
) {
}
