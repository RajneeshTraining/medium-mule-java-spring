
package com.enterprise.provider.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/netbanking")
public class NetBankingController {

    @PostMapping(
            value = "/process",
            produces = MediaType.APPLICATION_XML_VALUE
    )
    public ResponseEntity<String> process(
            @RequestBody String payload)
            throws InterruptedException {

        Thread.sleep(1500);

        String response = """
                <NetBankingResponse>
                    <status>SUCCESS</status>
                    <transactionId>NB-1001</transactionId>
                    <provider>NETBANKING</provider>
                </NetBankingResponse>
                """;

        return ResponseEntity.ok(response);
    }
}
