# for creation of database
create database cdac23;

# for selecting database
use cdac23;

# for checking available databases
show databases;

# create a table
Create table Employee(
empId int,
empName varchar(25)
);

# check for table availablibility 
show tables;

# check schema of table structure
desc employee;

# for add new column to existing table
alter table employee add column depat varchar(50);

# for add new column to existing table at particular position
alter table employee add column salary decimal(10,2) after empName;

# modify Existing column in table
alter table employee modify column empName varchar(50) not null;

# change name of column 
alter table employee change depat empAddress decimal(10,2);

alter table employee change salary empSalary decimal(10,2);

# change table name 
alter table employee rename dacEmployee;

desc dacEmployee;

# delete particular column 
alter table dacEmployee drop column depart;

# delete complete table structure 
Drop table dacEmployee;

# delete complete database structure 
drop database cdac23;