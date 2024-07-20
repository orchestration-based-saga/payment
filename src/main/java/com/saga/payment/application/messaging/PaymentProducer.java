package com.saga.payment.application.messaging;

import com.saga.payment.application.api.response.PaymentResponse;
import com.saga.payment.infra.common.event.StreamBindingsConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentProducer {

    private final StreamBridge streamBridge;

    public void send(PaymentResponse payment) {
        streamBridge.send(StreamBindingsConstants.PAYMENT,
                MessageBuilder.withPayload(payment).build());
    }
}
