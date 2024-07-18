package com.saga.payment.infra.repository.jpa;

import com.saga.payment.infra.model.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaymentEntityRepository extends JpaRepository<PaymentEntity, UUID> {

}
