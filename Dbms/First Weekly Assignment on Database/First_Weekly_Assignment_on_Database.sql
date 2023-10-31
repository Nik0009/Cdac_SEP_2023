use cdac23;

# Q1 a).Create a new table to track the Post_Office location.
# Post_Office (po_id, po_name, po_address, _city, po_state, po_pincode)
# po_id is the primary key and should be numeric.
# po_name, po_address, and po_city is between 1 and 35 characters. – These should not be null.
# po_state is 2 characters
# po_pincode is 5 numbers. Check for one of the following pin codes – 75081, 75080, 75082,
# 75079, 75078


create table Post_Office(
	po_id int,
    po_name varchar(35), 
    po_address varchar(35), 
    po_city varchar(35), 
    po_state varchar(2), 
    po_pincode int,
    primary key(po_id)

);

drop table Post_Office;

# b). Write insert query for the above table (Post_Office). Enter 5 rows in the table.

insert into post_office values ( 101,"vaibhav","pusad city","pusad","MH",75081);
insert into post_office values ( 102,"saurab","mumbai city","mumbai","MH",75080);
insert into post_office values ( 103,"om","daitul city","daitul","MP",75082);
insert into post_office values ( 104,"akshy","baramti city","baramti","MH",75079);
insert into post_office values ( 105,"suraj","wardh city","wardha","MH", 75078);
insert into post_office values ( 106,"milind","wardh city","wardha","MH", 75078);

select * from post_office;
desc Post_Office;


# c). Write a query that will display all the Post Office records of a State. Display the address of Post Office in a same city.

SELECT po_address AS PostOfficeAddress,po_city FROM Post_Office where po_state="MH";



select
    po_id as OfficeID,
    po_name as OfficeName,
    (select
        case
            when count(*) > 1 then max(po_address)
            else null
        end
     from Post_Office p2
     where p2.po_city = Post_Office.po_city
     ) as Address,
    po_city as City,
    po_state as State
from Post_Office
order by po_state, po_city, po_name;

# d).In which city having maximum number of post office,show the pincodes of those cities.

select po_city as City, GROUP_CONCAT(po_pincode) AS Pincodes
from Post_Office
where po_city = (
   select po_city
    From Post_Office
    group by po_city
    order by COUNT(*) desc
   limit 1
)
group by po_city;

#####################################################################################################################################################

-- Q2. Create a store procedure that receives the first name of the person table as input and the
-- last name as output.

create table FirstNLast_Name(
	first_name varchar(25),
    last_name varchar(25)
);

insert into FirstNLast_Name values ("vaibhav","verularkar");
insert into FirstNLast_Name values ("vaibhav","mohite");
insert into FirstNLast_Name values ("suraj","bagekar");
insert into FirstNLast_Name values ("milind","patle");

select * from FirstNLast_Name;

delimiter //
create procedure getFirstName_ShowLastName( in f varchar(25),out l varchar(25))
begin
select last_name into l from FirstNLast_Name where first_name=f;
end //
delimiter ;

call getFirstName_ShowLastName("suraj",@s);
select @s as last_name;

#####################################################################################################################################################

-- Q3. Create a query to show the account number and customerid from the customer table for
-- the customer without sales orders.

select * from customer2;

select * from sales_orders;

create table customer2 ( 
		customer_id int primary key,
		account_number int,
         customer_name VARCHAR(50),
		email VARCHAR(50)
);

create table sales_orders(
			order_id int primary key,
            customer_id int,
            amount decimal(10,2),
            foreign key(customer_id) REFERENCES customer2(customer_id)
);

insert into customer2 values (101,9566454,"suraj","suraj@gmail.com");
insert into customer2 values (102,59566454,"milind","milind@gmail.com");
insert into customer2 values (103,54566454,"vaibhav","vaibhav@gmail.com");

insert into sales_orders values (1,101,20000);
insert into sales_orders values (2,102,60000);

SELECT c.account_number, c.customer_id
FROM customer2 c
LEFT JOIN sales_orders so ON c.customer_id = so.customer_id
WHERE so.order_id IS NULL;


#####################################################################################################################################################

-- Q4. Create a query to show the top 10 customerIDs of users with more Orders.

select * from orders1 ;

select customerId,count(orderId) as orderCount
from orders1
group by customerId
order by orderCount desc
limit 10;

#####################################################################################################################################################

-- Q5. Creating procedure without parameters

delimiter // 
create procedure countFirstNames()
begin
select count(*) as total_first_names from FirstNLast_Name;
end //
delimiter ; 

drop procedure countFirstNames;

call countFirstNames();

#####################################################################################################################################################

-- Q6..Creating Procedure with (IN/OUT/INOUT) Parameters.

select * from post_office;

delimiter //
create procedure getpostofficeinfo(in cname varchar(35), in scode varchar(2), out pofficecount int, inout csdetails varchar(255) )
begin
    declare cityinfo varchar(255);

    select count(*) into pofficecount
    from post_office
    where po_city = cname and po_state = scode;
    set cityinfo = concat('city: ', cname, ', state: ', scode);
    set csdetails = cityinfo;
end//
delimiter ;

call getpostofficeinfo("wardha","MH",@c,@s);
select @c as count_of_Total_postoffice;
select @s as city_n_state_info;

#####################################################################################################################################################

-- Q7.Write a MySQL stored procedure that takes an integer parameter representing a
-- student's score. Based on the score, the procedure should return one of the following
-- grades using IF-ELSE:
-- i) Score>=90:”A”
-- ii ) Score>=80:”B”
-- iii) Score>=70:”C”
-- iv) Score>=60:”D”
-- v)Score<60:”Fail”

delimiter //
create procedure AssignGrade(IN studentScore INT,OUT studentGrade CHAR(1))
BEGIN
    IF studentScore >= 90 THEN
        SET studentGrade = 'A';
    ELSEIF studentScore >= 80 THEN
        SET studentGrade = 'B';
    ELSEIF studentScore >= 70 THEN
        SET studentGrade = 'C';
    ELSEIF studentScore >= 60 THEN
        SET studentGrade = 'D';
    ELSE
        SET studentGrade = 'Fail';
    END IF;
END//

delimiter ;


call AssignGrade(94, @grade);
select @grade as grade;

#####################################################################################################################################################

-- Q8. Write a MySQL stored procedure that uses a loop to iterate through a list of numbers
-- from 1 to 20.

delimiter //
create procedure lists()
begin
	declare a int ;
    declare str varchar(100) default '' ;
    set str='';
    set a=0;
    while a<=20 do 
    set a=a+1;
    set str = concat(str,a, ',');
    end while;
    select str ;
end //
delimiter ;

call lists();

#####################################################################################################################################################
-- Q9.Create a stored procedure named CalculateFactorial that accepts a single integer
-- parameter, n.Inside the procedure, use a loop to calculate the factorial of n.


delimiter //
create procedure CalFact (n INT)
begin
    declare fact bigint default 1;
    declare i int default 1;

    while i <= n do
        set fact = fact * i;
        set i = i + 1;
    end while;

    select fact as Factorial;
end //
delimiter ;

call CalFact (3);

#####################################################################################################################################################

-- Q10. Create a stored procedure named GenerateFibonacciSequence that accepts
-- a single integer parameter, n, representing the number of terms in the Fibonacci
-- sequence.

delimiter //
create procedure FiboSeq (IN n INT)
BEGIN
    declare fib1 int default  0;
    declare fib2 int default 1;
    declare fib int;

    IF n >= 1 THEN
        SELECT fib1 as FibonacciTerm;
    END IF;

    IF n >= 2 THEN
        SELECT fib2 as FibonacciTerm;
    END IF;

    set n = n - 2;

    WHILE n > 0 DO
        SET fib = fib1 + fib2;
        SET fib1 = fib2;
        SET fib2 = fib;

        select fib as FibonacciTerm;

       set n = n - 1;
    END WHILE;
END //
delimiter ;

call FiboSeq(3);





