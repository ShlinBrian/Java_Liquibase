-- init.sql
-- Use if not exists to avoid error if the database already exists
CREATE DATABASE IF NOT EXISTS example_db;
USE example_db;

-- Drop the table if it already exists
DROP TABLE IF EXISTS users;

-- Create a new table called 'users'
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

-- Insert some data into the 'users' table
INSERT INTO users (username, email) VALUES ('user1', 'user1@example.com');
INSERT INTO users (username, email) VALUES ('user2', 'user2@example.com');
INSERT INTO users (username, email) VALUES ('user3', 'user3@example.com');

