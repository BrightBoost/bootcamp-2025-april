## 🛒 Mini Project 1: *Shopping Cart System*

**Hey savvy shopper!**
You’re building a mini shopping cart system. This app lets you add products (some with discounts!) to a cart and calculates the total price with tax.

### 🧩 What you’ll build:

You’ll create a system with different types of products, add them to a cart, and then calculate the total price including tax and discounts.

---

### 🪜 Step-by-Step Instructions:

#### 1. Create a base class `Product`:

* Fields:

  * `String name`
  * `double price`
* Constructor: initialize `name` and `price`
* Method: `double getFinalPrice()` – just return the price for now

#### 2. Create a subclass `DiscountedProduct`:

* Extra field: `double discountPercentage` (e.g., 10 for 10%)
* Constructor: use `super(...)` to call the `Product` constructor
* Override `getFinalPrice()` to return the price after discount
  <details><summary>👉 Math:</summary> `price - (price * discountPercentage / 100)`<details>

#### 3. Create a `ShoppingCart` class:

* Field: `List<Product> items`
* Method: `addItem(Product product)`
* Method: `printReceipt()` that does the following:

  * Loops through all items and:

    * prints name and final price
  * Sums up the final prices
  * Adds 21% tax (calculate it as a percentage)
  * Prints total before tax, tax amount, and total after tax

#### 4. In your `main()` method:

* Create a new `ShoppingCart`
* Add a mix of `Product` and `DiscountedProduct` items
* Call `printReceipt()`

---

### 🎯 You’ve used:

* **Inheritance**: `DiscountedProduct` extends `Product`
* **Polymorphism**: Cart holds a `List<Product>`, but calls `getFinalPrice()` for both types
* **Basic math**: discounts, percentages, tax calculation

---

## 🎢 Mini Project 2: *Amusement Park Passes*

**Welcome to Wilmer’s Wild World!**
You’re in charge of creating a system that sells tickets for the amusement park. Each type of visitor gets a different pass, with different prices and discounts.

### 🎡 What you’ll build:

A ticket system where each visitor type has a special price, and you can calculate the total revenue and individual prices using inheritance and polymorphism.

---

### 🪜 Step-by-Step Instructions:

#### 1. Create a base class `Pass`:

* Fields:

  * `String holderName`
  * `double basePrice`
* Constructor to initialize the fields
* Method: `double calculateFinalPrice()` – returns `basePrice`

#### 2. Create three subclasses:

* `ChildPass`:

  * Override `calculateFinalPrice()` → 50% discount (use percentage math)
* `AdultPass`:

  * No change; can inherit the default method
* `SeniorPass`:

  * Override `calculateFinalPrice()` → 30% discount

#### 3. Create a class `GroupBooking`:

* Field: `List<Pass> passes`
* Method: `addPass(Pass pass)`
* Method: `printSummary()` that:

  * Loops through the list and prints each person’s name and ticket price
  * Calculates and prints total revenue

#### 4. In your `main()` method:

* Create a `GroupBooking`
* Add at least one of each type of pass
* Call `printSummary()` to display all ticket info and the total amount

---

### 🎯 You’ve used:

* **Inheritance**: `ChildPass`, `SeniorPass` inherit from `Pass`
* **Polymorphism**: You store all pass types in a `List<Pass>` and call `calculateFinalPrice()` on each
* **Basic math**: applying percentage-based discounts and summing totals

---
