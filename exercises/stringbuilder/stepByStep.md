Absolutely, Maaike! Here are a few **mini exercises on `StringBuilder`** for your students — each one comes with a **step-by-step guide** and explanations. These exercises are great for beginners who are just getting comfortable with Java and string manipulation, and they don't involve classes at all.

---

## 💡 What’s `StringBuilder` again?

A `StringBuilder` is like a magical stretchy string. It’s used when you want to build or change a string without creating a new one every time. It’s more efficient than just using regular `String` when you're doing lots of changes.

---

## 🧪 Mini Exercise 1: Combine Your Name

### 📝 Goal:
Use a `StringBuilder` to combine a first name and last name with a space in between.

---

### ✅ Step-by-Step:

1. **Create a `StringBuilder`:**
   ```java
   StringBuilder sb = new StringBuilder();
   ```

   > This creates an empty, stretchy string builder.

2. **Append your first name:**
   ```java
   sb.append("Maaike");
   ```

   > `.append()` adds text to the end of the `StringBuilder`.

3. **Append a space:**
   ```java
   sb.append(" ");
   ```

   > Adds a space so your full name looks nice.

4. **Append your last name:**
   ```java
   sb.append("van Putten");
   ```

5. **Print the full name:**
   ```java
   System.out.println(sb.toString());
   ```

   > `.toString()` gives you the finished string.

---

## 🔁 Mini Exercise 2: Reverse a Word

### 📝 Goal:
Use `StringBuilder` to reverse a word (like a secret code 😄).

---

### ✅ Step-by-Step:

1. **Create a `StringBuilder` with a word:**
   ```java
   StringBuilder word = new StringBuilder("hello");
   ```

2. **Call `.reverse()` on it:**
   ```java
   word.reverse();
   ```

   > This flips the order of the characters.

3. **Print the result:**
   ```java
   System.out.println(word.toString());
   ```

   > You should see `olleh`.

---

