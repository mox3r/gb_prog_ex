use lesson_3;
SELECT *
FROM staff;
-- Ранжирование
SELECT salary,
    post,
    concat(first_name, " ", last_name) AS fullname,
    DENSE_RANK() OVER (
        ORDER BY salary DESC
    ) AS 'dense_rank'
FROM staff;
SELECT salary,
    post,
    concat(first_name, " ", last_name) AS fullname,
    DENSE_RANK() OVER (
        PARTITION BY post
        ORDER BY salary DESC
    ) AS 'dense_rank'
FROM staff;
SELECT *
FROM (
        SELECT salary,
            post,
            concat(first_name, " ", last_name) AS fullname,
            DENSE_RANK() OVER (
                PARTITION BY post
                ORDER BY salary DESC
            ) AS 'dens_rank'
        FROM staff
    ) rank_staff
WHERE dens_rank = 1;
SELECT salary,
    post,
    concat(first_name, " ", last_name) AS full_name,
    AVG(salary) OVER w AS avg_salary,
    SUM(salary) OVER w AS sum_salary,
    SUM(salary) OVER w1 AS sum_total_salary,
    ROUND(
        100 * salary / SUM(salary) OVER w,
        2
    ) AS percent_sum,
    ROUND(
        100 * salary / SUM(salary) OVER w1,
        2
    ) AS percent_total_sum
FROM staff WINDOW w AS (PARTITION BY post),
    w1 AS ();
CREATE OR REPLACE VIEW v_count_post AS
SELECT post,
    COUNT(*) AS count_staff,
    AVG(salary) AS avg_staff
FROM staff
GROUP BY post
ORDER BY avg_staff DESC;
SELECT *
FROM v_count_post;
SHOW FULL TABLES;