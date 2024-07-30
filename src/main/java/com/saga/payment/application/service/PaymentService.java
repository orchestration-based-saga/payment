package com.saga.payment.application.service;

import com.saga.payment.application.api.response.PaymentResponse;
import com.saga.payment.application.mapper.PaymentResponseMapper;
import com.saga.payment.domain.in.PaymentDomainServiceApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentDomainServiceApi paymentDomainService;
    private final PaymentResponseMapper paymentResponseMapper;

    public List<PaymentResponse> getAll() {
        return paymentResponseMapper.toResponse(paymentDomainService.getAll());
    }

    public boolean cancelPayment(UUID paymentId) {
        return paymentDomainService.cancelPayment(paymentId);
    }
}
