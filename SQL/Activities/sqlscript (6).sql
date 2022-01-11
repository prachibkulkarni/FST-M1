REM   Script: Activity7
REM   Activity 7-unctions

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

