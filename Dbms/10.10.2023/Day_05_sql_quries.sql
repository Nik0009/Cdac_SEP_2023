select * from cdac23.employee;

use cdac23;

select * from employee where empSalary>20000;

# for creating index on coloumn 
create index salIndex on employee(empSalary);

# for droping index
drop index salIndex on employee;



#***************************************************************************

# temporary table

# 1.without using existing table
create temporary table table1( tId int, tName varchar(25));
desc table1;


# 2.create tamporary table with structure of existing table

create temporary table table2 like department;

desc department;
desc table2;

select * from table2;

# 3. temporary table with structure and data of existing table

create temporary table table3 select * from department;

desc table3;
select * from table3;


create temporary table table4 select name from department;
select * from table4;


