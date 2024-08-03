package com.saga.payment.domain.model;

import com.saga.payment.domain.model.enums.OrderDomainStatus;

import java.math.BigDecimal;
import java.util.UUID;

public record Order(
        Integer id,
        OrderDomainStatus status,
        String orderId,
        UUID customerId,
        BigDecimal grandTotal
) {
}
