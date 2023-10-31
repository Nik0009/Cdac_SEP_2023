use cdac23;

create table customer(
customerId int,
firstName varchar(25),
lastName varchar(25)
);

create table orders1(
orderId int,
customerId int,
prodName varchar(25)
);

insert into customer values(101,"Ramesh","Solanki");
insert into customer values(102,"Suresh","Sharma");
insert into customer values(103,"Bhavesh","Roy");
insert into customer values(104,"Kailash","Gupta");
insert into customer values(105,"Mahesh","Sharma");
insert into customer values(106,"M","ab");
insert into customer values(107,"a","s");

insert into orders1 values(1,101,"Laptop");
insert into orders1 values(2,103,"Mobile");
insert into orders1 values(3,105,"Camera");
insert into orders1 values(4,102,"Bike");
insert into orders1 values(5,101,"Chair");
insert into orders1 values(6,103,"Car");
insert into orders1 values(7,104,"tab");
insert into orders1 values(8,102,"toys");


select * from customer;
select * from orders1;


# inner join
select customer.customerId,customer.firstName,orders1.prodName from customer inner join orders1 on customer.customerId = orders1.customerId;
# SELECT customer.first_Name,orders.prod_Name FROM customer inner join orders ON customer.cust_Id = orders.cust_Id;
# left join 
select customer.firstName,orders1.prodName from customer left join orders1 on customer.customerId=orders1.customerId;

# right join
select customer.firstName,orders1.prodName from customer right join orders1 on customer.customerId=orders1.customerId;

# full join
select customer.firstName,orders1.prodName from customer full join orders1 on customer.customerId=orders1.customerId;



# primary,foreign  keys examples

create table Department(
	deptId int primary key,
    name varchar(25)  not null
    
);

insert into Department(deptId,name) values (101,"account"),(102,"developer"),(103,"admin");

select * from Department;


create table Employee(
	empId int primary key,
    empName varchar(50)  not null,
    empSalary decimal(15,2),
    did int,
    foreign key(did) references Department(deptId)
    
);
select * from Employee;

insert into Employee(empId,empName,empSalary,did) values (4,"kailsh",776789,103),(5,"dinesh",776789,102),(6,"ganesh",233289,101);

select employee.did,employee.empName,department.name from employee,department where employee.did=department.deptId;

select employee.empName,department.name,max(employee.empSalary) from employee,department where employee.did=department.deptId;



# copy strucure of existing table to new table

create table depart like Department ;

desc department;

desc depart;









