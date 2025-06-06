# SQL Recap

## 🗂 Import the Sakila Database
Make sure you've imported the Sakila sample database into your MySQL environment before starting.

---

## 📋 Exercises

### 🟦 SELECT
- List all films with their title and release year.
- Select the title and rental duration of all films longer than 120 minutes.
- Show the first 10 customer first and last names alphabetically.
- Get the email addresses of all active customers.
- Select the names of all actors whose last name starts with 'S'.

### 🟨 INSERT
- Insert a new film into the film table (make up a title, language_id, length, etc.).
- Add a new category called 'Documentary'.
- Insert a new actor into the actor table.
- Add a new address to the address table.
- Register a new staff member in the staff table.

### 🟧 UPDATE
- Update the rental rate of all films rated 'PG-13' to 3.99.
- Change the last name of customer ID 5 to 'Potter'.
- Mark customer ID 10 as inactive.
- Update the return date of rental ID 300 to the current date.
- Change the store of staff ID 2 to store ID 1.

### 🟥 DELETE
- Delete a film that has never been rented (hint: requires subquery).
- Remove an actor with no associated films.
- Delete the customer with ID 999 if they exist.
- Remove all addresses that are not referenced by any customer or staff.
- Delete a payment record with ID 16000.

### 🔽 ORDER BY and LIMIT
- List the 10 longest films in the database.
- Show the 5 most recently added customers.
- Order films by title descending.
- List top 5 actors alphabetically by last name.
- Display 3 categories ordered by name.

### 🟩 DISTINCT
- Find all distinct ratings used in films.
- List distinct first names of customers.
- Get distinct languages used in films.
- Show all distinct city names.
- List distinct postal codes in the address table.

### 🧮 Aggregate Functions
- Count how many films are in the database.
- Find the average rental rate for all films.
- Get the total amount paid by customer ID 1.
- Find the maximum film length.
- Count how many customers each store has.

### 🧩 GROUP BY and HAVING
- Group films by rating and count how many films per rating.
- Show the average length of films by category.
- List categories with more than 60 films.
- Group customers by store and show how many per store.
- Show staff members who processed more than 100 rentals.

### 🔗 JOINS
- List all films with their category name.
- Get customer names with the name of the city they live in.
- List rentals including film title, customer name, and rental date.
- Show actor names along with the films they appear in.
- List customers and the total amount they have paid.
