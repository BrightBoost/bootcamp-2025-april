
-- Create the database
CREATE DATABASE IF NOT EXISTS closet_db;
USE closet_db;

-- Create the table
CREATE TABLE closet_items (
    id INT PRIMARY KEY AUTO_INCREMENT,
    type VARCHAR(50),
    color VARCHAR(50),
    brand VARCHAR(50),
    description TEXT
);

-- Insert sample data
INSERT INTO closet_items (type, color, brand, description) VALUES
('dress', 'red', 'Zeeman', 'There’s a note in the pocket: “The letter m is 13”'),
('heels', 'black', 'Guess', 'Covered in dust. Smells suspiciously like cat.'),
('scarf', 'purple', 'H&M', 'Wrapped around something... could be useful.'),
('jumpsuit', 'blue', 'Asos', 'The label says “Even o has a number: 15”.'),
('hat', 'pink', 'Primark', 'You feel like it’s watching you. Creepy.'),
('bag', 'gold', 'Fake for sure', 'Inside you find a post-it: “w = 23!”');
