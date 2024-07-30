package com.saga.payment.application.schedulers;

import com.saga.payment.domain.in.PaymentDomainServiceApi;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BankApiScheduler {

    private final PaymentDomainServiceApi paymentDomainServiceApi;

    @Scheduled(
            cron = "${cron.bank-api.expression}"
    )
    public void execute(){
        paymentDomainServiceApi.initiateBankTransaction();
    }
}
