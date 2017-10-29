create table if not exists USERS
(id int not null primary key auto_increment,
username varchar(100),
password varchar(100),
status int);
insert into USERS(username,password,status) values('xingming.zhaoxm','xxxxxx',1);