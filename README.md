# E-Commerce Application

This is a basic E-Commerce backend application built using **Java**, **Spring Boot**, and **MySQL**. It provides secure REST APIs to handle users, products, categories, orders, carts, and more. It also uses **Auth0** and **JWT** for user login and security.


##  What Can You Do?

### As an Admin:
- Login securely
- Manage Users and their Addresses
- Create and manage Product Categories
- Add/Edit/Delete Products
- Set Prices and Discounts
- View and manage all Orders

### As a User:
- Register and Login
- View product categories and products
- Add or remove products from your cart
- Manage your address and change product quantity
- Place orders and check their status



##  Security

- This app uses **JWT (JSON Web Token)** for security.
- Login using the `/login` API to get your token.
- Add the token in the `Authorization` header when calling other APIs (Swagger makes this easy).



##  Tech Stack

- **Java 21 or above**
- **Spring Boot 3.0**
- **Spring Data JPA** – to work with MySQL
- **Spring Security** – to protect APIs
- **Auth0** – for authentication
- **JWT** – for secure login
- **MySQL** – for storing data
- **Maven** – for managing dependencies
- **Swagger UI** – to test the APIs
