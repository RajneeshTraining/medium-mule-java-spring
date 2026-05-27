
package com.enterprise.payment.controller;

import com.enterprise.payment.dto.PaymentRequest;
import com.enterprise.payment.dto.PaymentResponse;
import com.enterprise.payment.service.PaymentService;

import jakarta.validation.Valid;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping
    public ResponseEntity<PaymentResponse> processPayment(
            @Valid @RequestBody PaymentRequest request) {

        String correlationId =
                "CORR-" + System.currentTimeMillis();

        log.info(
                "Processing payment with Correlation ID: {}",
                correlationId
        );

        return ResponseEntity.ok(
                paymentService.processPayment(
                        request,
                        correlationId
                )
        );
    }
}
