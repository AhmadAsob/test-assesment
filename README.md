# Order Analytics Microservices

## Deskripsi
Order Analytics Microservices adalah mini project berbasis Java Spring Boot yang menerapkan arsitektur microservices untuk mengelola data User dan Order serta menyediakan analitik transaksi.

Project ini dibuat untuk memenuhi kriteria level Middle Developer.

---

## Teknologi
- Java 17
- Spring Boot
- Spring Data JPA
- Native SQL
- Java Stream API
- MySQL

---

## Arsitektur
- Port 8080
- MySQL Database

## Fitur
### User Service
- CRUD User

### Order Service
- Analitik order per user
- Ringkasan total order dan total transaksi

---

## Database
Terdiri dari dua tabel:
- users
- orders

---

## Spring IoC
Dependency Injection diterapkan menggunakan:
- @RestController
- @Service
- @Repository
- Constructor Injection

---

## Java Stream
Java Stream digunakan untuk:
- Mapping data hasil query
- Sorting data analitik

---

## Native SQL
Order Service menggunakan Native SQL tingkat intermediate:
- JOIN
- GROUP BY
- HAVING
- Aggregate Function

---

## API Endpoint

### User Service
- GET /users
- GET /users/{id}
- POST /users
- PUT /users/{id}
- DELETE /users/{id}

### Order Service
- GET /orders/summary?minAmount=1000000

## Kesimpulan
Project ini menunjukkan penggunaan Spring IoC, Java Stream, Native SQL tingkat menengah, serta penerapan Microservices.

