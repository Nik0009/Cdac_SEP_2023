create database TriggersDemo;
use TriggersDemo;

# Q1. Create a new database named "TriggersDemo" using the following SQL command:
# Use the newly created database:
# Create a table named "Orders" with the following structure:
# a. OrderID int auto increment and primary key
# b. CustomerName VARCHAR(255)
# c. OrderDate DATE
# d. TotalAmount DECIMAL(10, 2)

create table Orders(
		OrderID int auto_increment primary key ,
        CustomerName VARCHAR(255),
        OrderDate DATE,
        OrderTime Time,
        TotalAmount DECIMAL(10, 2)
);

##################################################################################################################################################################################

# Part 2: Create an INSERT Trigger
# Create a trigger named "BeforeInsertTrigger" that automatically updates the
# "OrderDate" field when a new record is inserted into the "Orders" table. The trigger
# should set the "OrderDate" to the current date and time.

delimiter //
create trigger BeforeInsertTrigger
before insert on Orders 
for each row
begin
		-- insert into Orders(OrderID,CustomerName,OrderDate,TotalAmount )
--         values ('insert',);
        set new.OrderDate=now();
        set new.OrderTime=now();
end //
delimiter ;

insert into orders values(101,"a",'2008-11-11','34.22',3000);

select * from orders;

drop table Orders;

##################################################################################################################################################################################

# Part 3: Create an UPDATE Trigger
# Create a trigger named "BeforeUpdateTrigger" that prevents updates to the
# "TotalAmount" field of the "Orders" table if the new value is less than the original value.
# Display an error message in this case.

delimiter //
create trigger BeforeUpdateTrigger
before update on Orders
for each row
begin
		
        
end //
delimiter ;






