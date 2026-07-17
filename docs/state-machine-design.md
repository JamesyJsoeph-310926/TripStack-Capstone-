# State machine design

The booking lifecycle should be documented as:
- HELD
- PAYMENT_PENDING
- CONFIRMED
- CANCELLED
- REFUNDED

Negative cases should cover invalid transitions, seat conflicts, expired holds, and cross-namespace access.
