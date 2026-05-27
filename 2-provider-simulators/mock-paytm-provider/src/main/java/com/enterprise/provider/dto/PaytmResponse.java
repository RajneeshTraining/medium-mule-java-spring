
package com.enterprise.provider.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaytmResponse {

    private String resultStatus;
    private String txnId;
    private String provider;
}
