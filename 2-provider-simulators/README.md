
# Blog 2 — Enterprise Payment Provider Simulators

This repository contains mock enterprise payment providers used for MuleSoft integration testing.

---

# Included Providers

| Provider | Port |
|---|---|
| mock-paytm-provider | 8081 |
| mock-wallet-provider | 8082 |
| mock-netbanking-provider | 8083 |

---

# Technology Stack

- Java 25
- Spring Boot 3.x
- Gradle

---

# Features

- Different payload formats
- JSON APIs
- XML APIs
- Delay simulation
- Failure simulation
- Timeout simulation

---

# How To Run

Navigate into each provider project:

```bash
./gradlew bootRun
```

---

# Sample APIs

## PayTM

POST:
```text
http://localhost:8081/paytm/process
```

## Wallet

POST:
```text
http://localhost:8082/wallet/process
```

## NetBanking

POST:
```text
http://localhost:8083/netbanking/process
```

---

# Notes

These providers simulate:
- enterprise payment gateways
- downstream provider APIs
- real-world delays/failures
- multiple response structures
