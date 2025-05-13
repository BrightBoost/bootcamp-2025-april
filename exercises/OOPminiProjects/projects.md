### 💰 Mini Project 1: *Bank Account Manager*

**Banking made... well, fun!**
Design a simple system that manages different types of bank accounts. Time to cash in your inheritance knowledge!

#### **Project Goal:**

Create a system that handles different types of bank accounts and performs basic operations.

#### **Requirements:**

* Create a base class called `BankAccount` with fields like `accountHolder`, `balance`, and methods like `deposit(amount)` and `withdraw(amount)`.
* Create at least **two subclasses**:

  * `SavingsAccount`: earns interest
  * `CheckingAccount`: includes transaction fees
* Each subclass should override the `withdraw()` method appropriately (e.g., charge a fee, or limit withdrawals).
* Use constructors to set up accounts and call the superclass constructor.
* In `main()`, create a **`List<BankAccount>`**, add a few accounts, and perform some deposits and withdrawals on each.
* Use polymorphism to call `deposit()` and `withdraw()` on the list items.

#### **Bonus:**

Add a method to apply interest to `SavingsAccount` and a method to print an account summary for each account.

🎯 *A classic example of OOP in action! This project brings all the key concepts together with a real-world theme.*

---


### 🍽️ Mini Project 2: *Restaurant Order System*

**Hey code chef!**
Get ready to cook up some classes and serve up some polymorphism. In this project, you're building a basic system to manage different types of menu items at a restaurant—and now you're also going to build an **order system** that calculates totals!

#### **Project Goal:**

Create a system that keeps track of various dishes in a restaurant, allows customers to place an order, and prints a full summary including total price and calories.

#### **Requirements:**

* Create a base class called `MenuItem` with:

  * `name` (String)
  * `price` (double)
  * `calories` (int)
  * A method `getDescription()` that returns a short description of the item.
* Create at least **three subclasses**:

  * `MainDish` (e.g., pasta, curry)
  * `Dessert` (e.g., ice cream, cake)
  * `Drink` (e.g., soda, juice)
* Each subclass should override the `getDescription()` method to include specific details (e.g., “served hot”, “cold and fizzy”, “contains nuts”).
* Use a **constructor** in `MenuItem` and call it from each subclass using `super(...)`.

---

#### Add an Order System:**

* Create a class called `Order` that contains:

  * A `List<MenuItem>` representing the items in the order.
  * A method `addItem(MenuItem item)` to add an item to the order.
  * A method `printOrderSummary()` that:

    * Prints all items with their description, price, and calories.
    * Calculates and prints the **total price** and **total calories** of the order.

---

#### **In your `main()` method:**

* Create a new `Order` object.
* Add at least **five different items** (some `MainDish`, `Dessert`, and `Drink`) to the order.
* Call `printOrderSummary()` to see the magic happen!

---

#### **Bonus:**

Add a `vegetarian` boolean field to `MainDish`, and show only vegetarian items when the user requests a vegetarian menu.

🎯 *This project is a great way to show how polymorphism and inheritance let you treat different items the same way—just like a real menu!* And with the new `Order` class, you're also starting to model real-world workflows—exactly what object-oriented programming is made for.



---

### 🎩🎸 Mini Project 3: *Wilmer's Wonder Shop – Magic Meets Music!*

**Welcome to Wilmer’s Wonder Emporium**, where enchanted wands sit beside vintage guitars, and top hats share shelves with drum kits. Your job is to build a system that manages all these magical and musical items—and gives them life through a magician and a musician!

#### **🎯 Project Goal:**

Create a system that tracks **both magic items and musical instruments**, and lets characters interact with the items in fun and polymorphic ways.

---

### 🧱 Step 1: Build the Item Hierarchy

1. Create a **base class** called `Item` with:

   * `name` (String)
   * `price` (double)
   * A method `use()`.

2. Create two subclasses of `Item`:

   * `MagicItem`
   * `MusicItem`

3. Create **two+ subclasses of each**:

   * For `MagicItem`:

     * `Wand`
     * `Potion`
   * For `MusicItem`:

     * `Guitar`
     * `DrumKit`

4. Override the `use()` method in each concrete subclass:

   * `Wand` might print: `"✨ Swish! The wand sparks with magical energy!"`
   * `Potion` might print: `"💫 You drink the potion. You feel invisible!"`
   * `Guitar` might print: `"🎸 Strumming the strings of the guitar!"`
   * `DrumKit` might print: `"🥁 Boom boom! The drumbeat fills the room!"`

5. Use **constructors** with `super(...)` to initialize name and price.

---

### 🧙 Step 2: Create the Characters

Create two classes:

* `Magician`:

  * Has a `List<MagicItem>`
  * A method `performShow()` that loops through the list and calls `use()` on each item.

* `Musician`:

  * Has a `List<MusicItem>`
  * A method `playConcert()` that loops through the list and calls `use()` on each item.

---

### 🧪 Step 3: Main Program Setup

In your `main()` method:

* Create several magic and music items.
* Create a `Magician` and a `Musician`.
* Add appropriate items to their lists.
* Call `performShow()` and `playConcert()` to see everything in action!

---

### ⭐ Bonus Ideas:

* Add a `rarity` level to `MagicItem` and a `numberOfStrings` or `isAcoustic` to `MusicItem`.
* Make a combined `List<Item>` and loop through it to call `use()` — showing off polymorphism at the top level.
* Add a method to calculate total value of a performer’s equipment.

---

🎯 *This project invites you to have fun with your imagination and practice powerful OOP concepts like inheritance, polymorphism, and classes. You’re not just writing code—you’re creating an enchanted universe that rocks!* 💥

---


