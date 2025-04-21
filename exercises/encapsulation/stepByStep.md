
### ✅ **Step-by-step Instructions**

#### ✅ Step 1: Make the fields `private`

Go into the `Person` class and make this change:

```java
public class Person {
    private String name;
    private int age;
    private String favoriteColor;
}
```

Now nobody can directly mess with your data.

#### ✅ Step 2: Add **getters** and **setters**

Still in the `Person` class, add methods to safely access and update the fields:

```java
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    if (age >= 0) {
        this.age = age;
    } else {
        System.out.println("Age cannot be negative!");
    }
}

public String getFavoriteColor() {
    return favoriteColor;
}

public void setFavoriteColor(String favoriteColor) {
    this.favoriteColor = favoriteColor;
}
```

> ✅ Now you’ve got control — no more negative ages or `null` chaos!

#### ✅ Step 3: Use getters and setters in `App`

Update the `App` class like this:

```java
public class App {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alex");
        p.setAge(-5); // This will now show a warning
        p.setFavoriteColor("blue");

        System.out.println(p.getName() + " is " + p.getAge() + " years old and loves " + p.getFavoriteColor());
    }
}
```

---

### ✅ **Step-by-step Instructions**

#### ✅ Step 1: Create a new class, e.g. `Book`

```java
package week2.oop;

public class Book {
    private String title;
    private String author;
    private int pages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        } else {
            System.out.println("A book must have at least one page!");
        }
    }
}
```

#### ✅ Step 2: Use the `Book` class in `App`

```java
public class App {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.setTitle("How to Train Your Java");
        myBook.setAuthor("Maaike van Putten");
        myBook.setPages(120);

        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Pages: " + myBook.getPages());
    }
}
```

---