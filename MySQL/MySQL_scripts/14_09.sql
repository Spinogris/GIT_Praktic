/*
SELECT
	*
FROM employees;         

SELECT
	*
FROM jobs;

SELECT
	first_name,
    last_name,
    salary
FROM employees
WHERE salary < 7000;

SELECT distinct
	department_id
FROM employees
WHERE salary < 7000;

SELECT
	first_name,
    last_name,
    salary
FROM employees
order by salary;

SELECT
	first_name,
    last_name,
    salary,
    department_id
FROM employees
order by department_id DESC,
salary;

SELECT
	country_name
FROM countries
order by country_name;

-- 0. Выбрать БД hr в качестве текущей           
use hr;
-- 1. Вывести сотрудников (имя, фамилия, зп), которые зарабатывают больше 7000 и работают в департаментах 90, 50, 80
SELECT 
    first_name, last_name, salary
FROM
    hr.employees
WHERE
    salary > 7000
        AND department_id IN (90 , 50, 80);

SELECT 
    *
FROM
    employees;
 
--    РАБОТА С БД
-- 1. Создать БД
create database Group_300523;



-- 2. Выбрать БД в качестве текущей

use Group_300523;

-- 3. Удалить БД
    
-- drop database Group_300523;
    
    
--    РАБОТА С Таблицами
-- 1. Создать таблицу
	/*							-- ТИПЫ ДАННЫХ
create table students ( 
	id integer, 				-- INTEGER (INT) - целое число
    first_name varchar (64), 	-- VARCHAR - строка с указанием макс длины
    last_name varchar (64), 	-- VARCHAR - строка с указанием макс длины
    avg_score numeric(4, 2),	-- NUMERIC / DECIMAL - дробное число
    gender char(1)				-- CHAR - строка с указанием фиксированной длины
);

-- 1. Создать таблицу
-- 74.98
-- 6.73  

select * from students;

insert into students (id, first_name, last_name) values (1, 'Olga', 'Ivanova');
insert into students (id, first_name, last_name, avg_score, gender) values (2, 'Ivan', 'Petrov', 45.56, 'M'),
																			(3, 'Boris', 'Sidorov', 45.82, 'M'),
                                                                            (4, 'Irina' , 'Ushanova', 39.08, 'F'),
																			(5, 'Anna', 'Gribova', 61.14, 'F');

-- drop table students;			-- Удалить таблицу

delete from students.   -- Удалить строку
where id in (2,4);

delete from students;		-- Удалить все строки

set sql_safe_updates = 0; -- Отключить безопасный режим

select * from students;



-- 21_09_2023
-- -- Ограничения на поля (constraints / констрейнты)

drop table students;

create table students (
 id integer auto_increment,
    first_name varchar(64),
    last_name varchar(64) not null,
    avg_score numeric(4, 2) default 50.00,
    gender char(1) check (gender in ('M', 'F')),
    age integer check (age >=18),
    primary key (id)
);

insert into students (first_name, last_name,age, id) values ('Olga', 'Ivanova', 120, 101);
insert into students (first_name, last_name, avg_score, gender, age) 
	values ('Ivan', 'Petrov', 54.72, 'm', 18),
           ('Boris', 'Sidorov', 45.82, 'M', 34),
           ('Irina', 'Ushanova', 39.08, 'F', 43),
           ('Anna', 'Gribova', 61.14, 'F', 32);
		
select * from students;

delete from students
where id in (6,7,8);

set sql_safe_updates = 0; -- Отключить безопасный режим

-- Сбросить таблицу до изначального состояния 

truncate students;

-- ПРАКТИКА
-- 1. Создать таблицу goods (товары) с полями:

-- id (первичный ключ, авто инкеремент)
-- title (cтрока максимум 30 символов)
-- quantity (целое число больше 0)
-- price (число макс 7 символов, 2 из которых после точки)
-- in_stock (символ (Y/N))


-- 2. Заполните созданную таблицу данными, минимум 5 строк.

drop table goods;

CREATE TABLE goods (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(30),
    quantity INTEGER CHECK (quantity > 0),
    price DOUBLE(7 , 2 ),
    in_stock CHAR(1) CHECK (in_stock IN ('y' , 'm'))
);

insert into goods (title, quantity, price, in_stock) values ('Hello W0r1d', 121, 1.56, 'Y');
insert into goods (title, quantity, price, in_stock) values ('W0r1d', 120, 10145.23, 'M');
insert into goods (title, quantity, price, in_stock) values ('Hello W0r1d', 120, 1011.56, 'M');
insert into goods (title, quantity, price, in_stock) values ('W0r1d', 120, 538.26, 'Y');
insert into goods (title, quantity, price, in_stock) values ('Hello W0r1d', 120, 101.0, 'M');
insert into goods (title, quantity, price, in_stock) values ('Hello W0r1d', 120, 94.5, 'M');

UPDATE goods 
SET 
    title = 'Apple'
WHERE
    title = 'W0r1d';

UPDATE goods 
SET 
    price = price * 0.375;
  -- 7. Всем продуктам, у которых в названии есть буква a и стоимость которых превышает 200, увеличить кол-во в 3 раза  
UPDATE goods 
SET 
    quantity = quantity * 3
WHERE
    title LIKE '%a%' AND price > 200;
    
    
    -- 8. Товарам, в названии которых есть буква n очистить значение в поле price

UPDATE goods 
SET 
    price = NULL
WHERE
    title LIKE '%n%';

SELECT * FROM goods;
*/

-- ПРАКТИКА (БД hr)

use hr;

-- 1. Вывести имя, фамилию сотрудника и название департамента, в котором он работает

SELECT 
    t1.first_name, t1.last_name, t2.department_name
FROM
    employees t1
        INNER JOIN
    departments t2 ON t1.department_id = t2.department_id;

-- 3. Вывести имя, фамилию сотрудника и название его должности
SELECT 
    t1.first_name, t1.last_name, t2.job_title
FROM
    employees t1
        INNER JOIN
    jobs t2 ON t1.job_id = t2.job_id;


-- 4. Вывести имя и фамилию тех сотрудников, которые работают в департаментах IT, Marketing, Shipping
SELECT 
    t1.first_name, t1.last_name
FROM
    employees t1
        INNER JOIN
    departments t2 ON t1.department_id = t2.department_id
WHERE
    t2.department_name IN ('IT' , 'Marketing', 'Marketing');

-- 5. Вывести имя и фамилию сотрудника и его город
SELECT 
    t1.first_name, t1.last_name, t3.city
FROM
    employees t1
        INNER JOIN
    departments t2 ON t1.department_id = t2.department_id
        INNER JOIN
    locations t3 ON t2.location_id = t3.location_id;

-- 6. Вывести имя и фамилию тех сотрудников, которые работают в департаментах IT, IT_PROG, Sales, Marketing и в городах Seattle, Oxford и Toronto
SELECT 
    t1.first_name, t1.last_name
FROM
    employees t1
        INNER JOIN
    departments t2 ON t1.department_id = t2.department_id
            INNER JOIN
    locations t3 ON t2.location_id = t2.location_id
WHERE
    t2.department_name IN ('IT' , 'IT_PROG', 'Sales', 'Marketing')
    and t3.city IN ('Seattle' , 'Oxford', 'Toronto');
    
-- 7. Создать таблицу на основе выборки из предыдущей задачи
    create table example as
SELECT 
    t1.first_name, t1.last_name
FROM
    employees t1
        INNER JOIN
    departments t2 ON t1.department_id = t2.department_id
            INNER JOIN
    locations t3 ON t2.location_id = t2.location_id
WHERE
    t2.department_name IN ('IT' , 'IT_PROG', 'Sales', 'Marketing')
    and t3.city IN ('Seattle' , 'Oxford', 'Toronto');
    
-- 8. Удалить созданную таблицу
    drop table example;
    
-- 9. Вывести названия департаментов, в которых никто не работает
SELECT 
    t1.department_name
FROM departments t1
left join employees t2
on t1.department_id = t2.department_id
where t2.employee_id is null;













