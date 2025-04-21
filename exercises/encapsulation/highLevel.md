

## 🛡️ **Encapsulation Exercise Part 1: Improve a Non-Encapsulated Class**

### 🎯 **High-level Goal**
You’ll start with a "bad" class where everything is public (yikes!) and fix it using **encapsulation**. That means:
- Making fields `private`
- Adding **getters** and **setters**
- Using those getters and setters in a separate class (like `App`) to interact with the object properly

---

### 📝 The Bad Example

Here's the messy, non-encapsulated class:

```java
package week2.oop;

public class Person {
    public String name;
    public int age;
    public String favoriteColor;
}
```

And here’s how it’s being used:

```java
package week2.oop;

public class App {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Alex";
        p.age = -5; // uh-oh!
        p.favoriteColor = null;

        System.out.println(p.name + " is " + p.age + " years old and loves " + p.favoriteColor);
    }
}
```

This is a classic "oops" example: no control over what goes in the fields. Let’s fix it.

---


## 🧱 **Encapsulation Exercise Part 2: Create Your Own Encapsulated Class**

### 🎯 **High-level Goal**
Now it’s your turn. Create your own well-encapsulated `Book` class from scratch, with:
- At least **three fields** (all private)
- **Getters and setters** for each field
- Some basic **validation** in at least one setter
- A separate class that uses the object via the getters/setters

---


### 💬 Bonus challenge (optional)
- Add a method like `read()` that prints a message based on how many pages the book has.
- Try adding a boolean like `isFiction` and make a fun setter message: “Ah, a fictional tale!” or “Real-life drama, huh?”

