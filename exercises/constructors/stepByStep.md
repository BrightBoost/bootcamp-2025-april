## 🧩 **Level 1: Basic Constructors — Step by Step**

---

### ✅ **1. Create a constructor**

**Goal**: Learn how to define and use a constructor that takes two parameters.

#### 👣 Step-by-Step:

1. Create a new file called `Book.java`.
2. Add the class and two fields:

   ```java
   public class Book {
       String title;
       String author;
   }
   ```

3. Add a constructor that takes title and author as input:

   ```java
   public Book(String title, String author) {
       this.title = title;
       this.author = author;
   }
   ```

4. In your `App.java` or `Main.java`, do this:

   ```java
   public class App {
       public static void main(String[] args) {
           Book myBook = new Book("Java for Starters", "Maaike");
           System.out.println(myBook.title);
       }
   }
   ```

---

### ✅ **2. Add a method that uses the fields**

**Goal**: Add a method to the class that prints something using the fields.

#### 👣 Step-by-Step:

1. In `Book.java`, add this method:

   ```java
   public void describe() {
       System.out.println("This book is " + title + " by " + author);
   }
   ```

2. In `App.java`:

   ```java
   myBook.describe(); // This should now print a full sentence
   ```

---

### ✅ **3. Add a third field**

**Goal**: Add a field for number of pages and include it in the constructor and method.

#### 👣 Step-by-Step:

1. In `Book.java`, add:

   ```java
   int pages;
   ```

2. Update the constructor:

   ```java
   public Book(String title, String author, int pages) {
       this.title = title;
       this.author = author;
       this.pages = pages;
   }
   ```

3. Update the `describe()` method:

   ```java
   public void describe() {
       System.out.println("This book is " + title + " by " + author + " with " + pages + " pages.");
   }
   ```

4. Update your main method:

   ```java
   Book myBook = new Book("Java for Starters", "Maaike", 100);
   myBook.describe();
   ```

---

### ✅ **4. Multiple objects**

**Goal**: Create multiple instances using the constructor.

#### 👣 Step-by-Step:

1. In your `App.java`, create more books:

   ```java
   Book b1 = new Book("Book One", "Alice", 150);
   Book b2 = new Book("Book Two", "Bob", 200);
   Book b3 = new Book("Book Three", "Charlie", 300);
   ```

2. Call `describe()` on all of them:

   ```java
   b1.describe();
   b2.describe();
   b3.describe();
   ```

---

### ✅ **5. Create a constructor with default values**

**Goal**: Add a constructor that sets default values (constructor overloading).

#### 👣 Step-by-Step:

1. Add this constructor to your `Book` class:

   ```java
   public Book() {
       this.title = "Untitled";
       this.author = "Unknown";
       this.pages = 0;
   }
   ```

2. Now you can do:

   ```java
   Book mysteryBook = new Book();
   mysteryBook.describe(); // Should print: "This book is Untitled by Unknown with 0 pages."
   ```

---

## ⚙️ **Level 2: Constructor Logic — Step by Step**

---

### ✅ **6. Constructor with logic**

**Goal**: Print something when the object is created.

#### 👣 Step-by-Step:

1. Create `Cupcake.java`:

   ```java
   public class Cupcake {
       String flavor;
       int calories;

       public Cupcake(String flavor, int calories) {
           this.flavor = flavor;
           this.calories = calories;
           System.out.println("Created a cupcake: " + flavor + ", " + calories + " kcal");
       }
   }
   ```

2. In `App.java`:

   ```java
   Cupcake chocolate = new Cupcake("Chocolate", 180);
   ```

---

### ✅ **7. Add a method and call it from constructor**

**Goal**: Use a method in the constructor.

#### 👣 Step-by-Step:

1. Add this method to `Cupcake`:

   ```java
   public boolean isHealthy() {
       return calories < 200;
   }
   ```

2. In the constructor, call it:

   ```java
   if (isHealthy()) {
       System.out.println("This cupcake is healthy-ish.");
   } else {
       System.out.println("Treat yourself! 🍰");
   }
   ```

---

### ✅ **8. Constructor validation**

**Goal**: Add logic to prevent invalid data.

#### 👣 Step-by-Step:

1. Create `Person.java`:

   ```java
   public class Person {
       String name;
       int age;

       public Person(String name, int age) {
           this.name = name;
           if (age < 0) {
               System.out.println("Age cannot be negative, setting to 0.");
               this.age = 0;
           } else {
               this.age = age;
           }
       }
   }
   ```

2. In `App.java`:

   ```java
   Person p1 = new Person("Luna", -3);
   ```

---

### ✅ **10. Bonus: Use final fields**

**Goal**: Learn about `final` fields — once set, they can't be changed.

#### 👣 Step-by-Step:

1. Create `Planet.java`:

   ```java
   public class Planet {
       private final String name;
       private final double size;

       public Planet(String name, double size) {
           this.name = name;
           this.size = size;
       }

       public String getName() {
           return name;
       }

       public double getSize() {
           return size;
       }
   }
   ```

2. In `App.java`:

   ```java
   Planet earth = new Planet("Earth", 12742);
   System.out.println("Planet: " + earth.getName());
   ```

3. Try changing the name like this:

   ```java
   // earth.name = "Mars"; ❌ This will give a compile error
   ```

---

## 🚀 **Level 3: Objects and Logic — Step by Step**

---

### ✅ **11. Create a `Car` class with method**

**Goal**: Different behavior based on field value.

#### 👣 Step-by-Step:

1. Create `Car.java`:

   ```java
   public class Car {
       String brand;
       int year;
       boolean isElectric;

       public Car(String brand, int year, boolean isElectric) {
           this.brand = brand;
           this.year = year;
           this.isElectric = isElectric;
       }

       public void startEngine() {
           if (isElectric) {
               System.out.println(brand + " hums quietly. 🔋");
           } else {
               System.out.println(brand + " roars to life! 🔥");
           }
       }
   }
   ```

2. In `App.java`:

   ```java
   Car tesla = new Car("Tesla", 2022, true);
   Car bmw = new Car("BMW", 2020, false);
   tesla.startEngine();
   bmw.startEngine();
   ```

---

### ✅ **12. Compose objects in constructor**

**Goal**: Use one object inside another.

#### 👣 Step-by-Step:

1. Create `Room.java`:

   ```java
   public class Room {
       String name;

       public Room(String name) {
           this.name = name;
       }
   }
   ```

2. Create `House.java`:

   ```java
   public class House {
       Room room;

       public House(Room room) {
           this.room = room;
       }

       public void describe() {
           System.out.println("This house has a room called: " + room.name);
       }
   }
   ```

3. In `App.java`:

   ```java
   Room kitchen = new Room("Kitchen");
   House house = new House(kitchen);
   house.describe();
   ```

---

### ✅ **13. Constructor with calculations**

**Goal**: Store calculated values in a field.

#### 👣 Step-by-Step:

1. Create `Rectangle.java`:

   ```java
   public class Rectangle {
       int length;
       int width;
       int area;

       public Rectangle(int length, int width) {
           this.length = length;
           this.width = width;
           this.area = length * width;
       }

       public int getArea() {
           return area;
       }
   }
   ```

2. In `App.java`:

   ```java
   Rectangle r1 = new Rectangle(4, 5);
   Rectangle r2 = new Rectangle(10, 3);

   System.out.println("Area 1: " + r1.getArea());
   System.out.println("Area 2: " + r2.getArea());
   ```

---
