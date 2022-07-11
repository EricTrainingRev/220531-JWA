-- allowed for intern:
select * from accounts;
-- denied for intern:
delete from accounts;
insert into accounts values (default, 200);
update accounts set balance = 300;