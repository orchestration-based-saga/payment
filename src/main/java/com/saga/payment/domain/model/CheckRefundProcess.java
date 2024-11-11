package com.saga.payment.domain.model;

import java.util.UUID;

public record CheckRefundProcess(
        String processId,
        String businessKey,
        Long parentProcessId,
        UUID workflow,
        String orderId
) {
}
