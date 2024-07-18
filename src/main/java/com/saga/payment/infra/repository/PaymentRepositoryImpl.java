package com.saga.payment.infra.repository;

import com.saga.payment.domain.model.Payment;
import com.saga.payment.domain.out.PaymentRepositoryApi;
import com.saga.payment.infra.mapper.PaymentEntityMapper;
import com.saga.payment.infra.repository.jpa.PaymentEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PaymentRepositoryImpl implements PaymentRepositoryApi {
    private final PaymentEntityRepository paymentEntityRepository;
    private final PaymentEntityMapper mapper;

    @Override
    public List<Payment> findAll() {
        return mapper.toDomain(paymentEntityRepository.findAll());
    }
}
