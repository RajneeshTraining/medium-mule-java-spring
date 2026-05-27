
# Blog 3 — MuleSoft Integration Layer

Enterprise MuleSoft orchestration layer for payment routing.

---

# Technology Stack

| Component | Version |
|---|---|
| Mule Runtime | 4.6.x |
| Anypoint Studio | Compatible Latest |
| Java | 17+ |
| Maven | 3.9+ |

---

# Features

- HTTP Listener
- Canonical Request Handling
- Choice Router
- Provider Routing
- Provider Orchestration
- Logging

---

# Architecture

Canonical Request
        |
        v

MuleSoft Integration Layer
        |
  ----------------------
  |         |          |
  v         v          v

PayTM    Wallet   NetBanking

---

# Prerequisites

1. Install Java 17+
2. Install Maven
3. Install Anypoint Studio
4. Start Blog 2 provider simulators

---

# Import Into Anypoint Studio

1. Open Anypoint Studio
2. File -> Import
3. Existing Mule Project
4. Select this project
5. Finish

---

# Run Application

1. Right click project
2. Run As -> Mule Application

Application starts on:

http://localhost:8085

---

# API

POST:
http://localhost:8085/process-payment

---

# Sample Request

```json
{
  "paymentId":"PAY-1001",
  "customerId":"CUST-100",
  "amount":2500,
  "currency":"INR",
  "paymentMethod":"PAYTM"
}
```

---

# Flow Details

## payment-main-flow

- Receives canonical payment request
- Routes based on paymentMethod

## paytm-flow

- Calls mock PayTM provider

## wallet-flow

- Calls mock Wallet provider

## netbanking-flow

- Calls mock NetBanking provider

---

# Next Step

Next repository introduces:

- DataWeave transformations
- Canonical mappings
- XML/JSON transformations
