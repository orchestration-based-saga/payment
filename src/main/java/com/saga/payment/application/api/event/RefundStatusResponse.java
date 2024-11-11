package com.saga.payment.application.api.event;

public record RefundStatusResponse(
        String processId,
        String businessKey,
        boolean completed
) {
}
