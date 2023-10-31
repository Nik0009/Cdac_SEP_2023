use cdac23;

create table orders(
	ord_no int,
    purch_amt decimal(10,2),
    ord_date date,
    customer_id int,
    salesman_id int
);
desc orders;

select * from orders;

insert into orders values (70001,150.5,('2012-10-05'),3005,5002);
insert into orders values (70009,270.65,('2012-09-10'),3001,5005);
insert into orders values (70002,65.26,('2012-10-05'),3002,5001);
insert into orders values (70005,2400.6,('2012-07-27'),3007,5001);
insert into orders values (70008,5760,('2012-9-10'),3002,5001);


# 1.From the following table, write a SQL query to calculate
# the average purchase amount of all orders.

select avg(purch_amt) as "average purchase amount" from orders;

#2.Write a SQL query that counts the number of unique salespeople.
# Return number of salespeople.

select count(distinct(salesman_id)) from orders;

#3.Write a SQL query to calculate the average purchase amount of all
# orders. Return average purchase amount.

select avg(purch_amt) as "average purchase amount" from orders;

# 4.Write a SQL query to calculate total purchase amount of all orders.
# Return total purchase amount.

select sum(purch_amt) as "total purchase amount" from orders;


select * from orders;

alter table orders add column city varchar(25) after salesman_id;
alter table orders add column salesperson varchar(25) after salesman_id;
alter table orders add column customer varchar(25) after salesman_id;

set sql_safe_updates=0;
update  orders set customer="suraj" where ord_no=70001;
update  orders set salesperson="vaibhav",city="nagpur" where ord_no=70001;
update  orders set customer="vaibhav",salesperson="saurabh",city="nagpur" where ord_no=70009;
update  orders set customer="rajesh",salesperson="suresh",city="wardha" where ord_no=70002;
update  orders set customer="ramesh",salesperson="milind",city="chandrapur" where ord_no=70005;
update  orders set customer="vaibhav",salesperson="saurabh",city="nagpur" where ord_no=70009;
update  orders set customer="anup",salesperson="swapnil",city="mumbai" where ord_no=70008;


# 6.Write a SQL query to find distinct salespeople and their cities.
# Return salesperson ID and city
select distinct(salesman_id,city) from orders;


