### Task

* Create a model `Category` based on the `categories` table (`CategoryID`, `CategoryName`, `Description`).
* Create a DAO class `CategoryDao` and configure the datasource.
* Add these methods to the DAO:

  * `List<Category> getAllCategories()`
  * `Category getCategoryById(int id)`
  * `void addCategory(Category category)`
  * `void updateCategory(Category category)`
  * `void deleteCategory(int id)`

* Create a `CategoryController` with the following endpoints:

  * `GET /categories` – all categories
  * `GET /categories/{id}` – one category
  * `POST /categories` – add new category
  * `PUT /categories/{id}` – update a category
  * `DELETE /categories/{id}` – delete a category

### Hints

* `PUT` should replace the entire category (except ID).
* Use Postman or curl to test `POST`, `PUT`, and `DELETE`.

---

## 🌟 Bonus: Connect products and categories (Intro to JOIN)

### Goal

Enhance the `/products` endpoint to return the category name for each product (extra field: `categoryName`).

### Steps

* In your `Product` model, **add a new field**: `String categoryName`.
* In your DAO method `getAllProducts()`, **replace the SQL** with a JOIN:

```sql
SELECT p.ProductID, p.ProductName, p.CategoryID, p.Unit, p.Price, c.CategoryName
FROM products p
JOIN categories c ON p.CategoryID = c.CategoryID
```

* Map `CategoryName` to the new field in your `Product` object.
* Keep `Product` as a **flat object** for now (don’t create a nested `Category` object).

### Optional Very Challenging Challenge

💡 What would change if we wanted a nested Category object instead of a flat field?

