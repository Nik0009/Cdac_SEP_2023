use cdac23;

select * from userInfo;
drop procedure `insertRecord`;

delimiter //
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertRecord`(in id int,in name varchar(50))
BEGIN
	declare exit handler for 1062
    begin
		select 'Please avoid duplicate entry in primary key' as message;
    end;
    
	insert into userInfo (userId,userName) values (id,name);
    
    select * from  userInfo ;
END
delimiter ;

call cdac23.insertRecord(3,"vai");


delimiter //
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertRecord`(in id int,in name varchar(50))
BEGIN
	declare continue handler for 1062
    begin
		select 'Please avoid duplicate entry in primary key' as message;
    end;
    
	insert into userInfo (userId,userName) values (id,name);
    
    select * from  userInfo ;
END

delimiter ;