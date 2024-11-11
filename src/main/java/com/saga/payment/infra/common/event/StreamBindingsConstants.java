package com.saga.payment.infra.common.event;

import lombok.experimental.UtilityClass;

@UtilityClass
public class StreamBindingsConstants {
    public static final String PAYMENT = "payment";
    public static final String REFUND_STATUS = "workflow-check-refund-response";
}
