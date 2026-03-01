# Checkout Saga Example

## Description
This project demonstrates the Saga pattern within a single microservice for an e-commerce checkout workflow. 
It includes three steps: Payment, Inventory, and Shipping. Each step has `do` and `compensate` methods. 
If any step fails, previously completed steps are rolled back in reverse order.

## Design
- **Payment:** do → charge user, compensate → refund user
- **Inventory:** do → reserve item, compensate → release item
- **Shipping:** do → schedule shipment, compensate → cancel shipment
- **Error handling:** try/catch block ensures rollback on failure

## Usage
1. Clone the repository
2. Run `Main` to simulate an order checkout
3. Observe console logs showing actions and compensations



   
