select * from cdac23.employee;
use cdac23;
desc employee;

# delimiter (;) is used as // in this program
# ';' is converted to '//'
delimiter //  

# creating strored procedures 

create procedure getAllEmployee()

# this is used for start strored procedures
begin

	# this is query which is inside strored procedure to be exexute
	select empName from employee;
    
# this is end of strored procedures
end //

# '//' is converted into ';'
delimiter ;

# calling stored procedures
call getAllEmployee(); 


# ; is converted to //
delimiter //  

create procedure getAllEmployeeAndNos()
begin
	select empName from employee;
    select count(*) from employee;
end //

# // is converted into ;
delimiter ;

call getAllEmployee();
call getAllEmployeeAndNos();


#*******************************IN/OUT/INOUT***********************************#

delimiter //  
create procedure getSingleEmployeeAndNos(in id int)
begin
	select empName from employee where empId=id;
    
end //
delimiter ;

call getSingleEmployeeAndNos(4);

#***********************Out***************************************#

delimiter //  
create procedure findMaxSalary(out hightSalary decimal(15,2))
begin
	select max(empSalary) into hightSalary from employee;
    
end //
delimiter ;

# using out parmeter we are finding hightSalary from employee and calling findMaxSalary procedure with the help of @m parameter we can change parameter name  'm' in @m as we want  
call findMaxSalary(@m);
select @m as hightsalary;

#***********************In and Out***************************************#

delimiter //  
create procedure findSalary(in id int,out Salary decimal(10,2))
begin
	select empSalary into Salary  from employee where empId=id;
    
end //
delimiter ;

call findSalary(4,@s);
select @s as salary;

#***************************inout***********************************#


select * from employee;

delimiter //  
create procedure updateSalary(inout sal decimal(10,2),in id int)
begin
	select empSalary into sal  from employee where empId=id;
    
    # set salary to new value
    set sal=sal*1.10;
    
    # updating salary
    update employee set empSalary=sal where empId=id;
    
end //
delimiter ;

call updateSalary(@s,2);

select @s as updatedSalary;
