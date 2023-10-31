#***************************************************String Function****************************************************************************#
# String Function

select char(67);
SELECT CHAR(67, 97, 116);

select concat("anup","sir");
select lower("Anup");
select upper("anup");
select trim("    anup");

# select substr(string,s,e);
select substr("string",2,4);

# searching

# select instr(str1,str2);
select instr("strin1","t");

# select length(str);
select length("String");



#***************************************************Numeric Function****************************************************************************#
# Numeric Function

select mod(10,2);
select power(10,2);
select round(101.2222,1);
select truncate(1012.222,2);


#***************************************************Date Function****************************************************************************#
# Date Function


select curdate();
select now();
select month(curdate());
select day(curdate());
select day('1996-03-09');
select year(curdate());
select month('1996-03-09 3.45.00');

select sysdate();




#***************************************************Stored Function****************************************************************************#
# Stored Function

delimiter //
create function hellosir()
returns varchar(50)
deterministic
begin
return "HELLO SIR";
end //
delimiter ;

select hellosir();

# addition of two numbers
delimiter //
create function addition(x int,y int)
returns int
deterministic
begin
return (x+y);
end //
delimiter ;

select addition(10,20); 

