
# Blog 1 — Canonical Payment Service

Enterprise Canonical Payment Service built using:

- Java 25
- Spring Boot 3.x
- Gradle

---

# Features

- Canonical payment request model
- REST API
- Validation
- Correlation IDs
- Structured logging
- Gradle build

---

# Prerequisites

| Component | Version |
|---|---|
| Java | 25 |
| Gradle | 8.x |
| IntelliJ IDEA | Latest |

---

# Run Application

```bash
./gradlew bootRun
```

Application starts on:

```text
http://localhost:8080
```

---

# API

## POST /api/payments

Sample Request:

```json
{
  "paymentId":"PAY-1001",
  "customerId":"CUST-100",
  "amount":2500,
  "currency":"INR",
  "paymentMethod":"PAYTM"
}
```

Sample Curl:

```bash
curl --location 'http://localhost:8080/api/payments' \
--header 'Content-Type: application/json' \
--data '{
    "paymentId":"PAY-1001",
    "customerId":"CUST-100",
    "amount":2500,
    "currency":"INR",
    "paymentMethod":"PAYTM"
}'
```

Sample Response:

```json
{
  "paymentId": "PAY-1001",
  "status": "ACCEPTED",
  "message": "Canonical payment request accepted successfully",
  "correlationId": "CORR-1740000000"
}
```

---

# Import Into IntelliJ

1. Open IntelliJ IDEA
2. Import Existing Gradle Project
3. Select build.gradle
4. Wait for Gradle sync
5. Run PaymentServiceApplication

---

# Next Step

This project integrates with:
- MuleSoft Integration Layer
- Mock Payment Providers
- Kafka Event Processing
