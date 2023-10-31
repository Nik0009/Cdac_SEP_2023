use cdac23;
select * from student1;
desc student1;

delimiter //
create procedure getNameWithId(in id int,out sname varchar(25))
begin
	select sname1 into sname from student1 where sid1=id;
end //
delimiter ;

call getNameWithId1(101,@n);
select @n ;

DROP PROCEDURE getNameWithId; 

-- delimiter //  
-- create procedure findSalary(in id int,out Salary decimal(10,2))
-- begin
-- 	select empSalary into Salary  from employee where empId=id;
--     
-- end //
-- delimiter ;

-- call findSalary(4,@s);
-- select @s as salary;