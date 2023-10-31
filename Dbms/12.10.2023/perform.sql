select * from cdac23.labour;

use cdac23;

create table labour(
		id int,
		name varchar(25),
        department varchar(25),
        salary int
);

insert into labour (id ,name,department,salary) values (101,"vaibhav","x1",7000);
insert into labour values (102,"milind","x2",80800);
insert into labour values (103,"mihir","x1",10000);
insert into labour values (104,"aswin","x2",3000);
insert into labour values (105,"surabh","x3",12000);

####################################### if_else ###############################################################

delimiter //
create procedure showNameOfLaboues(in id1 int)
begin 

declare sal int ;
declare nm varchar(25);
declare message varchar(25);

select salary into sal from labour where id1=id;

	if sal<5000 then 
		set message="less than 5000";
	else 
		set message="greater than 5000";
	end if ;

select message as Result;

end //
delimiter ;

 drop procedure showNameOfLaboues;

call showNameOfLaboues(101);

-- set  sql_safe_updates=0;
-- delete from labour where id=105; 


####################################### case ###############################################################

