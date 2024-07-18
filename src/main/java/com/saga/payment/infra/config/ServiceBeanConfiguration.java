package com.saga.payment.infra.config;

import com.saga.payment.domain.in.PaymentDomainServiceApi;
import com.saga.payment.domain.out.PaymentRepositoryApi;
import com.saga.payment.domain.service.PaymentDomainService;
import com.saga.payment.infra.repository.PaymentRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceBeanConfiguration {

    @Bean
    public PaymentDomainServiceApi paymentDomainServiceApi(PaymentRepositoryImpl paymentRepositoryApi) {
        return new PaymentDomainService(paymentRepositoryApi);
    }
}
