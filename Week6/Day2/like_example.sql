create table names (fname varchar(50));

insert into names values('rory');
insert into names values('tory');
insert into names values('jory');
insert into names values('bill');

-- we use the like keyword to match substrings
-- the % sign is a catch-all delimiter:
-- this will watch match rory, tory, and jory
select * from names where fname like '%ory';