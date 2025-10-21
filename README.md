# 📚 Book Store Application (Java)

A simple and efficient **Book Store App** built with **Java**, designed for both customers and administrators.  
The application allows users to **log in**, **browse books**, **add them to a cart**, and **place orders**.  
It also includes an **Admin Panel** for managing books and user data efficiently.

---

## 🚀 Features

### 👤 User Features
- User registration and login
- Browse available books by category or title
- Add books to the shopping cart
- View and remove items from the cart
- Proceed to checkout or confirm order
- View order history (optional)

### 🛠️ Admin Features
- Admin login
- Add, update, or delete books
- Manage user accounts and view user data
- View all orders placed by users
- Maintain inventory efficiently

---

## 💻 Tech Stack

| Component | Technology |
|------------|-------------|
| Language | **Java (JDK 17+)** |
| GUI | JavaFX / Swing *(depending on your implementation)* |
| Database | **MySQL / SQLite** |
| Build Tool | Maven / Gradle *(optional)* |
| Authentication | Session-based login system |
| IDE Recommended | IntelliJ IDEA / Eclipse / NetBeans |

---

## 🧩 System Modules

1. **User Module**
   - Handles registration, login, and session management
   - Allows browsing and adding books to the cart

2. **Cart Module**
   - Stores selected books temporarily for the logged-in user
   - Supports quantity management and total price calculation

3. **Admin Module**
   - Enables book CRUD operations (Create, Read, Update, Delete)
   - Manages user and order data

4. **Database Module**
   - Stores books, users, and cart details persistently

---

## ⚙️ Installation & Setup

### Prerequisites
- Java JDK 17 or higher  
- MySQL (or SQLite) installed  
- JDBC Driver (MySQL Connector/J if using MySQL)  
- Any Java IDE (IntelliJ IDEA, Eclipse, or NetBeans)

📁 Project Structure

BookStoreApp/
│
├── src/
│   ├── Main.java
│   ├── models/
│   │   ├── User.java
│   │   ├── Book.java
│   │   └── Cart.java
│   ├── dao/
│   │   ├── UserDAO.java
│   │   ├── BookDAO.java
│   │   └── CartDAO.java
│   ├── ui/
│   │   ├── LoginPage.java
│   │   ├── BookListPage.java
│   │   ├── CartPage.java
│   │   └── AdminPanel.java
│   └── utils/
│       └── DBConnection.java
│
├── database/
│   └── bookstore_db.sql
│
├── README.md
└── pom.xml *(if using Maven)*

Add UI previews or console outputs here.

🧠 Future Enhancements

Add payment gateway integration

Include book ratings and reviews

Enable email confirmation for orders

Add search and filter options

Create a REST API for mobile integration

👩‍💻 Author

Developed by: Pramodya Warnakula

GitHub: https://github.com/pramodya112
