package com.saga.payment.application.mapper;

import com.saga.payment.application.api.enums.ClaimEventStatus;
import com.saga.payment.application.api.event.CheckRefundProcessMessage;
import com.saga.payment.application.api.event.ClaimMessage;
import com.saga.payment.application.api.event.OrderMessage;
import com.saga.payment.application.api.response.PaymentResponse;
import com.saga.payment.domain.model.CheckRefundProcess;
import com.saga.payment.domain.model.Claim;
import com.saga.payment.domain.model.Order;
import com.saga.payment.domain.model.Payment;
import com.saga.payment.domain.model.enums.ClaimStatus;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PaymentResponseMapper {

    List<PaymentResponse> toResponse(List<Payment> payments);

    Claim toDomain(ClaimMessage event);

    ClaimStatus toDomain(ClaimEventStatus status);

    Order toDomain(OrderMessage event);

    CheckRefundProcess toDomain(CheckRefundProcessMessage event);
}
