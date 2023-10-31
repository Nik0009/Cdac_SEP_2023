use cdac23;

create table voter(
	voterId int,
    voterName varchar(50) not null,
    age int check(age>=18),
    aadhar varchar(12) unique,
    income decimal(10,2) default 0.00,
    primary key(voterId) 
    
    
    # primary key(col1,col2) for making two coloumn primary keys.
    
);


insert into voter(voterId,voterName,age,aadhar,income) values (101,"ramesh",19,"12334443",200000);
insert into voter(voterId,voterName,age,aadhar,income) values (102,"ramesh",19,"22334443",200000);
insert into voter(voterId,voterName,age,aadhar,income) values (104,"suresh",22,"22323134443",0.0);
insert into voter(voterId,voterName,age,aadhar,income) values (105,"rajesh",22,"2223134443",2012222);
insert into voter(voterId,voterName,age,aadhar,income) values (106,"mahesh",22,"2232313444",0.0);
insert into voter(voterId,voterName,age,aadhar,income) values (107,"sh",22,"223231314443",13233);
insert into voter(voterId,voterName,age,aadhar,income) values (108,"suraj",25,"2255554883",745656);
insert into voter(voterId,voterName,age,aadhar,income) values (109,"suraj",null,"22955554883",749656);
insert into voter(voterId,voterName,age,aadhar,income) values (110,"suraj",38,null,7499656);

select * from voter;
desc voter;

# Aggregate function

select max(income) as "Highesr Income" from voter;
select min(income) as "Lowest Income" from voter;
select sum(income) as "Total Income" from voter;
select count(*) as "Total Record" from voter;
select avg(income) as "Average Income" from voter;


# Clauses
Select * from voter;
Select voterName as Name,age  as Age from voter;
Select voterName as Name,age  as Age,income from voter where income>100000;
Select voterName as Name,age  as Age,income from voter where income=100000;
Select voterName as Name,income from voter where income in(250000000000,745656,4500000);
Select voterName as Name,income from voter where income between 745654 and 5039392012222;
Select voterName as Name,age as age,income from voter where age>25 or income > 745654;


# limit and offset 
Select * from voter limit 3;
Select * from voter limit 3 offset 3; 

# like oprator
# for finding with frist letter of name
Select * from voter where voterName like 'ma%';

# for finding with last letter of name
Select * from voter where voterName like '%jesh';

# for finding with middle letter of name
Select * from voter where voterName like '%_esh_%';

# sorting record using order by in ascending
select voterName,income from voter order by income;

# sorting record using order by descsding
select voterName,income from voter order by income desc;

# group by always use with sum() aggrigation function .
select age,sum(income) from voter group by (age);

# having works with olny group by 
select age,sum(income) from voter group by (age) having age>20;

# is null
select * from voter where aadhar is null;

#is not null
select * from voter where aadhar is not null ;


# distinct used for not repeted record 
select distinct(voterName) from voter;
select distinct(age) from voter;



