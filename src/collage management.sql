create database student;
create database user;
create database adminn;
USE student;
create table details (
name varchar(100), 
reg_no INT primary key,
gender varchar(6),
c_amd_b varchar(20),
mark12 INT,
PASS VARCHAR(20),
address varchar(200));
create table result (
REG INT PRIMARY KEY,
mark1 INT,
mark2 INT,
mark3 INT,
mark4 INT,
mark5 INT,
mark6 INT,
mark7 INT,
mark8 INT);
USE user;
create table details (
name varchar(100), 
id INT primary key,
qualifi varchar(100),
branch varchar(10),
exp varchar(20),
gender varchar(6),
address varchar(200),
PASS VARCHAR(20));
create table salery ( mon int);
use adminn;
create table details (
name varchar(100), 
id INT primary key,
post varchar(100),
exp varchar(20),
gender varchar(6),
address varchar(200),
PASS VARCHAR(20));
create table salery ( mon int);
