insert into user values (1001,to_date('01/02/1979','DD/MM/YYYY'), 'AB');
insert into user values (1002,sysdate(), 'Jack');
insert into user values (1003,sysdate(), 'Jill');

insert into post values (100,'First post', 1001);
insert into post values (101,'2nd post', 1001);
insert into post values (102,'First post for user 1002', 1002);
insert into post values (103,'First post for user 1003', 1003);