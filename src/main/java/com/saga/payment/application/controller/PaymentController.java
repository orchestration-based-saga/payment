package com.saga.payment.application.controller;

import com.saga.payment.application.api.response.PaymentResponse;
import com.saga.payment.application.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/payment")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @GetMapping
    ResponseEntity<List<PaymentResponse>> get() {
        List<PaymentResponse> response = paymentService.getAll();
        return ResponseEntity.ok().body(response);
    }

}
