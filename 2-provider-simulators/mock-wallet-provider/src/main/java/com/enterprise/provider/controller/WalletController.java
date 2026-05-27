
package com.enterprise.provider.controller;

import com.enterprise.provider.dto.WalletRequest;
import com.enterprise.provider.dto.WalletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    @PostMapping("/process")
    public ResponseEntity<?> process(
            @RequestBody WalletRequest request)
            throws InterruptedException {

        Thread.sleep(500);

        return ResponseEntity.ok(
                WalletResponse.builder()
                        .status("SUCCESS")
                        .transactionId("WALLET-TXN-1001")
                        .provider("WALLET")
                        .build()
        );
    }
}
