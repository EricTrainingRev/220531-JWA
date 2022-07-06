-- DCL Data Control Language
-- DCL is all about ensuring that different users have different priveleges/abilities to access a database
create table accounts (id serial primary key, balance integer);

-- say there's an intern at the bank, and they shouldn't have access to everything:
create user intern;

-- we can grant certain permissions (select, update, insert, delete) for a user on a table
-- allow the intern to select (read data) from the accounts)
grant select on accounts to intern;

revoke delete, update, insert on accounts from intern;

-- insert some dummy data to test this:
-- even though, the order doesn't match when we created the table, we specify the columns and match it accordingly
insert into accounts (balance, id) values (100, default);
insert into accounts (balance, id) values (200, default);
insert into accounts (balance, id) values (300, default);

select * from accounts;