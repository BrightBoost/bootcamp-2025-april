
## 📚 **Method Overloading Questions**

---

### ✅ **What you should know first:**

**Method overloading** means having **multiple methods with the same name** but **different parameter lists**. Java figures out which one to call based on:
- The **number of arguments**
- The **types of arguments**
- The **order of arguments**

Please mind: the name of the argument is not important for overloading.

---

### 📘 **Given this `Book` class:**

```java
public class Book {
    // Not well encapsulated though, not relevant here
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void describe() {
        System.out.println("This book is " + title + " by " + author + " with " + pages + " pages.");
    }

    // Overloaded methods
    public void describe(String extraInfo) {
        System.out.println("This book is " + title + " by " + author + ". " + extraInfo);
    }

    public void describe(int currentPage) {
        System.out.println("Currently on page " + currentPage + " of " + title);
    }

    public void describe(String location, int currentPage) {
        System.out.println("Reading " + title + " at " + location + ", page " + currentPage);
    }
}
```

---

### ❓**Questions**

---

#### **1. Which method gets called here?**

```java
Book b = new Book("Clean Code", "Robert C. Martin", 464);
b.describe();
```

---

#### **2. Which method is called here?**

```java
b.describe("A great read for developers!");
```


---

#### **3. What is the output of this call?**

```java
b.describe(120);
```


---

#### **4. True or False: The following will cause a compile error**

```java
b.describe(120, "In the office");
```


---

#### **5. Which method gets called here?**

```java
b.describe("On the train", 45);
```

---

#### **6. Can you overload a method by only changing the return type? (e.g. `int describe()` and `void describe()`)?**


---

#### **7. Challenge: What would happen here?**

```java
b.describe(45);
b.describe("page 45");
b.describe("page 45", 45);
b.describe();
```


---
