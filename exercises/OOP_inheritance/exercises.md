Recap all you learnt about **inheritance**, **encapsulation**, and **composition**.
---

### 🐶 1. Simple Inheritance

**Create two classes:**

* `Animal` with a method `makeSound()` that prints `"Some sound"`.
* `Dog` that extends `Animal` and adds a method `wagTail()` that prints `"Wagging tail"`.

**Task**: Create a `Dog` object and call both methods.

---

### 🚗 2. Vehicle and Car

**Create two classes:**

* `Vehicle` with an `int speed` and a `getSpeed()` method.
* `Car` that extends `Vehicle` and sets `speed` to 100 (manually for now, no constructor).

**Task**: Access the speed from a `Car` object using the getter.

---

### 👤 3. Encapsulation Practice

**Create a class `Person`** with private fields: `name` and `age`.

**Task**: Add public getters and setters, and test them from a `main()` method.

---

### 🛏 4. Composition: House and Bed

**Create two classes:**

* `Bed` with method `sleep()` that prints `"Sleeping..."`.
* `House` with a `Bed` object as a field.

**Task**: From a `House` object, call `sleep()` via its `Bed`.

---

### 🐱 5. Cat extends Pet

**Create:**

* `Pet` class with a private field `name` and a getter.
* `Cat` class that extends `Pet`.

**Task**: Create a `Cat` object, set a name (via setter in `Pet`), and print it.

---

### ✈️ 6. Flying Object Hierarchy

**Create:**

* `FlyingObject` with a method `fly()` printing `"I'm flying!"`.
* `Airplane` and `Bird` both extend `FlyingObject`.

**Task**: Create one of each and call `fly()`.

---

### 📦 7. Product and DiscountedProduct

**Create:**

* `Product` with private `price` field and getter/setter.
* `DiscountedProduct` that extends `Product` and adds a method `applyDiscount(double percent)`.

**Task**: Create a discounted product, set price, apply 10% discount, and print final price.

---

### 🎓 8. Student and Grade

**Create:**

* `Grade` class with field `score` and method `pass()` returning true if score >= 50.
* `Student` class that has a `Grade` object as a field.

**Task**: Set a score and check if the student passed.

---

### 🖼 9. Shape Hierarchy

**Create:**

* `Shape` with method `draw()`.
* `Circle` and `Square` that extend `Shape` and each override `draw()` to print `"Drawing a circle"` / `"Drawing a square"`.

**Task**: Create both shapes and call `draw()`.

> Note: They haven't learned polymorphism yet, so don't use base class references.

---

### 📚 10. Bookstore Example

**Create:**

* `Book` class with fields `title` and `author`, both private with getters/setters.
* `Bookstore` class with an array of 3 `Book` objects.

**Task**: Populate the array and print out the titles of all books.


