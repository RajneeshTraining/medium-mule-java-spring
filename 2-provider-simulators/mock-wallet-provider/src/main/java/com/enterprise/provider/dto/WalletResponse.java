
package com.enterprise.provider.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WalletResponse {

    private String status;
    private String transactionId;
    private String provider;
}
