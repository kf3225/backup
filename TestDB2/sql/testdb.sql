drop database if exists testdb;
create database testdb;
use testdb;
create table test_table(
user_id int,
user_name varchar(255),
password varchar(255)
);

insert into test_table values
(1, "Taro", "aaaa"),
(2, "Jiro", "bbbb"),
(3, "Saburo", "cccc"),
(4, "Hanako", "dddd");