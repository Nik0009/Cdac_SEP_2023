select * from cdac23.student1;
desc student1;

delimiter //
create procedure cursor_sname()
begin 
declare name varchar(25);

declare cursor1 cursor for select sname1 from student1;
open cursor1 ;
fetch cursor1 into name;
close cursor1;
select name;
end //
delimiter ;

call cursor_sname();

drop procedure cursor_name1;
#************************************************************
delimiter //
create procedure cursor_name1()
begin
declare name varchar(25);
declare finished int default 0;

declare cursor1 cursor for select sname1 from student1;
declare continue handler for not found set finished=1;

open cursor1;

loop1 :loop
		if finished then
        leave loop1;
        end if;
fetch cursor1 into name;
select name ;
end loop;

close cursor1;

end//
delimiter ;

call cursor_name1();