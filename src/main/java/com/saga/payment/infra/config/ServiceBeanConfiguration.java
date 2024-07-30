package com.saga.payment.infra.config;

import com.saga.payment.domain.in.PaymentDomainServiceApi;
import com.saga.payment.domain.out.PaymentProducerApi;
import com.saga.payment.domain.service.PaymentDomainService;
import com.saga.payment.infra.repository.PaymentRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceBeanConfiguration {

    @Bean
    public PaymentDomainServiceApi paymentDomainServiceApi(
            PaymentRepositoryImpl paymentRepositoryApi,
            PaymentProducerApi paymentProducerApi) {
        return new PaymentDomainService(paymentRepositoryApi, paymentProducerApi);
    }
}
