### ✅ **Part 1: Writing and Using Lambda Expressions (Custom + Built-in Interfaces)**

**Goal:** Understand how to define and implement lambdas using both custom and built-in functional interfaces.

---

#### 🔸 **Section A: Custom Functional Interfaces (Ex. 15–20)**

**15. Lambda for Checking Even or Odd**
Create a `NumberTester` interface that returns true if a number is even.

* Define `NumberTester` with a method `boolean test(int number);`
* Use a lambda in `main` to check numbers like 2, 5, and 10.

```java
int[] numbers = {2, 5, 10, 13, 20};
```

---

**16. CHALLENGE: Lambda for Multiplying Two Doubles**
Use the built-in `DoubleBinaryOperator` functional interface to multiply two numbers.

* Look up the interface (Ctrl+Click `DoubleBinaryOperator`)
* Create a lambda to multiply two doubles, then apply it to pairs:

```java
double a = 4.5, b = 3.2;
```

---

**17. Lambda for Combining First and Last Name**
Create a `NameCombiner` interface with `String combine(String firstName, String lastName);`.

* Create a lambda to return `"First Last"` and test it:

```java
System.out.println(combiner.combine("Ada", "Lovelace"));
```

---

**18. Lambda for Checking Palindrome**
Create a generic interface `Checker<T>` with method `boolean check(T value);`.
Use it with a lambda to check if a string is a palindrome (e.g., "level", "racecar", "hello").

```java
String[] words = {"level", "banana", "madam", "world"};
```

---

**19. Lambda for Repeating a String**
Create `StringAction` interface: `String act(String str, int times);`.

* Implement it with a lambda to repeat a string a certain number of times.
* Try inputs like:

```java
("Hi", 3) // should return "HiHiHi"
```

---

**20. Lambda for Greeting**
Create `Greeter` interface: `void greet(String name);`
Implement with a lambda that prints: `Hello, [name]!`
Try calling `greeter.greet("Maaike");`

---

#### 🔸 **Section B: Built-In Functional Interfaces (Ex. 21–30)**

**21. Use `Consumer<String>` to print all-uppercase strings from a list**

```java
List<String> words = List.of("hello", "world", "lambda");
```

---

**22. Use `Predicate<String>` to filter non-empty strings from a list**

```java
List<String> data = List.of("Java", "", "Streams", "", "Fun");
```

---

**23. Use `Supplier<LocalDateTime>` to provide the current timestamp**

* Print the result of calling `.get()`.

---

**24. Use  `Function<String, Integer>` to compute the length of a string**

```java
List<String> names = List.of("Eve", "Charles", "Bob");
```

---

**25. BONUS: Use `BiFunction<String, String, String>` to concatenate two strings with a dash**

* Input: `"data"`, `"science"` → Output: `"data-science"`

---

**26. BONUS: Use `UnaryOperator<Integer>` to increment a number by 1**
Test with numbers like `5, 9, 12`.

---

**27. BONUS: Use `BinaryOperator<Integer>` to find the max of two numbers**
Test with pairs like `(10, 20)`, `(5, 3)`.

---

**28. BONUS: Chain `Function<String, Integer>` and `Function<Integer, Boolean>` to check if a string has even length**

* Input: `"Test"` → true
* Input: `"Hello"` → false

---

**29. Use `Predicate<Integer>` with `removeIf` to delete negative numbers from a list**

```java
List<Integer> numbers = new ArrayList<>(List.of(4, -2, 0, -7, 9));
```

---

**30. BONUS: Create a method `applyOperation(int a, int b, BiFunction<Integer, Integer, Integer> operation)` and pass lambdas for add/subtract**

* Call it like:

```java
applyOperation(5, 3, (x, y) -> x + y);
applyOperation(10, 7, (x, y) -> x - y);
```

---

### ✅ **Part 2: Java Stream API Exercises**

**Goal:** Get comfortable with stream operations like `filter`, `map`, `collect`, `peek`, `count`, `sorted`, etc.

---

#### 🔸 **Section C: Basic Stream Operations (Ex. 31–40)**

**31. Filter a list of strings to include only those starting with "A"**

```java
List<String> words = List.of("Apple", "Banana", "Avocado", "Cherry", "Apricot");
```

---

**32. Map a list of names to their lengths**

```java
List<String> names = List.of("Alice", "Bob", "Charlotte", "Dan");
```

---

**33. Count how many strings are longer than 5 characters**

```java
List<String> phrases = List.of("Hello", "World", "Functional", "Programming", "Java");
```

---

**34. Sort a list of integers in descending order using streams**

```java
List<Integer> numbers = List.of(5, 3, 9, 1, 8);
```

---

**35. Convert a list of strings to uppercase using `map`**

```java
List<String> words = List.of("java", "stream", "lambda");
```

---

**36. Store only even numbers into a new list (you can use `toList()`)**

```java
List<Integer> values = List.of(4, 7, 10, 13, 16);
```

---

**37. Use `forEach` to print all elements after sorting alphabetically**

```java
List<String> animals = List.of("Zebra", "Elephant", "Cat", "Dog", "Bear");
```

---

**38. Use `peek` to log every step of a stream before storing in a new list**

```java
List<String> items = List.of("Box", "Ball", "Book", "Bottle");
```

* Filter items starting with 'B', peek each step, map to lowercase, store in new list.

---

**39. BONUS: Use `anyMatch`, `allMatch`, `noneMatch` on a list of strings**

```java
List<String> cities = List.of("Amsterdam", "Rotterdam", "Arnhem", "Delft", "Utrecht");
```

* Any start with "A"?
* All longer than 3?
* None empty?

---

**40. BONUS: Use `findFirst` to get the first element that matches a condition**

```java
List<String> emails = List.of("admin@example.com", "info@company.com", "user@gmail.com");
```

* Find the first that ends with `@gmail.com`.

---
