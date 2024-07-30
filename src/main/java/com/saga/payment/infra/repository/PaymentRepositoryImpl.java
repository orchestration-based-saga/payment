package com.saga.payment.infra.repository;

import com.saga.payment.domain.model.Payment;
import com.saga.payment.domain.out.PaymentRepositoryApi;
import com.saga.payment.infra.mapper.PaymentEntityMapper;
import com.saga.payment.infra.model.PaymentEntity;
import com.saga.payment.infra.model.enums.PaymentTransactionStatus;
import com.saga.payment.infra.repository.jpa.PaymentEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class PaymentRepositoryImpl implements PaymentRepositoryApi {
    private final PaymentEntityRepository paymentEntityRepository;
    private final PaymentEntityMapper mapper;

    @Override
    public List<Payment> findAll() {
        return mapper.toDomain(paymentEntityRepository.findAll());
    }

    @Override
    public void createPayment(String orderId, BigDecimal amount) {
        PaymentEntity payment = PaymentEntity.builder()
                .status(PaymentTransactionStatus.CREATED)
                .transactionAmount(amount)
                .transactionId(UUID.randomUUID())
                // todo pass customer id from claim
                .customerId(UUID.randomUUID())
                .orderId(orderId)
                .build();
        paymentEntityRepository.save(payment);
    }
}
