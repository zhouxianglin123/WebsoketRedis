create table user
(
    id       int auto_increment
        primary key,
    account  varchar(20)                   not null,
    password varchar(20)                   not null,
    username varchar(20) default 'unnamed' null
);


