# 💡 SQL Solutions

## SELECT
```sql
SELECT title, release_year FROM film;
```
```sql
SELECT title, rental_duration FROM film WHERE length > 120;
```
```sql
SELECT first_name, last_name FROM customer ORDER BY first_name, last_name LIMIT 10;
```
```sql
SELECT email FROM customer WHERE active = 1;
```
```sql
SELECT first_name, last_name FROM actor WHERE last_name LIKE 'S%';
```

## INSERT
```sql
INSERT INTO film (title, language_id, rental_duration, rental_rate, length, replacement_cost, rating) VALUES ('My New Movie', 1, 5, 2.99, 100, 20.00, 'PG');
```
```sql
INSERT INTO category (name, last_update) VALUES ('Documentary', NOW());
```
```sql
INSERT INTO actor (first_name, last_name, last_update) VALUES ('Jane', 'Doe', NOW());
```
```sql
INSERT INTO address (address, district, city_id, postal_code, phone, last_update) VALUES ('123 Elm Street', 'Magic District', 1, '12345', '555-0100', NOW());
```
```sql
INSERT INTO staff (first_name, last_name, address_id, email, store_id, username, password, active, last_update) VALUES ('John', 'Smith', 1, 'john.smith@example.com', 1, 'jsmith', 'password123', 1, NOW());
```

## UPDATE
```sql
UPDATE film SET rental_rate = 3.99 WHERE rating = 'PG-13';
```
```sql
UPDATE customer SET last_name = 'Potter' WHERE customer_id = 5;
```
```sql
UPDATE customer SET active = 0 WHERE customer_id = 10;
```
```sql
UPDATE rental SET return_date = NOW() WHERE rental_id = 300;
```
```sql
UPDATE staff SET store_id = 1 WHERE staff_id = 2;
```

## DELETE
```sql
DELETE FROM film WHERE film_id NOT IN (SELECT DISTINCT film_id FROM inventory);
```
```sql
DELETE FROM actor WHERE actor_id NOT IN (SELECT DISTINCT actor_id FROM film_actor);
```
```sql
DELETE FROM customer WHERE customer_id = 999;
```
```sql
DELETE FROM address WHERE address_id NOT IN (SELECT address_id FROM customer UNION SELECT address_id FROM staff);
```
```sql
DELETE FROM payment WHERE payment_id = 16000;
```

## ORDER BY and LIMIT
```sql
SELECT title, length FROM film ORDER BY length DESC LIMIT 10;
```
```sql
SELECT first_name, last_name, create_date FROM customer ORDER BY create_date DESC LIMIT 5;
```
```sql
SELECT title FROM film ORDER BY title DESC;
```
```sql
SELECT first_name, last_name FROM actor ORDER BY last_name ASC LIMIT 5;
```
```sql
SELECT name FROM category ORDER BY name ASC LIMIT 3;
```

## DISTINCT
```sql
SELECT DISTINCT rating FROM film;
```
```sql
SELECT DISTINCT first_name FROM customer;
```
```sql
SELECT DISTINCT name FROM language;
```
```sql
SELECT DISTINCT city FROM city;
```
```sql
SELECT DISTINCT postal_code FROM address;
```

## Aggregate Functions
```sql
SELECT COUNT(*) FROM film;
```
```sql
SELECT AVG(rental_rate) FROM film;
```
```sql
SELECT SUM(amount) FROM payment WHERE customer_id = 1;
```
```sql
SELECT MAX(length) FROM film;
```
```sql
SELECT store_id, COUNT(*) FROM customer GROUP BY store_id;
```

## GROUP BY and HAVING
```sql
SELECT rating, COUNT(*) FROM film GROUP BY rating;
```
```sql
SELECT c.name, AVG(f.length) FROM film f JOIN film_category fc ON f.film_id = fc.film_id JOIN category c ON fc.category_id = c.category_id GROUP BY c.name;
```
```sql
SELECT c.name, COUNT(*) AS film_count FROM film_category fc JOIN category c ON fc.category_id = c.category_id GROUP BY c.name HAVING COUNT(*) > 60;
```
```sql
SELECT store_id, COUNT(*) FROM customer GROUP BY store_id;
```
```sql
SELECT staff_id, COUNT(*) AS rental_count FROM rental GROUP BY staff_id HAVING rental_count > 100;
```

## JOINS
```sql
SELECT f.title, c.name AS category FROM film f JOIN film_category fc ON f.film_id = fc.film_id JOIN category c ON fc.category_id = c.category_id;
```
```sql
SELECT cu.first_name, cu.last_name, ci.city FROM customer cu JOIN address a ON cu.address_id = a.address_id JOIN city ci ON a.city_id = ci.city_id;
```
```sql
SELECT f.title, c.first_name, c.last_name, r.rental_date FROM rental r JOIN inventory i ON r.inventory_id = i.inventory_id JOIN film f ON i.film_id = f.film_id JOIN customer c ON r.customer_id = c.customer_id;
```
```sql
SELECT a.first_name, a.last_name, f.title FROM actor a JOIN film_actor fa ON a.actor_id = fa.actor_id JOIN film f ON fa.film_id = f.film_id;
```
```sql
SELECT c.first_name, c.last_name, SUM(p.amount) AS total_paid FROM customer c JOIN payment p ON c.customer_id = p.customer_id GROUP BY c.customer_id;
```

