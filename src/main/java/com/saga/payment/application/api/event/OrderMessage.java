package com.saga.payment.application.api.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.saga.payment.application.api.enums.OrderStatus;

import java.math.BigDecimal;
import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public record OrderMessage(
        Integer id,
        OrderStatus status,
        String orderId,
        UUID customerId,
        BigDecimal grandTotal
) {
}
