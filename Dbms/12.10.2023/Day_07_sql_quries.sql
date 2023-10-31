use cdac23;

#********if else********

delimiter //
create procedure Salarystatus(in id int)
begin 
  declare salary decimal(15,2);
  declare status varchar(50);
  
  select empsalary into salary from employee where empId=id;
  
  if salary > 50000 then
    set status="Good Salary";
  else 
    set status="less Salary";
  end if;
  
  select status as Result;
  end //
  delimiter ;
  
 call Salarystatus(4);

#********using case********

  
delimiter //
create procedure Salarystatus1(in id int)
begin 
  declare salary decimal(15,2);
  declare status varchar(50);
  
  select empsalary into salary from employee where empId=id;
  
    set status=
    case 
     when salary>70000 then "Excelent"
     when salary>60000 then "very good"
     when salary>50000 then "good"
     else "Keep growing...."
     end ;
     
  select status as Result;
  end //
  delimiter ;
  
 call Salarystatus1(4);
  
  #******using elseif*******
  
  delimiter //
create procedure Salarystatus2(in id int)
begin 
  declare salary decimal(15,2);
  declare status varchar(50);
  
  select empsalary into salary from employee where empId=id;
  
     if salary>50000 then
     set status="Good Salary";
     elseif salary>40000 and salary<50000 then
     set status="Nice Salary";
     
     else 
     set status="Keep growing....";
     end  if;
     
  select status as Result;
  end //
  delimiter ;
  
call Salarystatus2(1);
  

#*********while loop************

delimiter //
create procedure While_loop()
  begin 
   declare num int default 1;
   declare result varchar(100) default '';
   
   set num=1;
   set result='';
    
    while num<10 do
    set result=concat(result,num,',');    
    set num=num+1;
    end while;
   
   select result;
  end //
  
  delimiter ;  

 
 call while_loop();
 

#**********loop *************

delimiter //
 create procedure Loopdemo1()
 begin
    declare x int ;
    declare str varchar(200);
    
   set x=1;
    set str='';
    
   loop_label:loop
    
   if x>10 then
     leave loop_label;
     end if;
     
     set x=x+1;
     if (x mod 2) then 
      iterate loop_label;
      
      else 
        set str=concat(str,x,',');
    
    end if;
    end loop;
    select str as Result;
    end //
    delimiter ;
 call Loopdemo1();

#*********Repeat*******

delimiter //
create procedure TestRepeat()
begin
  declare num  int default 1;
  declare result varchar(100) default '';
  
  repeat 
     set result=concat(result,num,',');
     set num=num*5;
     until num>1000
     
     end repeat;
     select result ;
end //
delimiter ;

call TestRepeat();
 