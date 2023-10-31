use cdac23;
select * from department;
insert into department values("106","pentry");
delete from  department where deptId=106;

# revoke insert on department from Ram@localhost;
# grant delete on department to Ram@localhost;
