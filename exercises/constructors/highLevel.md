## 🏗️ **Constructor Exercises in Java**

---

### 🧩 **Level 1: Basic Constructors**

---

#### **1. Create a constructor**
Create a `Book` class with fields: `title`, `author`.  
Add a constructor that takes both values and assigns them.  
In your `main`, create one `Book` and print its title.

---

#### **2. Add a method that uses the fields**
Add a method `describe()` to `Book` that prints:  
**"This book is [title] by [author]"**  
Call it in `main`.

---

#### **3. Add a third field**
Add a field `int pages` to `Book`.  
Update your constructor to accept this as well.  
Update the `describe()` method to include page count.

---

#### **4. Multiple objects**
Create **three different books** using your constructor.  
Print something about each one using `describe()`.

---

#### **5. Create a constructor with default values**
Add a **second constructor** (overloading) that sets the `title` to `"Untitled"`, `author` to `"Unknown"` and `pages` to `0`.  This constructor takes no arguments.
Try creating a `Book` without passing any arguments.

---

### ⚙️ **Level 2: Constructor Overloading & Logic**

---

#### **6. Constructor with logic**
Create a class `Cupcake` with fields: `flavor` and `calories`.  
In the constructor, **print a message**:  
**"Created a cupcake: [flavor], [calories] kcal"**

---

#### **7. Add a method and call it from constructor**
Add a method `isHealthy()` that returns `true` if calories < 200.  
Call this method from the constructor and print whether it’s healthy. Fyi, this is not health advice.

---

#### **8. Constructor validation**
Create a class `Person` with `name` and `age`.  
In the constructor, if age is below 0, print a warning and set age to 0.


---

#### **10. Bonus: Use final fields**
Create a class `Planet` with final fields: `name`, `size`.  (`private final String name`)
Initialize them via constructor.  
Try modifying them after creation (and see it doesn't work).

---

### 🚀 **Level 3: Working with Objects and Arrays**

---


#### **11. Create a `Car` class with a method that uses fields**
Create `Car` with fields `brand`, `year`, and `isElectric`.  Create a constructor for this too.
Add a method `startEngine()` that prints something different for electric and non-electric cars.  
Create two cars with constructor and call the method.

---

#### **12. Compose objects in constructor**
Create a class `Room` with field `String name`.  
Create a class `House` with a constructor that takes a `Room` object.  
In `main`, create a `Room`, then a `House` using that room.  
Print: **"This house has a room called: Kitchen"**

---

#### **13. Constructor with calculations**
Create a class `Rectangle` with fields `length`, `width`, and `area`.  
Calculate the area inside the constructor and store it.  
Add a method to return the area.  
Create 2 rectangles with different dimensions and print their area.

---
