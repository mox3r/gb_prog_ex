DROP DATABASE IF EXISTS lesson_4;
CREATE DATABASE lesson_4;
USE lesson_4;
DROP TABLE IF EXISTS teacher;
CREATE TABLE teacher
(
id INT NOT NULL PRIMARY KEY,
surname VARCHAR(45),
salary INT
);

INSERT teacher
VALUES
(1,"Авдеев", 17000),
(2,"Гущенко",27000),
(3,"Пчелкин",32000),
(4,"Питошин",15000),
(5,"Вебов",45000),
(6,"Шарпов",30000),
(7,"Шарпов",40000),
(8,"Питошин",30000);

SELECT * from teacher;
DROP TABLE IF EXISTS lesson;
CREATE TABLE lesson
(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
course VARCHAR(45),
teacher_id INT,
FOREIGN KEY (teacher_id) REFERENCES teacher(id)
);
INSERT INTO lesson(course,teacher_id)
VALUES
("Знакомство с веб-технологиями",1),
("Знакомство с веб-технологиями",2),
("Знакомство с языками программирования",3),
("Базы данных и SQL",4),
("Нейронные сети", NULL); -- Учитель, который ведет данный предмет, временно отстутствует

-- вывести всех учителей, которые ведут уроки 
SELECT
	t.surname,
    l.course
FROM teacher t
JOIN lesson l
ON l.teacher_id = t.id;

-- Вывести всех учителей, даже если они ничего не ведут
SELECT
	t.surname,
    l.course
FROM teacher t
LEFT JOIN lesson l
ON l.teacher_id = t.id;

-- Вывести учителей которые уроки не ведут 
SELECT
	t.surname,
    l.course
FROM teacher t
LEFT JOIN lesson l 
ON l.teacher_id = t.id
WHERE l.teacher_id IS NULL;

-- Подзапросы 
SELECT 
	post,
    AVG(salary)
FROM lesson_3.staff
GROUP BY post
HAVING AVG(salary) > (SELECT AVG(salary) FROM lesson_3.staff);