package com.saga.payment.infra.mapper;

import com.saga.payment.domain.model.Payment;
import com.saga.payment.infra.model.PaymentEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PaymentEntityMapper {

    List<Payment> toDomain(List<PaymentEntity> payments);

    PaymentEntity toEntity(Payment payment);

    List<PaymentEntity> toEntity(List<Payment> payments);
}
