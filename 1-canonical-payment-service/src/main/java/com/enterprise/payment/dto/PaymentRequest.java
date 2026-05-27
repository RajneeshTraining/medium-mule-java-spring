
package com.enterprise.payment.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PaymentRequest {

    @NotBlank
    private String paymentId;

    @NotBlank
    private String customerId;

    @NotNull
    private Double amount;

    @NotBlank
    private String currency;

    @NotBlank
    private String paymentMethod;
}
