drop database if exists testdb;
create database testdb;
use testdb;
create table users (
user_id int primary key auto_increment,
user_name varchar(255),
password varchar(255)
);

insert into users values
(1, "taro", "aaaa"),
(2, "jiro", "bbbb"),
(3, "saburo", "cccc"),
(4, "shiro", "dddd");

create table inquiry (
name varchar(255),
qtype varchar(255),
body varchar(255)
);