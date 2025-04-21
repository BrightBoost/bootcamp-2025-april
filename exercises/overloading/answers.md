

### ❓**Questions + Answers **

---

#### **1. Which method gets called here?**

```java
Book b = new Book("Clean Code", "Robert C. Martin", 464);
b.describe();
```

✅ **Answer**: The no-argument version: `describe()`  
🧠 *Because there are no arguments passed, Java looks for the version with no parameters.*

---

#### **2. Which method is called here?**

```java
b.describe("A great read for developers!");
```

✅ **Answer**: `describe(String extraInfo)`  
🧠 *Because a single `String` is passed.*

---

#### **3. What is the output of this call?**

```java
b.describe(120);
```

✅ **Answer**:  
`Currently on page 120 of Clean Code`  
🧠 *It matches the version that takes one `int`.*

---

#### **4. True or False: The following will cause a compile error**

```java
b.describe(120, "In the office");
```

✅ **Answer**: **True**  
🧠 *Java will not find a matching method with parameters (int, String). Only (String, int) exists.*

---

#### **5. Which method gets called here?**

```java
b.describe("On the train", 45);
```

✅ **Answer**: `describe(String location, int currentPage)`  
🧠 *Because the order and types match this version.*

---

#### **6. Can you overload a method by only changing the return type? (e.g. `int describe()` and `void describe()`)?**

✅ **Answer**: **No**  
🧠 *Overloading requires a different parameter list — return type alone is not enough.*

---

#### **7. Challenge: What would happen here?**

```java
b.describe(45);
b.describe("page 45");
b.describe("page 45", 45);
b.describe();
```

✅ **Answer**:

- `describe(45)` → Calls `describe(int)`
- `describe("page 45")` → Calls `describe(String)`
- `describe("page 45", 45)` → Calls `describe(String, int)`
- `describe()` → Calls no-arg version

---
