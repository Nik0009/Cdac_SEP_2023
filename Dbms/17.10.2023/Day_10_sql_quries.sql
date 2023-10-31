use cdac23;

create table user(
id int primary key auto_increment,
name varchar(25),
email varchar(25)

);

create table audit_log(
event_type varchar(50),
event_descrition varchar(150)

);
#drop table audit_log;

########################### INSERT ############################

delimiter //
create trigger after_user_insert
after insert on user 
for each row 
begin
		insert into audit_log(event_type,event_descrition)
        values('insert',concat('new user inserted : id ',new.id,',name ',new.name,'email ',new.email));	
end //
delimiter ;

# drop trigger after_user_insert;

insert into user (name,email) values ("ramesh","rm@gmail.com");

########################################################################################################################


select * from user;
select * from audit_log;


################################ DELETE  ############################################

delimiter //
create trigger before_user_delete
before delete on user
for each row
begin 
	insert into audit_log(event_type,event_descrition)
    values('delete',concat('old user deleted : id',old.id,',name ',old.name,'email ',old.email));
	
end //
delimiter ;

delete from user where id=2;

#####################################  UPDATE #######################################

delimiter //
create trigger after_user_update
after update on user
for each row
begin 
	
    insert into audit_log(event_type,event_descrition)
    values('update',concat('user updated : id',new.id,',name ',new.name,'email ',new.email));

end //
delimiter ;

update user set email= "ramesh@gmail.com" where id=2;




####################################################################################################


delimiter //
create trigger before_update
before update on user
for each row 

begin
	

end //
delimiter ;

-- delete from user where id=3;

############################################ validation using trigger ########################################################

select * from employee;




delimiter //
create trigger after_salary_insert
before insert on employee 
for each row 
begin
		if new.empSalary<0 then
            
            set new.empSalary=5000;
        end if ;
end //
delimiter ;


insert into employee() values(7,"rutuja",-12333,103);




drop trigger after_salary_insert;

-- alter table employee drop empFullName;
-- alter table employee drop empLastName;


