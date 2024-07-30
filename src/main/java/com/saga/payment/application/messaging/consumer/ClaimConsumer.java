package com.saga.payment.application.messaging.consumer;

import com.saga.payment.application.mapper.PaymentResponseMapper;
import com.saga.payment.application.messaging.api.ClaimEvent;
import com.saga.payment.domain.in.PaymentDomainServiceApi;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@RequiredArgsConstructor
public class ClaimConsumer {

    private final PaymentDomainServiceApi paymentDomainServiceApi;
    private final PaymentResponseMapper paymentResponseMapper;

    @Bean
    public Consumer<Message<ClaimEvent>> claim() {
        return msg -> paymentDomainServiceApi.processClaim(paymentResponseMapper.toDomain(msg.getPayload()));
    }
}
