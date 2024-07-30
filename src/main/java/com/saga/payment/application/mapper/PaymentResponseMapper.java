package com.saga.payment.application.mapper;

import com.saga.payment.application.api.response.PaymentResponse;
import com.saga.payment.application.messaging.api.ClaimEvent;
import com.saga.payment.application.messaging.api.enums.ClaimEventStatus;
import com.saga.payment.domain.model.Claim;
import com.saga.payment.domain.model.Payment;
import com.saga.payment.domain.model.enums.ClaimStatus;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PaymentResponseMapper {

    List<PaymentResponse> toResponse(List<Payment> payments);

    Claim toDomain(ClaimEvent event);

    ClaimStatus toDomain(ClaimEventStatus status);
}
