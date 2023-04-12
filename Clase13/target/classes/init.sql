CREATE TABLE REGISTRATION(
    id INT NOT NULL AUTO_INCREMENT,
    first VARCHAR(255),
    last VARCHAR(255),
    age INTEGER,
    PRIMARY KEY (id)
);

INSERT INTO REGISTRATION(first, last, age) VALUES
('Zara', 'Ali', 18),
('Mahnaz', 'Fatma', 25),
('Zaid', 'Khan', 30),
('Sumit', 'Mittal', 28);