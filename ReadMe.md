# Learning Java
#### Guided by ChatGPT

The goal: **learn Java properly enough to build backend projects confidently.**

## Overall timeline

**1 - 2 weeks**.

## Phase 1: Java setup + basic syntax

### Goal

Get comfortable writing and running simple Java programs.

### Learn

```text
JDK
JVM
JRE
IntelliJ IDEA
Java file structure
main method
variables
data types
operators
if/else
switch
loops
methods
```

### Practice

Write small programs:

```text
check even/odd
simple calculator
find largest number
reverse a string
count vowels
print multiplication table
```

### Important concept

Java always starts from:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
```

For now, do not worry too much about every keyword. Just understand that `main` is the starting point.

---

## Phase 2: Object-Oriented Programming

### Goal

Understand how Java organizes code using classes and objects.

### Learn

```text
class
object
constructor
fields
methods
this keyword
access modifiers
static vs non-static
encapsulation
getters and setters
```

### Practice

Create classes for:

```text
User
Product
BankAccount
Student
Car
Order
```

Example:

```java
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void printDetails() {
        System.out.println(name + " costs " + price);
    }
}
```

### Project idea

Build a simple **Bank Account App** in plain Java.

Features:

```text
create account
deposit money
withdraw money
check balance
print account details
```

No database. No Spring Boot. Just Java.

---

## Phase 3: Core OOP concepts

### Goal

Understand Java’s real power: interfaces, inheritance, and polymorphism.

### Learn

```text
inheritance
extends
super
method overriding
interface
implements
abstract class
polymorphism
composition
```

### Practice

Build examples like:

```text
Vehicle -> Car, Bike
Employee -> FullTimeEmployee, Contractor
Payment -> CardPayment, UpiPayment, CashPayment
Notification -> EmailNotification, SmsNotification
```

Example:

```java
public interface Payment {
    void pay(double amount);
}

public class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using card");
    }
}
```

### Important concept

In Java backend code, you will see interfaces everywhere.

For example:

```java
PaymentService service = new StripePaymentService();
```

That means your code depends on the behavior, not the exact class.

---

## Phase 4: Collections and data handling

### Goal

Learn how Java stores and processes groups of data.

### Learn

```text
Array
ArrayList
LinkedList
HashSet
HashMap
Queue
Stack
for-each loop
sorting
comparable
comparator
```

### Practice

Write programs for:

```text
store list of products
find product by name
count duplicate values
group items by category
sort students by grade
store username and email in a map
```

### Key collections

```java
List<String> names = new ArrayList<>();
Set<String> uniqueEmails = new HashSet<>();
Map<String, Integer> productQuantity = new HashMap<>();
```

### Project idea

Build a simple **Inventory App** in plain Java.

Features:

```text
add product
update quantity
remove product
search product
list all products
```

Use `ArrayList` or `HashMap`.

---

## Phase 5: Exceptions, files, and cleaner code

### Goal

Learn how Java handles errors and basic file operations.

### Learn

```text
try/catch
finally
throw
throws
custom exceptions
checked vs unchecked exceptions
reading files
writing files
packages
imports
```

### Practice

Add error handling to your inventory app:

```text
product not found
invalid quantity
insufficient stock
duplicate product
```

Example:

```java
public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
```

### Project improvement

Update the inventory app so it can:

```text
save products to a file
load products from a file
handle bad input safely
```

---

## Phase 6: Modern Java

### Goal

Learn the Java features commonly used in current backend code.

### Learn

```text
Streams
Lambda expressions
Optional
Records
Enums
Date and Time API
var keyword
```

### Practice

Use streams to:

```text
filter products by category
find expensive products
calculate total inventory value
sort orders
group products
```

Example:

```java
List<Product> expensiveProducts = products.stream()
    .filter(product -> product.getPrice() > 100)
    .toList();
```

### Also learn enums

```java
public enum OrderStatus {
    PENDING,
    CONFIRMED,
    SHIPPED,
    DELIVERED,
    CANCELLED
}
```

Enums are very common in backend systems.

---

## Phase 7: Maven + project structure

### Goal

Learn how real Java projects are organized.

### Learn

```text
Maven
pom.xml
dependencies
project structure
packages
build lifecycle
unit testing basics
JUnit
```

Typical Maven structure:

```text
src/main/java
src/test/java
pom.xml
```

### Practice

Convert your plain Java inventory app into a Maven project.

Add tests like:

```java
@Test
void shouldAddProduct() {
    Inventory inventory = new Inventory();

    inventory.addProduct(new Product("Apple", 10));

    assertEquals(1, inventory.getProducts().size());
}
```

### Important

This is where Java starts feeling professional. Maven is similar to `package.json`, but more strict and XML-based.

---

## Phase 8: Build one complete Java project

### Goal

Use everything you learned in one project.

Build a **Java Console Inventory Management System**.

### Features

```text
add product
update product
delete product
search product
list products
manage stock quantity
place order
cancel order
save data to file
load data from file
handle errors
unit tests
```

### Concepts used

```text
classes
objects
interfaces
collections
exceptions
streams
enums
files
Maven
JUnit
```

This gives you a strong foundation before Spring Boot.

---

# Daily study structure

Do this 5 days a week.

## 4-5 hours per day,

```text
20% : learn concept
30% : code small examples
40% : work on mini project
10% : write notes
```

Your notes should answer:

```text
What did I learn?
What confused me?
What code did I write?
What is one example from real backend work?
```

---

# Best order of projects

Do these in order:

## Project 1: Calculator

Use:

```text
variables
methods
if/else
switch
loops
```

## Project 2: Bank Account App

Use:

```text
classes
objects
constructors
encapsulation
```

## Project 3: Payment System

Use:

```text
interfaces
inheritance
polymorphism
```

## Project 4: Inventory App

Use:

```text
collections
exceptions
files
streams
```

## Project 5: Maven Inventory System

Use:

```text
Maven
JUnit
clean project structure
```

After this, then you move to Spring Boot.

---

# What not to learn right now

Skip these for now:

```text
Swing
JavaFX
Servlets from scratch
JSP
Applet
advanced concurrency
deep JVM internals
Spring Security
microservices
Kafka
Kubernetes with Java
```

Those can come later.

---

# My learning stack

Use:

```text
Java 17 
Sublime
Git Bash
Maven
JUnit 5
GitHub
```
---

# Simple phase wise checklist

## By end of Phase 1

You can write basic Java programs.

## By end of Phase 2

You understand classes and objects.

## By end of Phase 3

You understand interfaces and inheritance.

## By end of Phase 4

You can use lists, maps, and sets.

## By end of Phase 5

You can handle errors properly.

## By end of Phase 6

You can use streams, optional, enums, and records.

## By end of Phase 7

You can create a Maven project and write tests.

## By end of Phase 8

You have one complete Java project on GitHub.

---