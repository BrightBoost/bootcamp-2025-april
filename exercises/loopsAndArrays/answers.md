## ✅ **Answers & Explanations: Loops and Arrays in Java**

---

### 🟢 **Level 1: Loops with basic arrays (int, String)**

---

### **1. Print numbers with a for loop**

```java
int[] numbers = {1, 2, 3, 4, 5};

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

🧠 **Explanation**:  
We use `i` to loop through each position in the array (`index`). Arrays in Java start at index `0`, so this prints every number one by one.

---

### **2. Count backwards with a while loop**

```java
int i = 5;

while (i > 0) {
    System.out.println(i);
    i--;
}
```

🧠 **Explanation**:  
This loop starts at 5 and keeps decreasing `i` until it’s no longer greater than 0.

---

### **3. Greet each person**

```java
String[] names = {"Alice", "Bob", "Charlie"};

for (int i = 0; i < names.length; i++) {
    System.out.println("Hello, " + names[i] + "!");
}
```

🧠 **Explanation**:  
Each loop grabs the name at index `i` and prints a greeting with it.

---

### **4. Calculate the total**

```java
int[] nums = {3, 5, 7, 2, 8};
int sum = 0;

for (int i = 0; i < nums.length; i++) {
    sum += nums[i];
}

System.out.println("Total: " + sum);
```

🧠 **Explanation**:  
We use a `sum` variable and keep adding each number in the array to it.

---

### **5. Print only even numbers**

```java
int[] nums = {4, 7, 10, 15, 18};

for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 2 == 0) {
        System.out.println(nums[i]);
    }
}
```

🧠 **Explanation**:  
Even numbers have no remainder when divided by 2 (`% 2 == 0`).

---

### **6. Stop at a certain value (while loop)**

```java
int[] values = {1, 3, 5, 7, 9};
int i = 0;

while (i < values.length && values[i] != 7) {
    System.out.println(values[i]);
    i++;
}
```

🧠 **Explanation**:  
We loop while the value is not `7` and we're still inside the array. We stop before printing 7.

---

### **7. Ask until valid input (do-while)**

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
String input;

do {
    System.out.print("Enter password: ");
    input = scanner.nextLine();
} while (!input.equals("secret123"));

System.out.println("Access granted!");
```

🧠 **Explanation**:  
`do-while` always runs at least once. The loop repeats until the input is `"secret123"`.

---

### 🟡 **Level 2: Arrays with calculations, conditions**

---

### **8. Count how many times "Java" appears**

```java
String[] languages = {"Java", "Python", "Java", "C#", "Java"};
int count = 0;

for (int i = 0; i < languages.length; i++) {
    if (languages[i].equals("Java")) {
        count++;
    }
}

System.out.println("Java appears " + count + " times.");
```

🧠 **Explanation**:  
Use `.equals()` for string comparison. Count each time "Java" shows up.

---

### **9. Find the largest number**

```java
int[] numbers = {12, 5, 90, 34, 7};
int max = numbers[0];

for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] > max) {
        max = numbers[i];
    }
}

System.out.println("Largest: " + max);
```

🧠 **Explanation**:  
We start by assuming the first number is the biggest, then check the others one by one.

---

### **10. Compare two arrays**

```java
int[] a = {1, 2, 3};
int[] b = {1, 2, 4};
boolean areEqual = true;

if (a.length != b.length) {
    areEqual = false;
} else {
    for (int i = 0; i < a.length; i++) {
        if (a[i] != b[i]) {
            areEqual = false;
            break;
        }
    }
}

System.out.println(areEqual);
```

🧠 **Explanation**:  
We first check if the lengths are equal. If they are, we compare each element one by one.

---

### **11. Copy one array to another**

```java
int[] a = {1, 2, 3, 4};
int[] b = new int[a.length];

for (int i = 0; i < a.length; i++) {
    b[i] = a[i];
}

System.out.println("Copied!");
```

🧠 **Explanation**:  
Simple copy: each value from `a` goes into the same position in `b`.

---

### **12. Reverse an array**

```java
int[] nums = {10, 20, 30};

for (int i = nums.length - 1; i >= 0; i--) {
    System.out.println(nums[i]);
}
```

🧠 **Explanation**:  
Start at the last index (`length - 1`) and count backwards to 0.

---

### 🔵 **Level 3: Arrays of objects (Book[])**

---

### **13. Create and loop through Book array**

```java
public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
```

```java
Book[] books = {
    new Book("Book A", "Alice"),
    new Book("Book B", "Bob"),
    new Book("Book C", "Charlie")
};

for (int i = 0; i < books.length; i++) {
    System.out.println(books[i].title);
}
```

🧠 **Explanation**:  
Each `Book` object is created using the constructor and stored in the array. The loop prints each title.

---

### **14. Count books by a certain author**

```java
int count = 0;

for (int i = 0; i < books.length; i++) {
    if (books[i].author.equals("Alice")) {
        count++;
    }
}

System.out.println("Books by Alice: " + count);
```

🧠 **Explanation**:  
Loop through and use `.equals()` to compare authors.

---

### **15. Print books with more than X pages**

Add a `pages` field to the class:

```java
public class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}
```

```java
Book[] books = {
    new Book("Big Book", "Alice", 400),
    new Book("Short Story", "Bob", 120),
    new Book("Novel", "Charlie", 310)
};

for (int i = 0; i < books.length; i++) {
    if (books[i].pages > 300) {
        System.out.println(books[i].title);
    }
}
```

🧠 **Explanation**:  
We check if each book has more than 300 pages and print its title if it does.

---
