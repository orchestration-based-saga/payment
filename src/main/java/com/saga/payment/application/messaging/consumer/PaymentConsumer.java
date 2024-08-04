package com.saga.payment.application.messaging.consumer;

import com.saga.payment.application.api.event.ClaimMessage;
import com.saga.payment.application.mapper.PaymentResponseMapper;
import com.saga.payment.application.api.event.OrderMessage;
import com.saga.payment.domain.in.PaymentDomainServiceApi;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@RequiredArgsConstructor
public class PaymentConsumer {

    private final PaymentDomainServiceApi paymentDomainServiceApi;
    private final PaymentResponseMapper paymentResponseMapper;

    @Bean
    public Consumer<Message<ClaimMessage>> claim() {
        return msg -> paymentDomainServiceApi.processClaim(paymentResponseMapper.toDomain(msg.getPayload()));
    }

    @Bean
    public Consumer<Message<OrderMessage>> order() {
        return msg -> paymentDomainServiceApi.processOrder(paymentResponseMapper.toDomain(msg.getPayload()));
    }
}
