
select * from cdac23.voter;

# *************************************************************************************************************
# TCL COMMANDS
# *************************************************************************************************************

# this command is used for tcl coomands
start transaction;

select * from department;
insert into department values("10","Finance");

update department set name="Marketing" where deptId=105;

update department set name="Finance" where deptId=105;

# savepoint
savepoint

#rollback command
rollback;

# commit command
commit;

# *************************************************************************************************************
# DCL COMMANDS
# *************************************************************************************************************

# to find all users list in mysql( list of created users)
select user from mysql.user;

# to find current user/working user
select user();
use cdac23;

# grand command for grand delete to user ram
grant delete on department to Ram@localhost;

# revoke 
revoke insert on department from Ram@localhost;


# *************************************************************************************************************
# nested queries

select * from cdac23.employee;
select * from cdac23.department;

select empName from employee where did=(select deptId from department where name="developer");
select deptId from department where name="developer";

update employee set empSalary=empSalary-50000  where did=(select deptId from department where name="developer");

update employee set empSalary=empSalary+50000  where did=(select deptId from department where name="developer");

#select max(income) as "Highesr Income" from voter;

# finding 2nd hight salary without using nested query
select empName,empSalary from employee order by(empsalary) desc limit 1 offset 2;

# finding 2nd hight salary using nested query
select empName,empSalary from employee where empSalary=(select empSalary from employee order by(empSalary)desc limit 1 offset 2 );

select max(empSalary) from employee where empSalary < (select max(empSalary) from employee where empSalary < (select max(empSalary) from employee) );
select max(empSalary) from employee;

# for creating views
create view Showviewname as
select empName,empSalary from employee where empSalary=(select empSalary from employee order by(empSalary)desc limit 1 offset 2 );

select * from Showviewname;

drop view viewname;

create view emp as
select employee.empName,department.name from employee left join department on employee.did=department.deptId;

select * from emp;
