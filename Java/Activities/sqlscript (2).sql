REM   Script: Activity3
REM   Activity 3

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

