### **1. `Flyable` Interface**

**Goal:** Practice implementing an interface.

**Interface:**

```java
public interface Flyable {
    void fly();
}
```

**Exercise:**
Create a class `Bird` that implements `Flyable`. Print `"Bird is flying"` in the `fly` method.

---

### **2. `Playable` Interface**

**Goal:** Practice multiple classes implementing the same interface.

**Interface:**

```java
public interface Playable {
    void play();
}
```

**Exercise:**
Create two classes `Guitar` and `Piano` that both implement `Playable`. Each should print its own message in `play()`.

---

### **3. `Printable` Interface**

**Goal:** Pass interface types as method parameters.

**Interface:**

```java
public interface Printable {
    void print();
}
```

**Exercise:**
Create a class `Document` that implements `Printable`.
Write a method `static void printAnything(Printable p)` and call it with a `Document` object.

---

### **4. `Movable` Interface**

**Goal:** Work with arrays of interface types.

**Interface:**

```java
public interface Movable {
    void move();
}
```

**Exercise:**
Create classes `Car` and `Bicycle` that implement `Movable`.
Store them in an array of `Movable[]` and call `move()` in a loop.

---

### **5. `Drawable` Interface**

**Goal:** Interface as return type.

**Interface:**

```java
public interface Drawable {
    void draw();
}
```

**Exercise:**
Create classes `Circle` and `Square` that implement `Drawable`.
Write a method `Drawable getShape(String type)` that returns either a `Circle` or a `Square` depending on the input.

---

### **Exercise 6: Feeding Time with Eaters**

**Topic:** Interfaces and Polymorphism

**Instructions:**

1. Create an interface called `Eater` with a method `void eat();`
2. Implement two classes, `Dog` and `Cat`, that both implement `Eater`.

   * Each should have a `name` field set via the constructor.
   * Their `eat()` method should print a message like `"Whiskers the cat is eating."`
3. In your main method, create a `List<Eater>` and add a few `Dog` and `Cat` objects.
4. Loop through the list and call `eat()` on each object.

**Goal:** Use an interface type (`Eater`) to store and interact with multiple class types polymorphically.

---

### **Exercise 7: Calculators at Work**

**Topic:** Interfaces with Return Values

**Instructions:**

1. Create an interface `Calculable` with a method `int calculate();`
2. Create two classes:

   * `Adder` — initialized with two numbers, returns their sum.
   * `Multiplier` — initialized with two numbers, returns their product.
3. In your main method, create a `List<Calculable>` with different `Adder` and `Multiplier` instances.
4. Loop through the list and print out the result of `calculate()` for each.

**Bonus:** Add labels to show whether the result is a sum or product.

---

### **Exercise 8: Let Them Speak**

**Topic:** Interfaces + Polymorphism in Action

**Instructions:**

1. Create an interface called `Speakable` with a method `void speak();`
2. Implement this interface in three classes:

   * `Human`: speaks like a human
   * `Robot`: speaks in a robot voice
   * `Parrot`: repeats a parrot-like phrase
3. Create a method `letThemSpeak(List<Speakable> list)` that loops through the list and calls `speak()` on each item.
4. In `main`, create a list of `Speakable` objects and pass it to `letThemSpeak()`.

**Challenge:** Add another class like `Alien` or `Cow` that also implements `Speakable`.

---

### **Exercise 9: Payment Processing**

**Topic:** Interfaces and Calculation with Different Implementations

**Instructions:**

1. Create an interface `Payable` with the method `double getPaymentAmount();`
2. Implement two classes:

   * `Invoice`: takes a quantity and price per item, and returns the total.
   * `HourlyEmployee`: takes hours worked and hourly rate, and returns the total pay.
3. In your main method, create a `List<Payable>` with both types of objects.
4. Loop through the list and:

   * Print the payment amount for each.
   * Keep a running total and print it at the end.

**Extra:** Add a new class `Freelancer` that returns a fixed project price.

---

### **Exercise 10: Transformers Activate**

**Topic:** State Change and Checking via Interface

**Instructions:**

1. Create an interface `Transformable` with method `void transform();`
2. Create a class `Transformer` that:

   * Implements `Transformable`
   * Has a `name` field set through the constructor
   * Has a `boolean transformed` field that becomes `true` when `transform()` is called
   * Has a method `isTransformed()` to check the status
3. In your main method:

   * Create a `List<Transformable>` to store `Transformer` objects
   * Call `transform()` on each
   * After transforming, loop again (over concrete `Transformer` objects this time) and print whether each one is transformed

**Tip:** You'll need to track your `Transformer` instances in a way that lets you call `isTransformed()` later — think carefully about your lists.
