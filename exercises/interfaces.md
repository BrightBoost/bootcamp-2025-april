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