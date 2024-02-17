create database miniprojectt;
use miniprojectt;
create table elec_board(elec_board_id int primary key auto_increment,elec_board_name varchar(30) not null);
create table adminn(admin_id int primary key auto_increment, admin_name varchar(30), password varchar(30), elec_board_id int,foreign key(elec_board_id) references elec_board(elec_board_id)on delete cascade on update cascade);
create table tariff(tariff_id int primary key auto_increment, tariff_type double not null, tariff_descp varchar(30), admin_id int, foreign key(admin_id) references adminn(admin_id) on delete cascade on update cascade);
create table customer(cust_id int primary key auto_increment, cust_name varchar(30) not null, address varchar(50), city varchar(30));
create table accountt(acc_no int primary key auto_increment, rr_no int not null, cust_id int unique, foreign key(cust_id) references customer(cust_id) on delete cascade on update cascade);
create table billing(bill_no int primary key auto_increment, units_consumed double not null, payment_date_time datetime not null, acc_no int,foreign key(acc_no) references accountt(acc_no) on delete cascade on update cascade);
create table invoice(invoice_no int primary key auto_increment, tax_amt double default 30, bill_no int,foreign key(bill_no) references billing(bill_no) on delete cascade on update cascade, elec_board_id int, foreign key(elec_board_id) references elec_board(elec_board_id) on delete cascade on update cascade, tariff_id int, foreign key(tariff_id) references tariff(tariff_id) on delete cascade on update cascade);
-- alter table invoice add elec_board_id  int;
insert into elec_board(elec_board_name) values ("MHB"),("GUJB");
select * from elec_board;
insert into adminn(admin_name,password,elec_board_id) values ("ABC","1234",1),("DEF","1324",1),("GHI","1241",2);
select * from adminn;
insert into tariff(tariff_type,tariff_descp,admin_id) values (3,null,3),(7,null,1),(7,null,2);
select * from tariff;
insert into customer(cust_name,address,city) values ("QWE","XYZ","Pune"),("HIO","IOT","Mumbai");
select * from customer;
insert into accountt(rr_no,cust_id) values (12345,1),(49731,2);
select * from accountt;
insert into billing(units_consumed,payment_date_time,acc_no) values (100,"2023-01-12 10:52:12",1),(120,"2023-12-17 06:34:12",2);
select * from billing;
insert into invoice(tax_amt,bill_no,elec_board_id,tariff_id) values (300,1,1,1),(700,2,2,2);
SELECT * FROM invoice;


-- procedure

delimiter //
create procedure payment(in units_consumed double)
begin
declare units int default 0.0;
declare tax double default 0.0;
declare tariff1 double default 0.0;
select units_consumed into units from billing ;
select tax_amt into tax from invoice;
select tariff_type into tariff1 from tariff;
if units between 0 and 100 then
set tariff1=3.69;
set tax=units+(units*(tariff1/100));
end if;

if units between 101 and 300 then
set tariff1=7.04;
set tax=units+(units*(tariff1/100));
end if;

if units between 301 and 500 then
set tariff1=10.63; 
set tax=units+(units*(tariff1/100));
end if;

if units>500 then
set tariff1=12.6;
set tax=units+(units*(tariff/100));
end if;
end //
delimiter ;
call payment;

-- TRIGGERS


create table cust_audit( cust_id int, cust_name varchar(30) , changed_at DATETIME, action varchar(30));
-- Trigger1
delimiter //
create trigger t1
after update on customer 
for each row
begin
insert into cust_audit
set cust_id=old.cust_id,
cust_name=old.cust_name,
changed_at=NOW(),
action ='update';
end //
delimiter ;


create table elec_board_audit(elec_board_id int,elec_board_name varchar(30),changed_at DATETIME, action varchar(30));
-- Trigger 2
delimiter //
create trigger t2
after update on elec_board 
for each row
begin
insert into elec_board_audit
set elec_board_id=old.elec_board_id,
elec_board_name=old.elec_board_name,
changed_at=NOW(),
action ='update';
end //
delimiter ;

create table admin_audit(admin_id int, password varchar(30),elec_board_id int,foreign key(elec_board_id) references elec_board(elec_board_id), changed_at DATETIME, action varchar(30));
-- Trigger 3
delimiter //
create trigger t3
after update on adminn 
for each row
begin
insert into admin_audit
set admin_id=old.admin_id,
password=old.password,
elec_board_id=old.elec_board_id,
changed_at=NOW(),
action ='update';
end //
delimiter ;


create table invoice_audit(invoice_no int , tax_amt double, bill_no int,foreign key(bill_no) references billing(bill_no), elec_board_id int, foreign key(elec_board_id) references elec_board(elec_board_id), tariff_id int, foreign key(tariff_id) references tariff(tariff_id),changed_at DATETIME, action varchar(30));
-- Trigger 4
delimiter //
create trigger t4
after update on invoice 
for each row
begin
insert into invoice_audit
set invoice_no=old.invoice_no,
tax_amt=old.tax_amt,
bill_no=old.bill_no,
elec_board_id=old.elec_board_id,
tariff_id=old.tariff_id,
changed_at=NOW(),
action ='update';
end //
delimiter ;

create table account_audit(acc_no int , rr_no int , cust_id int unique, foreign key(cust_id) references customer(cust_id),changed_at DATETIME, action varchar(30) );
-- Trigger 5
delimiter //
create trigger t5
after update on accountt 
for each row
begin
insert into account_audit
set acc_no=old.acc_no,
rr_no=old.rr_no,
cust_id=old.cust_id,
changed_at=NOW(),
action ='update';
end //
delimiter ;

create table billing_audit(bill_no int , units_consumed double, payment_date_time datetime, acc_no int,foreign key(acc_no) references accountt(acc_no),changed_at DATETIME, action varchar(30) );
-- Trigger 6
delimiter //
create trigger t6
after update on billing 
for each row
begin
insert into billing_audit
set bill_no=old.bill_no,
units_consumed=old.units_consumed,
payment_date_time=old.payment_date_time,
changed_at=NOW(),
action ='update';
end //
delimiter ;

create table tariff_audit(tariff_id int , tariff_type double, tariff_descp varchar(30), admin_id int, foreign key(admin_id) references adminn(admin_id),changed_at DATETIME, action varchar(30) );
-- Trigger 7
delimiter //
create trigger t7
after update on tariff 
for each row
begin
insert into tariff_audit
set tariff_id=old.tariff_id,
tariff_type=old.tariff_type,
tariff_descp=old.tariff_descp,
changed_at=NOW(),
action ='update';
end //
delimiter ;
show triggers ;
insert into elec_board(elec_board_name) values ("APB"),("PB");
update elec_board set elec_board_name="KB" WHERE elec_board_id=3;
select * from elec_board_audit;