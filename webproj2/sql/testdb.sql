drop database if exists testdb;
create database testdb;
use testdb;
create table users(
user_id int not null auto_increment,
user_name varchar(255),
password varchar(255)
);

insert into users values
("taro", "aaaa"),
("jiro", "bbbb"),
("saburo", "cccc"),
("shiro", "dddd");

create table inquiry (
name varchar(255),
qtype varchar(255),
body varchar(255)
);