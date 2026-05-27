
package com.enterprise.payment.service;

import com.enterprise.payment.dto.PaymentRequest;
import com.enterprise.payment.dto.PaymentResponse;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentResponse processPayment(
            PaymentRequest request,
            String correlationId) {

        return PaymentResponse.builder()
                .paymentId(request.getPaymentId())
                .status("ACCEPTED")
                .message("Canonical payment request accepted successfully")
                .correlationId(correlationId)
                .build();
    }
}
