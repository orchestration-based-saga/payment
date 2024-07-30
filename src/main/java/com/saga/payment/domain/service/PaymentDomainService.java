package com.saga.payment.domain.service;

import com.saga.payment.domain.in.PaymentDomainServiceApi;
import com.saga.payment.domain.model.Claim;
import com.saga.payment.domain.model.Payment;
import com.saga.payment.domain.model.enums.ClaimStatus;
import com.saga.payment.domain.model.enums.TransactionStatus;
import com.saga.payment.domain.out.PaymentRepositoryApi;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class PaymentDomainService implements PaymentDomainServiceApi {
    private final PaymentRepositoryApi paymentRepositoryApi;

    @Override
    public List<Payment> getAll() {
        return paymentRepositoryApi.findAll();
    }

    @Override
    public void processClaim(Claim claim) {
        if (!claim.status().equals(ClaimStatus.REFUNDED)) {
            return;
        }
        paymentRepositoryApi.createPayment(claim.orderId(), claim.refundAmount());
    }

    @Override
    public void initiateBankTransaction() {
        List<Payment> payments = paymentRepositoryApi.findAll()
                .stream()
                .filter(p -> !p.status().equals(TransactionStatus.CANCELLED) &&
                        !p.status().equals(TransactionStatus.COMPLETED))
                .toList();

        paymentRepositoryApi.createBankTransaction(payments);
    }
}
