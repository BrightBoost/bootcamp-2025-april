### Task

* Create a model class for `Product` based on the columns in the `products` table from the Northwind db (like `ProductID`, `ProductName`, `SupplierID`, `CategoryID`, `Unit`, `Price`).
* Create a DAO class `ProductDao` and a configuration class for the datasource.
* Add two methods to the DAO:
  * `List<Product> getAllProducts()`
  * `Product getProductById(int id)`
* Create a `ProductController` with these endpoints:
  * `GET /products` – returns all products.
  * `GET /products/{id}` – returns a single product by ID.
  * `GET /products/name/{name}` – returns all products where the name contains the `name`.
  * Add a `POST /products` endpoint to add a new product (minimal validation for now).
* Test with Postman or curl.