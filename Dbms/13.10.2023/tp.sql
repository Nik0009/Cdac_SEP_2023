use cdac23;

# select * from student1;

delimiter //
create procedure T_repate()
begin
	declare num int default 1;
    declare r varchar(25) default '';
    
    repeat 
		set r=concat(r,num,',');
        set num=num*5;
        until num>100
	end repeat;
        select r;
end //
delimiter ;

call T_repate();


delimiter //
create procedure Table1()
begin 
	declare num int default 2;
    declare r varchar(20) default '';
    declare i int default 1;
    
    repeat
		set r=concat(r,num,',');
        set num=num*i;
        set i=i+1;
        until i=10
	end repeat;
		select num;


end // 
delimiter ;
drop procedure Table1;
call Table1;