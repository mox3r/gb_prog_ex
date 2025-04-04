-- Создание БД
CREATE DATABASE IF NOT EXISTS lesson_1;
-- Использование БД 
USE lesson_1;
-- Удаление табелицы, если она, вдруг, имеется
DROP TABLE IF EXISTS student;
-- создание таблиц с автоиндексом
CREATE TABLE IF NOT EXISTS student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(45),
    contact int
);
-- Очистка строк без журналирования
TRUNCATE student;
-- Вставка значений
INSERT INTO student(first_name)
VALUES ('Alex'),
    ('Maria'),
    ('Vasya'),
    ('Andrew'),
    ('Dmitriy'),
    ('Marat'),
    ('Anton');
-- Вывод содержимого
-- SELECT * FROM student;
-- SELECT id FROM student WHERE first_name  = 'Vasya';
-- SELECT first_name FROM student WHERE id = 2;
SELECT *
FROM student
WHERE first_name LIKE '%A';
SELECT *
FROM student
WHERE id > 2
    AND id < 6;
SELECT CONCAT(
  MOD(TIME_FORMAT(SEC_TO_TIME(id), '%H'), 24), 'hours:',
  FLOOR(MOD(id,3600)/60), 'minutes:',
  MOD(id,60), 'seconds'
) AS Result