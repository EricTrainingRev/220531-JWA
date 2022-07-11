create table names (fname varchar(50));

insert into names values('rory');
insert into names values('tory');
insert into names values('jory');
insert into names values('majory');
insert into names values('bill');
insert into names values('will');
insert into names values ('bob');

-- we use the like keyword to match substrings
-- the % sign is a catch-all delimiter:
-- this will watch match rory, tory, and jory
select * from names where fname like '%ory';
select * from names where fname like 'b%';
select * from names where fname like '%il%';
select * from names where fname like '%o%';