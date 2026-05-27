
package com.enterprise.provider.controller;

import com.enterprise.provider.dto.PaytmRequest;
import com.enterprise.provider.dto.PaytmResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paytm")
public class PaytmController {

    @PostMapping("/process")
    public ResponseEntity<?> process(
            @RequestBody PaytmRequest request)
            throws InterruptedException {

        if(request.getOrderId().contains("FAIL")) {

            return ResponseEntity.status(503)
                    .body("Temporary Provider Failure");
        }

        Thread.sleep(1000);

        return ResponseEntity.ok(
                PaytmResponse.builder()
                        .resultStatus("SUCCESS")
                        .txnId("PAYTM-TXN-1001")
                        .provider("PAYTM")
                        .build()
        );
    }
}
