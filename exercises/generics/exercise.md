## 💻🐶 Exercise: From Duplicate Bags to Generic Power

**Hey code wizard!**
Today you’ll discover how **generics** can make your code cleaner, smarter, and reusable. You’ll first create two separate bag classes—one for laptops and one for chihuahuas—and then refactor them into a single, powerful generic class. Let’s go! 🚀

---

### 🪜 Step 1: Create Two Simple Classes

Start by creating two basic classes:

#### ✅ `Laptop` class

* Field: `String brand`
* Constructor to set the brand
* `toString()` method that returns something like: `"Laptop: Apple"`

#### ✅ `Chihuahua` class

* Field: `String name`
* Constructor to set the name
* `toString()` method that returns something like: `"Chihuahua: Mr. Fluffypaws"`

---

### 🪜 Step 2: Create Two Separate Bag Classes

Now you’ll make two classes with identical structure but for different types of objects.

#### ✅ `LaptopBag` class

* Field: `List<Laptop> items`
* Method: `add(Laptop laptop)`
* Method: `printContents()` – prints all laptops in the bag

#### ✅ `ChihuahuaBag` class

* Field: `List<Chihuahua> items`
* Method: `add(Chihuahua chihuahua)`
* Method: `printContents()` – prints all chihuahuas in the bag

🧠 *Notice anything? Yup, the code is nearly identical! That’s our cue to use generics.*

---

### 🪜 Step 3: Create a Generic `Bag<T>` Class

Let’s clean things up!

#### ✅ `Bag<T>` class

* Field: `List<T> items`
* Method: `add(T item)`
* Method: `printContents()` – prints all items in the bag

Now you no longer need `LaptopBag` or `ChihuahuaBag`.

---

### 🪜 Step 4: Use Your Generic Class in `main()`

In your `main()` method:

1. Create a `Bag<Laptop>`, add a few laptops, and print the contents.
2. Create a `Bag<Chihuahua>`, add a few chihuahuas, and print the contents.

✅ It should work the same as before—only now with **way less code**!

---

### ✨ Bonus Challenge (Optional):

* Add a method `getFirstItem()` in `Bag<T>` that returns the first item or `null` if the list is empty.
* Add a `Bag<String>` just for fun—what happens?

---

### 🎯 What You’ve Learned:

* How to reduce code duplication using **generics**
* How to create and use a **generic class**
* That `Bag<T>` can hold **anything** – laptops, chihuahuas, even strings!

---
