package com.saga.payment.application;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payment")
public class PaymentController {

    @GetMapping
    ResponseEntity<String> get() {
        return ResponseEntity.ok().body("Success");
    }

}
