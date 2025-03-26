# Pizza Order System

## Project Overview

This Java-based Pizza Order System allows users to place various types of pizza orders, including Delivery, ToGo, and Seated orders. The system calculates the price of each order based on the size of the pizza, the number of toppings, the topping price, and additional charges like service fees or trip rates.

The system also supports sorting the orders based on the total price and generating reports for each order. This project demonstrates object-oriented programming concepts such as inheritance, polymorphism, and abstraction.

## Features

- **Multiple Order Types**: Supports three types of pizza orders:
  - **Delivery**: Includes a trip rate and a zone multiplier.
  - **Seated**: Includes a service charge and the number of people for whom the pizza is ordered.
  - **ToGo**: A basic pizza order without additional charges.
  
- **Order Price Calculation**: The total price of an order is calculated based on:
  - The number of toppings and their price.
  - The pizza size (Small, Medium, Large).
  - Additional charges like service fees or delivery trip rates.

- **Sorting Orders**: Orders are sorted based on their calculated price, from lowest to highest.

- **Report Generation**: Detailed reports are generated for each order, including customer name, pizza size, number of toppings, topping price, and total order price.

## Project Files

### 1. **PizaaOrder.java**

This is the abstract class that serves as the base for all types of pizza orders. It defines common attributes and methods, such as customer name, pizza size, number of toppings, topping price, and order price calculation.

- **Key Methods**:
  - `calculateOrderPrice()`: Calculates the price based on the number of toppings and the size of the pizza.
  - `compareTo()`: Compares pizza orders based on their price.
  - `toString()`: Returns a string representation of the pizza order.
  
### 2. **Delivery.java**

This class extends `PizaaOrder` and adds additional functionality for delivery orders, including a trip rate and zone multiplier.

- **Key Methods**:
  - `calculateOrderPrice()`: Overrides the method from `PizaaOrder` to include the trip rate and zone multiplier in the price calculation.
  - `toString()`: Returns a detailed string representation of the delivery order.

### 3. **Seated.java**

This class extends `PizaaOrder` and adds a service charge and the number of people for whom the pizza is ordered.

- **Key Methods**:
  - `calculateOrderPrice()`: Overrides the method from `PizaaOrder` to include the service charge and the number of people in the price calculation.
  - `toString()`: Returns a detailed string representation of the seated order.

### 4. **ToGo.java**

This class extends `PizaaOrder` for simple takeout orders. It does not add any additional charges, making it a straightforward order type.

### 5. **Driver.java**

This is the main class where the program is executed. It creates a list of pizza orders, sorts them based on the calculated price, and prints detailed reports for each order.

- **Key Methods**:
  - `sortOrders()`: Sorts the list of orders by price.
  - `calculateTotalOrdersPrice()`: Calculates and prints the total price for all orders.
  
## How to Use

1. **Run the program**: Execute the `Driver.java` file to start the program.
2. **Pizza Orders**: The program automatically creates five different pizza orders (Delivery, Seated, ToGo).
3. **Sorting Orders**: The orders are sorted based on the calculated total price.
4. **Reports**: The program generates a report for each pizza order, displaying customer details, pizza size, toppings, charges, and the final price.
5. **Total Price**: The program calculates and prints the total price of all orders combined.

## Example Output

