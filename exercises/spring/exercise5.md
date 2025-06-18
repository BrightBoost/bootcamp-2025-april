## 🌱 Exercise: Brewing Magic with BeanSoup

### 🧙‍♀️ Welcome to BeanSoup & MagicBeans Inc.

You’ve just joined a whimsical startup that crafts **magical bean soup** that will be powered by Spring Boot. The secret to the perfect soup? **Magical beans** injected just right.


* Add magical ingredients (beans) 🫘
* Brew them into the soup using Dependency Injection 🔮
* Make the soup come alive from `main()` 💫

---

## 🪄 Setup

You're starting with a basic Spring Boot app with:

```
com.beansoup.magic
├── BeanSoupApplication.java (contains main)
├── soup
│   └── SoupMaker.java
└── config
    └── SoupConfig.java (empty)
```

The app runs but does nothing interesting. The main class looks lonely.

---

## 🧪 Step 1: Warm Up the Pot

Open `BeanSoupApplication.java`.

➡️ Modify the `main()` method to:

* Start the Spring application.
* Retrieve a `SoupMaker` bean from the context.
* Call its `makeSoup()` method.

---

## 🌿 Step 2: Add Some Magic Beans (with `@Component`)

Create **two classes** in a new package called `ingredients`:

* `MagicBean`
* `SpiceBean`

Each should:

* Be marked with `@Component`
* Implement an `Ingredient` interface
* Return a fun string when `describe()` is called, e.g., `"Glowing green beans"` or `"A pinch of dragon salt"`

These are your auto-wired beans! But don’t forget…

---

## 🧂 Step 3: Autowire the Ingredients

In `SoupMaker.java` inject all available `Ingredient` beans using **constructor injection**. (Give the constructor an ingredient array as parameter)

When `makeSoup()` is called, it should:

* Loop over the ingredients
* Print their descriptions
* End with a message like:

  > “Soup made with 2 magical ingredients!”

Try running the app again. It should now print a summary of your soup. Yummy!

---

## 🍲 Step 4: Add a Secret Recipe (with `@Configuration`)

Now spice things up with manual beans.

In `SoupConfig.java`:

* Define a new `@Bean` method returning an `Ingredient` called `SecretSauce`
* Add a fun description like `"Essence of code wizard"`

It should also be picked up in `SoupMaker` automatically. (Hint: Spring sees it like any other bean.)

---

## 🧪 Step 5: Taste Test

Run the app again. It should now include 3 magical ingredients, including your manually configured one.

---

## ✨ Bonus: Make It Seasonal

Can you:

* Add a `@Component` called `SeasonalBean` that is only active in the **“spring”** profile?
* Print a message like “Spring-only ingredients added!” if it's present?

Try activating the profile in `application.properties` or via VM options and re-run the app.
