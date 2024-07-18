package com.saga.payment.application.service;

import com.saga.payment.application.api.response.PaymentResponse;
import com.saga.payment.application.mapper.PaymentResponseMapper;
import com.saga.payment.domain.in.PaymentDomainServiceApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentDomainServiceApi paymentDomainService;
    private final PaymentResponseMapper paymentResponseMapper;

    public List<PaymentResponse> getAll() {
        return paymentResponseMapper.toResponse(paymentDomainService.getAll());
    }
}
