create database plasma
use plasma
create table register(FIRSTNAME varchar(30) not null,LASTNAME varchar(30) not null,
CONTACTNUMBER varchar(30) ,ADDRESS varchar(20),
EMAIL varchar(30),
PASSWRD varchar(20) ,CONFIRMPASSWRD varchar(30));
select * from register

create table donar(DONARNAME varchar(30) not null,gender varchar(30) not null,
CONTACTNUMBER varchar(30) ,DOB varchar(20),
ADDRESS varchar(30),WEIGHT varchar(30),IC VARCHAR(10),
BP varchar(20) ,BLOODTYPE varchar(30) not null,EXAMINEDDOCTOR varchar(30),BBANKNAME varchar(30));
select * from donar



create table patient(NAME varchar(30) not null,GENDER varchar(30) not null,
CONTACTNO varchar(10) ,DOB varchar(10),
ADDRESS varchar(30),BLOODTYPE varchar(30),HOSPITALNAME varchar(30),
BLOODBANKNAME varchar(30),DONARNAME varchar(30),CNO varchar(30));
select * from patient
drop table patient




