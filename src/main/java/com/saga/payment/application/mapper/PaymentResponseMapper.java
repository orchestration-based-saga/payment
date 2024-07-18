package com.saga.payment.application.mapper;

import com.saga.payment.application.api.response.PaymentResponse;
import com.saga.payment.domain.model.Payment;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PaymentResponseMapper {

    List<PaymentResponse> toResponse(List<Payment> payments);
}
