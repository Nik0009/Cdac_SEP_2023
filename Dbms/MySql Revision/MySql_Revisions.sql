CREATE DATABASE REVISION_MYSQL;

USE REVISION_MYSQL;

####################################################################

# DDL COMMANDS

#1. CREATE 

CREATE TABLE student(
	studId int ,
    studName VARCHAR(20),
    studRollNo INT,
    studBranch VARCHAR(20)
);

# 2.ALTER

 # FOR ADDING COLUMN TO EXISTING TABLE
ALTER TABLE student
ADD COLUMN studContact VARCHAR(20);

 # FOR ADDING COLUMN TO EXISTING TABLE AT PERTICULAR POSITION 
ALTER TABLE student 
ADD COLUMN studAddress VARCHAR(20) AFTER studContact;

# modify Existing column in table
ALTER TABLE student
MODIFY COLUMN studId VARCHAR(25) NOT NULL;

# change name of column 
ALTER TABLE student
CHANGE studContact Contact VARCHAR(20);

ALTER TABLE student
CHANGE studBranch Branch VARCHAR(20);

# delete particular column 
ALTER TABLE student DROP COLUMN Contact;

SELECT * FROM student;

DESC student;

# 3.DROP

DROP TABLE student;

# 4.TRUNCATE

TRUNCATE TABLE student;

####################################################################

# DML COMMANDS

# 1. INSERT

INSERT INTO student(studId,studName,studRollNo,studBranch) VALUES( 1,"suraj",12,"ele");
INSERT INTO student(studId,studName,studRollNo,studBranch) VALUES( 2,"vaibhav",14,"cse");
INSERT INTO student(studId,studName,studRollNo,studBranch) VALUES( 3,"saurabh",18,"mech");
INSERT INTO student(studId,studName,studRollNo,studBranch) VALUES( 4,"om",19,"cse");

# 2. UPDATE

SET sql_safe_updates=0;

UPDATE student SET studBranch="civil" WHERE studRollNo=14 ;
UPDATE student SET studContact="8466666" WHERE studRollNo= 18;
UPDATE student SET studContact="94675566" WHERE studRollNo= 14;
UPDATE student SET studContact="754656466666" WHERE studRollNo= 19;

SELECT * FROM student;

# 3.DELETE

DELETE FROM student WHERE studBranch="cse";


####################################################################
####################################################################
####################################################################

# DATABASE CONSTRAINTS ( PRIMARY KEY,UNIQUE,NOT NULL,FOREIGN KEY,DEFAULT,CHECK )

CREATE TABLE employee(
			empId INT PRIMARY KEY,
            empName VARCHAR(20) NOT NULL,
            empAge INT CHECK(empAge>=18),
            empAddhar VARCHAR(20) UNIQUE,
            empIncome DECIMAL(10,2) DEFAULT 0.00
            
);


INSERT INTO employee(empId,empName,empAge,empAddhar,empIncome) VALUE(1,"suraj",23,"1073746",5000000);
INSERT INTO employee(empId,empName,empAge,empAddhar,empIncome) VALUE(2,"vaibhav",22,"441073746",23330);
INSERT INTO employee(empId,empName,empAge,empAddhar,empIncome) VALUE(3,"om",25,"166073746",34520);
INSERT INTO employee(empId,empName,empAge,empAddhar,empIncome) VALUE(6,"rushikesh",27,"754107376",75000);
INSERT INTO employee(empId,empName,empAge,empAddhar,empIncome) VALUE(5,"DD",27,"",3);


DESC employee;

SELECT * FROM employee;

####################################################################
####################################################################
####################################################################

# AGGREGATE FUNCTIONS

# 1.MAX()
SELECT MAX(empAge) AS "MAX AGE" FROM employee;

# 2.MIN()
SELECT MIN(empAge) AS "MIN AGE" FROM employee;

# 3.SUM()
SELECT SUM(empIncome) as "TOTAL INCOME" FROM employee ;

# 4. COUNT()
SELECT COUNT(empAge) AS "TOTAL " FROM employee;

# 5. AVG()
SELECT AVG(empIncome) AS "AVRAGE INCOME" FROM employee;


SELECT * FROM employee;



####################################################################
####################################################################
####################################################################

# CLAUSES

# 1. WHERE 
SELECT empName AS "NAME",empAge AS "AGE" FROM employee WHERE empAge>25;

# "IN" USED WITH WHERE
SELECT empName AS "name",empAge AS "age",empIncome from employee where empIncome in (23330.00);

# "BETWEEN,AND " USED WITH WHERE 
SELECT empName AS "name",empAge AS "age",empIncome FROM employee WHERE empIncome BETWEEN 25000 AND 23000447;

# "OR" USED WITH WHERE CLAUSES
SELECT empName AS "name",empAge AS "age",empIncome AS "income" from employee WHERE empAge>20 or empIncome =34520;

select * from employee;

####################################################################
####################################################################
####################################################################

# LIMIT( HOW MANY ROWS YOU WANT) AND OFFSET(SKIPS ROWS)

select * from employee;

SELECT * FROM employee limit 2;

SELECT * FROM employee limit 3 OFFSET 2;


####################################################################
####################################################################
####################################################################

# LIKE OPERATOR
SELECT * FROM employee WHERE empAge LIKE "%23"; 

SELECT empName AS "NAME" FROM employee WHERE empName LIKE "s%";

SELECT empName AS "NAME" FROM employee WHERE empName LIKE "%sh";

SELECT empName AS "NAME" FROM employee WHERE empName LIKE "%_bh_%";

####################################################################
####################################################################
####################################################################

# ORDER BY

select * from employee;

SELECT empName FROM employee ORDER BY empIncome ; 

SELECT empName FROM employee ORDER BY empAge ASC;

SELECT empName FROM employee ORDER BY empAge DESC; 


####################################################################
####################################################################
####################################################################

# GROUP BY ( USED WITH AGGREGATE FUNCTION)

SELECT empName,count(empIncome) AS "sum" FROM employee GROUP BY (empName); 


####################################################################
####################################################################
####################################################################

# HAVING 

SELECT empAge,COUNT(empName) AS "total employee" FROM employee GROUP BY empAge HAVING empAge<24; 

####################################################################
####################################################################
####################################################################

# IS NULL 

update employee set empAddhar=null where empId=5;

SELECT empName FROM employee WHERE empAddhar IS NULL;

select * from employee;


####################################################################
####################################################################
####################################################################

# IS NOT NULL 

SELECT * FROM employee where empAddhar IS NOT NULL;


####################################################################
####################################################################
####################################################################

# DISTINCT

select * from employee;

SELECT DISTINCT(empAge),empName FROM employee ;

####################################################################
####################################################################
####################################################################

# JOINS 

create table customer(
customerId int,
firstName varchar(25),
lastName varchar(25)
);

create table orders(
orderId int,
customerId int,
prodName varchar(25)
);

insert into customer values(101,"Ramesh","Solanki");
insert into customer values(102,"Suresh","Sharma");
insert into customer values(103,"Bhavesh","Roy");
insert into customer values(104,"Kailash","Gupta");
insert into customer values(105,"Mahesh","Sharma");

insert into orders values(1,101,"Laptop");
insert into orders values(2,103,"Mobile");
insert into orders values(3,105,"Camera");
insert into orders values(4,102,"Bike");
insert into orders values(5,101,"Chair");

SELECT * FROM CUSTOMER;

SELECT * FROM ORDERS;

DELETE FROM ORDERS WHERE orderId=4 ; 
DELETE FROM ORDERS WHERE orderId=5 ; 

# 1. INNER JOIN
SELECT customerId.