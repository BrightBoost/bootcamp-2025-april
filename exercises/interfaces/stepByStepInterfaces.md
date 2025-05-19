## ✅ **1. Flyable Interface**

### Step 1: Define the interface

```java
public interface Flyable {
    void fly();
}
```

### Step 2: Implement the interface

```java
public class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flying");
    }
}
```

### Step 3: Use in main method

```java
public class Main {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        bird.fly();
    }
}
```

### 💡 Explanation:

* We define an interface with one method.
* `Bird` implements `Flyable` and provides behavior.
* We store `Bird` in a `Flyable` variable — this is **polymorphism**.

---

## ✅ **2. Playable Interface**

### Step 1: Define the interface

```java
public interface Playable {
    void play();
}
```

### Step 2: Implement in multiple classes

```java
public class Guitar implements Playable {
    public void play() {
        System.out.println("Strumming the guitar.");
    }
}

public class Piano implements Playable {
    public void play() {
        System.out.println("Playing the piano.");
    }
}
```

### Step 3: Use in main

```java
public class Main {
    public static void main(String[] args) {
        Playable g = new Guitar();
        Playable p = new Piano();

        g.play();
        p.play();
    }
}
```

### 💡 Explanation:

* Both classes follow the same interface.
* We can use `Playable` to handle both objects the same way.

---

## ✅ **3. Printable Interface**

### Step 1: Define the interface

```java
public interface Printable {
    void print();
}
```

### Step 2: Implement a `Document` class

```java
public class Document implements Printable {
    private String name;

    public Document(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Printing document: " + name);
    }
}
```

### Step 3: Write a utility method

```java
public class Main {
    public static void printAnything(Printable p) {
        p.print();
    }

    public static void main(String[] args) {
        Document doc = new Document("Week7Notes.txt");
        printAnything(doc);
    }
}
```

### 💡 Explanation:

* We can pass any `Printable` object to the method — it doesn't need to know which class it is.
* This is a **flexible design** pattern.

---

## ✅ **4. Movable Interface**

### Step 1: Define the interface

```java
public interface Movable {
    void move();
}
```

### Step 2: Create two implementations

```java
public class Car implements Movable {
    public void move() {
        System.out.println("Car is moving");
    }
}

public class Bicycle implements Movable {
    public void move() {
        System.out.println("Bicycle is moving");
    }
}
```

### Step 3: Use an array of `Movable`

```java
public class Main {
    public static void main(String[] args) {
        Movable[] movers = {new Car(), new Bicycle()};

        for (Movable m : movers) {
            m.move();
        }
    }
}
```

### 💡 Explanation:

* Interfaces allow grouping different classes in one array or list.
* Each class has different behavior, but we treat them the same.

---

## ✅ **5. Drawable Interface**

### Step 1: Define the interface

```java
public interface Drawable {
    void draw();
}
```

### Step 2: Create shapes

```java
public class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class Square implements Drawable {
    public void draw() {
        System.out.println("Drawing a square.");
    }
}
```

### Step 3: Return interface from method

```java
public class Main {
    public static Drawable getShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else {
            return new Square();
        }
    }

    public static void main(String[] args) {
        Drawable shape = getShape("circle");
        shape.draw();
    }
}
```

### 💡 Explanation:

* We return different concrete classes but always use the interface type.

---

## ✅ **6. Feeding Time with Eaters**

```java
public interface Eater {
    void eat();
}

public class Dog implements Eater {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " the dog is eating.");
    }
}

public class Cat implements Eater {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " the cat is eating.");
    }
}

public class Main {
    public static void main(String[] args) {
        List<Eater> eaters = new ArrayList<>();
        eaters.add(new Dog("Fido"));
        eaters.add(new Cat("Whiskers"));

        for (Eater e : eaters) {
            e.eat();
        }
    }
}
```

### 💡 Explanation:

* We treat `Dog` and `Cat` the same by using the `Eater` interface.

---

## ✅ **7. Calculators at Work**

```java
public interface Calculable {
    int calculate();
}

public class Adder implements Calculable {
    private int a, b;

    public Adder(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a + b;
    }
}

public class Multiplier implements Calculable {
    private int x, y;

    public Multiplier(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int calculate() {
        return x * y;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Calculable> list = List.of(
            new Adder(2, 3),
            new Multiplier(4, 5)
        );

        for (Calculable c : list) {
            System.out.println("Result: " + c.calculate());
        }
    }
}
```

---

## ✅ **8. Let Them Speak**

```java
public interface Speakable {
    void speak();
}

public class Human implements Speakable {
    public void speak() {
        System.out.println("Hello, I’m a human!");
    }
}

public class Robot implements Speakable {
    public void speak() {
        System.out.println("Beep boop. I’m a robot.");
    }
}

public class Parrot implements Speakable {
    public void speak() {
        System.out.println("Polly wants a cracker!");
    }
}

public class Main {
    public static void letThemSpeak(List<Speakable> list) {
        for (Speakable s : list) {
            s.speak();
        }
    }

    public static void main(String[] args) {
        List<Speakable> list = List.of(
            new Human(), new Robot(), new Parrot()
        );
        letThemSpeak(list);
    }
}
```

---

## ✅ **9. Payment Processing**

```java
public interface Payable {
    double getPaymentAmount();
}

public class Invoice implements Payable {
    private int quantity;
    private double pricePerItem;

    public Invoice(int quantity, double pricePerItem) {
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}

public class HourlyEmployee implements Payable {
    private int hours;
    private double rate;

    public HourlyEmployee(int hours, double rate) {
        this.hours = hours;
        this.rate = rate;
    }

    public double getPaymentAmount() {
        return hours * rate;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Payable> payables = List.of(
            new Invoice(5, 20),
            new HourlyEmployee(40, 15.5)
        );

        double total = 0;
        for (Payable p : payables) {
            double amount = p.getPaymentAmount();
            System.out.println("Amount due: $" + amount);
            total += amount;
        }
        System.out.println("Total to pay: $" + total);
    }
}
```

---

## ✅ **10. Transformers Activate**

```java
public interface Transformable {
    void transform();
}

public class Transformer implements Transformable {
    private String name;
    private boolean transformed;

    public Transformer(String name) {
        this.name = name;
        this.transformed = false;
    }

    public void transform() {
        System.out.println(name + " says: Transforming...");
        transformed = true;
    }

    public boolean isTransformed() {
        return transformed;
    }

    public String toString() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Transformer opt = new Transformer("Optimus");
        Transformer bee = new Transformer("Bumblebee");

        List<Transformable> list = List.of(opt, bee);
        for (Transformable t : list) {
            t.transform();
        }

        for (Transformer t : List.of(opt, bee)) {
            System.out.println(t + " transformed? " + t.isTransformed());
        }
    }
}
```

---
