## 📄 **FileReader & FileWriter Exercises – Java**


### 🟢 **Level 1: Writing and Reading Basics**

---

### ✅ **1. Write a single line to a file**
Create a file named `output.txt` and write:  
**"Hello, file world!"**

🧠 *Focus: `FileWriter` basics*

---

### ✅ **2. Read that line back**
Read from `output.txt` and print the line to the console.

🧠 *Focus: `FileReader`, char-by-char or with `BufferedReader`*

---

### ✅ **3. Write multiple lines from an array**
Create a `String[]` with lines of text like a short poem.  
Write all lines to a file, one per line.

🧠 *Focus: `for` loop with `FileWriter`*

---

### ✅ **4. Read file line-by-line and print**
Use `BufferedReader` to read your poem back, line by line.

🧠 *Focus: reading lines using `.readLine()` in a loop*

---

### 🟡 **Level 2: Input + Output Together**

---

### ✅ **5. Ask the user for lines and save to a file**
Use `Scanner` to let the user type 3 lines.  
Write each line to a file.

🧠 *Focus: Combine `Scanner` input + `FileWriter`*

---

### ✅ **6. Count how many times a word appears**
Ask the user for a word, then read a file and count how often that word appears.

🧠 *Focus: Looping through lines, using `.contains()`*

---

### 🔵 **Level 3: Files + Custom Objects**

---

### ✅ **7. Save an array of `Book` objects to file**
Create a `Book` class with fields: `title`, `author`.  
Create 3 `Book` objects in an array.  
Write each book as a line in the file like:

```
Clean Code;Robert C. Martin
Effective Java;Joshua Bloch
Head First Java;Kathy Sierra
```

🧠 *Focus: Custom formatting with `FileWriter`*

---

### ✅ **8. BONUS: Read a file and build an array of `Book` objects**
Read a file with book data (like the one above),  
Split each line by `;` and create a `Book` object for each.

```
The Hobbit|J.R.R. Tolkien
1984|George Orwell
Pride and Prejudice|Jane Austen
To Kill a Mockingbird|Harper Lee
The Catcher in the Rye|J.D. Salinger
The Great Gatsby|F. Scott Fitzgerald
Moby-Dick|Herman Melville
War and Peace|Leo Tolstoy
```

🧠 *Focus: `String.split()`, object creation, storing in array/list*

---

### ✅ **9. Bonus: Let the user add a book to a file**
Ask the user for a book title and author using `Scanner`,  
Create a new `Book` and add it to the file without erasing the old data (append mode).

🧠 *Focus: `FileWriter(true)` for appending, combining file + input + object logic*

---


