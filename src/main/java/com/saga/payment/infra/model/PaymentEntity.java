package com.saga.payment.infra.model;

import com.saga.payment.infra.model.enums.PaymentTransactionStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "Payment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;
    @Column(nullable = false)
    UUID transactionId;
    @Column(nullable = false)
    String orderId;
    BigDecimal transactionAmount;
    BigDecimal paidAmount;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    PaymentTransactionStatus status;
    String bankTransactionId;
    @Column(nullable = false)
    UUID customerId;
}
