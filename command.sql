drop table if exists user_table;
drop table if exists team_table;
drop table if exists gaibu;

create table user_table(
    id int(11),
    name varchar(255)
);
create table team_table(
    id int(11),
    team enum('red', 'blue', 'green')
);

insert into user_table(id, name) values
    (1, "Tanaka"),
    (2, "Yamada"),
    (3, "Kimura"),
    (5, "Takahashi");
    
insert into team_table(id, team) values
    (1, 'red'),
    (2, 'blue'),
    (3, 'green'),
    (6, 'red');