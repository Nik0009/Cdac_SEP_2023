select * from cdac23.employee;
use cdac23;
select empName from employee where empName like "S%";
select empSalary from employee where empSalary between 50000 and 100000;
alter table employee add column empFullName varchar(25);
alter table employee add column empLastName varchar(25);

update employee set empLastName="vaibhav" where empId=1;

set sql_safe_updates=0;

update employee set empLastName="vaibhav" where empName="Ganesh";
select empName,empSalary from employee group by (empName);