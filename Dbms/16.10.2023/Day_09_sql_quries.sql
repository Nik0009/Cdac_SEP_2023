use cdac23;

################################## CURSOR #########################################
select * from employee;

delimiter //
create procedure currsor_demo()
begin
declare name varchar(50); 
declare salary decimal(15,2);

declare cursor1 cursor for select empName,empSalary from employee;
open cursor1;
fetch cursor1 into name,salary;
close cursor1;

select name,salary;

end // 
delimiter ;

call currsor_demo();


#######################################################################################################

delimiter //
create procedure currsor_demo1()
begin
declare finished int default 0;
declare name varchar(50); 
declare salary decimal(15,2);

declare cursor1 cursor for select empName,empSalary from employee;
declare continue handler for not found set finished=1; 
open cursor1;

loop1:loop 
	if finished then 
	leave loop1;
    end if;
fetch cursor1 into name,salary;
select name,salary;

end loop;
close cursor1;

end // 
delimiter ;

call currsor_demo1();