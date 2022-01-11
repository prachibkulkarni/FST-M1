REM   Script: Activity11
REM   dc

select * from orders;

select * from salesman;

select * from salesman;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

desc salesman


INSERT INTO salesman VALUES(1001, 'Prachi Kulkarni', 'India', 11);

INSERT INTO salesman VALUES(1002, 'Allen Solly', 'India', 12);

INSERT INTO salesman VALUES(1003, 'Ajay Devgan', 'India', 13);

INSERT INTO salesman VALUES(1004, 'Swara K', 'India', 14);

select * from salesman;

insert into saleman values(1004,'Pallavi K','USA',15) 
;

insert into salesman values(1004,'Pallavi K','USA',15) 
;

insert into salesman values(1006,'Sameer K','UK',16) 
;

insert into salesman values(1007,'Rahul K','London',16) 
;

select salesman_id,saleman_city from salesman;

desc salesman


select salesman_id,salesman_city from salesman;

select salesman_id,salesman_city from salesman;

select * from salesman where salesman_city='Paris';

select salesman_id,salesman_city from salesman;

select * from salesman where salesman_city='UK';

select salesman_id,salesman_city from salesman;

select * from salesman where salesman_city='UK';

select salesman_id,commission from salesman where salesman_name='Pallavi Kulkarni' 
 
 
;

select salesman_id,salesman_city from salesman;

select * from salesman where salesman_city='UK';

select salesman_id,commission from salesman where salesman_name='Pallavi K';

ALTER TABLE salesman ADD grade int;

Desc salesman


UPDATE salesman SET grade=100;

select * from salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='USA';

UPDATE salesman SET grade=500 WHERE salesman_name='Sameer K' 
;

UPDATE salesman SET salesman_name='James Bond' WHERE salesman_name='Sameer K' 
;

select * from salesman;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select unique(salesman_id) from orders;

select unique(salesman_id) from orders;

select unique(salesman_id) from orders;

select unique(salesman_id) from orders;

select unique(salesman_id) from orders;

select unique(salesman_id) from orders;

select unique(salesman_id) from orders;

select * from orders order by date desc;

select * from orders;

select * from orders order by order_date desc;

select * from orders order by purchase_dat;

select * from orders ;

select * from orders order by purchase_amount;

select * from orders where purchase_amount<500;

select * from orders where purchase_amount<2000 and purchase_amount>1000;

select * from orders where purchase_amount<=2000 and purchase_amount>=1000;

select sum(purchase_amount_ from orders;

select sum(purchase_amount) from orders;

select sum(purchase_amount) from orders;

select avg(purchase_amount) from orders;

select sum(purchase_amount) as Sum of purchase amount from orders;

select avg(purchase_amount) as Average Amount from orders;

select sum(purchase_amount) as purchase amount from orders;

select avg(purchase_amount) as Average Amount from orders;

select sum(purchase_amount) as 'purchase amount' from orders;

select avg(purchase_amount) as 'Average Amount' from orders;

select sum(purchase_amount) as "purchase amount" from orders;

select avg(purchase_amount) as "Average Amount" from orders;

select sum(purchase_amount) as "purchase amount" from orders;

select avg(purchase_amount) as "Average Amount" from orders;

select max(purchase_amount) as "Maximum amount" from orders;

select * from orders;

select unique(count(salesman_id)) from orders;

select count(unique(salesman_id)) from orders;

select sum(purchase_amount) as "purchase amount" from orders;

select avg(purchase_amount) as "Average Amount" from orders;

select max(purchase_amount) as "Maximum amount" from orders;

select min(purchase_amount) as "Mini amount" from orders;

select count(unique(salesman_id)) from orders;

select * from orders;

select customer_id, purchase_amount from orders where purchase_amount=(select max(ourchase_amount) from orders) ;

select customer_id, purchase_amount from orders where purchase_amount=(select max(purchase_amount) from orders) ;

select customer_id, purchase_amount from orders where purchase_amount=(select max(purchase_amount) from orders group by customer_id) ;

select customer_id, purchase_amount from orders where purchase_amount in (select max(purchase_amount) from orders group by customer_id) ;

SELECT customer_id, max(purchase_amount) AS "Maximum Amount" FROM orders GROUP BY customer_id;

select customer_id, purchase_amount from orders where purchase_amount in (select max(purchase_amount) from orders group by customer_id) ;

select customer_id, purchase_amount from orders where purchase_amount in (select max(purchase_amount) from orders group by customer_id) ;

SELECT customer_id, MAX(purchase_amount) AS "Max Amount" FROM orders GROUP BY customer_id;

select customer_id, purchase_amount from orders where purchase_amount in (select max(purchase_amount) from orders group by customer_id) order by Customer_id;

SELECT customer_id, max(purchase_amount) AS "Maximum Amount" FROM orders GROUP BY customer_id;

SELECT salesman_id, order_date, max(purchase_amount) AS "maximum Amount" FROM orders  
WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

select salesman_id,order_date from orders where (order_dare=To_Date('2012/08/17', 'YYYY/MM/DD')  and purchase_amount=select max(purchase_amount) from orders) group by salesman_id,order_date;

select salesman_id,order_date from orders where (order_dare=To_Date('2012/08/17', 'YYYY/MM/DD') and purchase_amount=select max(purchase_amount) from  
orders group by salesman_id) group by salesman_id,order_date;

select salesman_id,order_date from orders where (order_dare=To_Date('2012/08/17', 'YYYY/MM/DD') and purchase_amount=(select max(purchase_amount) from  
orders group by salesman_id)) group by salesman_id,order_date;

select salesman_id,order_date from orders where (order_date=To_Date('2012/08/17', 'YYYY/MM/DD') and purchase_amount=(select max(purchase_amount) from  
orders group by salesman_id)) group by salesman_id,order_date;

select salesman_id,order_date from orders where (order_date=To_Date('2012/08/17', 'YYYY/MM/DD') and purchase_amount in (select max(purchase_amount) from  
orders group by salesman_id)) group by salesman_id,order_date;

SELECT salesman_id, order_date, max(purchase_amount) AS "maximum Amount" FROM orders  
WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

select salesman_id,order_date from orders where (order_date=To_Date('2012/08/17', 'YYYY/MM/DD') and purchase_amount in (select max(purchase_amount) from  
orders group by salesman_id));

select salesman_id,order_date,purchase_amount from orders where (order_date=To_Date('2012/08/17', 'YYYY/MM/DD') and purchase_amount in (select max(purchase_amount) from  
orders group by salesman_id));

select salesman_id,order_date,purchase_amount from orders where (order_date=To_Date('2012/08/17', 'YYYY/MM/DD') and purchase_amount in (select max(purchase_amount) from  
orders group by salesman_id,order_date));

select salesman_id,order_date,purchase_amount from orders where (order_date=To_Date('2012/08/17', 'YYYY/MM/DD') and purchase_amount in (select max(purchase_amount) from  
orders group by salesman_id,order_date));

select salesman_id,order_date,purchase_amount from orders where (order_date=To_Date('2012/08/17', 'YYYY/MM/DD') and purchase_amount in (select max(purchase_amount) from  
orders group by salesman_id,order_date));

select salesman_id,order_date,purchase_amount from orders where (order_date=To_Date('2012/08/17', 'YYYY/MM/DD') and purchase_amount in (select max(purchase_amount) from  
orders)) group by salesman_id,order_date;

select salesman_id,order_date,purchase_amount from orders group by salesman_id,order_date where (order_date=To_Date('2012/08/17', 'YYYY/MM/DD') and purchase_amount in (select max(purchase_amount) from  
orders)) ;

select salesman_id,order_date,purchase_amount from orders group by salesman_id,order_date where (order_date=To_Date('2012/08/17', 'YYYY/MM/DD') and purchase_amount in (select max(purchase_amount) from  
orders));

select salesman_id,order_date,max(purchase_amount) from orders group by salesman_id,order_date where order_date=To_Date('2012/08/17', 'YYYY/MM/DD') group by salesman_id,order_date;

select salesman_id,order_date,max(purchase_amount) from orders where order_date=To_Date('2012/08/17', 'YYYY/MM/DD') group by salesman_id,order_date;

select customer_id,order_date,max(purchase_amount) from orders where purchase_amount in (2030,3450,5760,6000);

select customer_id,order_date,max(purchase_amount) from orders where purchase_amount in (2030,3450,5760,6000) group by customer_id;

select customer_id,order_date,max(purchase_amount) from orders where purchase_amount in [2030,3450,5760,6000] group by customer_id;

select customer_id,order_date,max(purchase_amount) from orders where purchase_amount in [2030,3450,5760,6000];

select customer_id,order_date,max(purchase_amount) from orders having purchase_amount in [2030,3450,5760,6000];

select customer_id,order_date,max(purchase_amount) from orders having purchase_amount in [2030,3450,5760,6000] group by customer_id;

select customer_id,order_date,max(purchase_amount) from orders having max(purchase_amount) in [2030,3450,5760,6000] group by customer_id;

select customer_id,order_date,max(purchase_amount) from orders having max(purchase_amount) in [2030,3450,5760,6000];

select customer_id,order_date,max(purchase_amount) from orders group by customer_id having max(purchase_amount) in [2030,3450,5760,6000];

select customer_id,order_date,max(purchase_amount) from orders group by customer_id,order_date having max(purchase_amount) in [2030,3450,5760,6000];

select customer_id,order_date,max(purchase_amount) from orders group by customer_id,order_date having max(purchase_amount) in (2030,3450,5760,6000);

select * from orders;

select customer_id,order_date,max(purchase_amount) from orders group by customer_id,order_date having max(purchase_amount) in (2030,110.5,5760,6000) 
;

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

insert into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001),  
(3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), 
(3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006),  
(3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), 
(3001, 'Brad Guzan', 'London', 300, 5005);

insert into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001),  
(3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), 
(3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006),  
(3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), 
(3001, 'Brad Guzan', 'London', 300, 5005);

insert into customers values (3002, 'Nick Rimando', 'New York', 100, 5001),  
(3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), 
(3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006),  
(3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), 
(3001, 'Brad Guzan', 'London', 300, 5005);

insert into customers values (3002, 'Nick Rimando', 'New York', 100, 5001);

insert into customers values (3007, 'Brad Davis', 'New York', 200, 5001);

insert into customers values (3005, 'Graham Zusi', 'California', 200, 5002);

insert into customers values (3008, 'Julian Green', 'London', 300, 5002);

insert into customers values (3004, 'Fabian Johnson', 'Paris', 300, 5006);

insert into customers values (3009, 'Geoff Cameron', 'Berlin', 100, 5003);

insert into customers values (3003, 'Jozy Altidor', 'Moscow', 200, 5007);

insert into customers values (3001, 'Brad Guzan', 'London', 300, 5005);

select * from customers;

select * from customers;

select * from customers;

select * from customers;

select salesman_id, customer_id from customers;

select * from customers;

select salesman_id, customer_name from customers a, customers b where a.salesman_id=b.salesman_id;

SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a ,salaesman b 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a ,salesman b 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

select * from customers;

SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a ,salesman b 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

select * from salesman;

SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a ,salesman b 
INNER JOIN  ON a.salesman_id=b.salesman_id;

SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

select * from customers;

select * from salesman;

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11,400) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14,200) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13,100) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12, 100) 
SELECT 1 FROM DUAL;

SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

select * from salesman;

SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name, b.commission FROM customers a 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman", b.city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

select * from salesman;

SELECT a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman", b.salesman_city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT a.customer_name AS "Customer Name", a.salesman_city, b.salesman_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id  
WHERE b.commission>12;

select * from customers;

SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id  
WHERE b.commission>12;

SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.name AS "Salesman", c.commission FROM orders a  
INNER JOIN customers b ON a.customer_id=b.customer_id  
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;

SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.salesman_name AS "Salesman", c.commission FROM orders a  
INNER JOIN customers b ON a.customer_id=b.customer_id  
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;

select a.order_id,b.salesman_name from orders a ,salesman b ,customers c where c.customer_id=(select * from customers where customer_id=3007);

select * from orders;

select a.order_no,b.salesman_name from orders a ,salesman b ,customers c where c.customer_id=(select * from customers where customer_id=3007) 
;

select * from customers;

select a.order_no,b.salesman_name from orders a ,salesman b ,customers c where c.customer_id=(select customer_id from customers where customer_id=3007) 
;

select a.order_no,b.salesman_name from orders a ,salesman b ,customers c where c.customer_id=(select customer_id from customers where customer_id=3007) and b.saleman_id=c.saleman_id 
;

select * from customers;

select a.order_no,b.salesman_name from orders a ,salesman b ,customers c where c.customer_id=(select customer_id from customers where customer_id=3007) and b.saleman_id=c.salesman_id 
;

select a.order_no,b.salesman_name from orders a ,salesman b ,customers c where c.customer_id=(select customer_id from customers where customer_id=3007) and b.salesman_id=c.salesman_id 
;

select * from orders;

select a.order_no,b.salesman_name from orders a ,salesman b ,customers c where c.customer_id=(select customer_id from customers where customer_id=3007) and a.salesman_id=c.salesman_id 
;

select * from orders;

select * from customers;

select * from orders;

select a.order_no,b.salesman_name from orders a ,salesman b ,customers c where c.customer_id=(select customer_id from customers where customer_id=3007) and b.salesman_id=c.salesman_id 
;

select a.order_no,b.salesman_name from orders a ,salesman b ,customers c where c.customer_id=(select customer_id from customers where customer_id=3007) and b.salesman_id=a.salesman_id 
;

SELECT * FROM orders 
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

select a.order_no,b.salesman_name from orders a ,salesman b ,customers c where c.customer_id=(select customer_id from customers where customer_id=3007) and b.salesman_id=a.salesman_id 
;

select a.order_no,b.salesman_name,b.salesman_id from orders a ,salesman b ,customers c where c.customer_id=(select customer_id from customers where customer_id=3007) and b.salesman_id=a.salesman_id 
;

SELECT * FROM orders 
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

select * from salesman;

update salesman set salesman_city='New York' where salesman_id=1001;

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

SELECT * FROM orders;

SELECT grade, COUNT(*) FROM customers 
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders 
WHERE salesman_id IN( SELECT salesman_id FROM salesman 
WHERE commission=( SELECT MAX(commission) FROM salesman));

SELECT MAX(commission) FROM salesman;

select * from salesman;

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders 
WHERE salesman_id IN( SELECT salesman_id FROM salesman 
WHERE commission=( SELECT Min(commission) FROM salesman;

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders 
WHERE salesman_id IN( SELECT salesman_id FROM salesman 
WHERE commission=( SELECT min(commission) FROM salesman);

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders 
WHERE salesman_id IN( SELECT salesman_id FROM salesman 
WHERE commission=( SELECT min(commission) FROM salesman));

select * from salesman 
;

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders 
WHERE salesman_id IN( SELECT salesman_id FROM salesman 
WHERE commission=( SELECT min(commission) FROM salesman));

