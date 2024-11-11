package com.saga.payment.application.api.event;

import java.util.UUID;

public record CheckRefundProcessMessage(
        String processId,
        String businessKey,
        Long parentProcessId,
        UUID workflow,
        String orderId
) {
}
