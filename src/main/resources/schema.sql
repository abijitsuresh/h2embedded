CREATE TABLE IF NOT EXISTS test
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    uuid UUID DEFAULT random_uuid(),
    title VARCHAR(255),
    description VARCHAR(255),
    published BOOLEAN
);