-- Создание БД
CREATE DATABASE IF NOT EXISTS lesson_2;
USE lesson_2; -- Использование бд;
-- Таблица без декомпозиции
DROP TABLE IF EXISTS product;
DROP TABLE IF EXISTS category;

CREATE TABLE IF NOT EXISTS product
(
id INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(255) NOT NULL UNIQUE,
category VARCHAR(255) DEFAULT "не определена"
);

-- ПроСМОТР СТРУКТуРЫ ТАБЛицы
DESCRIBE product;

-- НорМализация
ALTER TABLE product
DROP category; -- Удаление сТОЛБЦА Категории

-- Перенос в таблицу категориИ

CREATE TABLE category
(
id INT PRIMARY KEY AUTO_INCREMENT,
category_name VARCHAR(255) NOT NULL
);

-- Добавляем внешний ключ (FK)
ALTER TABLE product
ADD category_id INT,
ADD CONSTRAINT fk_product_category
FOREIGN KEY (category_id)
REFERENCES category(id)
ON UPDATE CASCADE ON DELETE CASCADE;

-- Заполнение данными
INSERT INTO product (title)
VALUES
("Intel Core i7-10700K"), -- id = 1
("AMD Ryzen 5 5600X"),-- id = 2
("Intel Core i5-11600K"),-- id = 3
("AMD Ryzen 7 5800X"), -- id = 4
("Intel Core i9-11900K"),-- id = 5
("GTX1060"), -- id = 6
("GTX1070"); -- id = 7

SELECT * FROM product;

INSERT INTO category (category_name)
VALUES
('процессор'),
('видеокарта');

SELECT * FROM category;

UPDATE product
SET category_id = 
CASE
	WHEN title LIKE "Intel%" OR title LIKE "AMD%"
		THEN 1 -- category_id = 1 
    ELSE 2
END;

SELECT p.title, c.category_name
FROM product p
JOIN category c 
ON p.category_id = c.id;

SELECT title,
	CASE
    	WHEN title LIKE "Intel%" OR title LIKE "AMD%"
		THEN 'Процессоры'
    ELSE 'Видеокарты'
	END AS result
FROM product;