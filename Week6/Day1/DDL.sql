-- This is a comment in SQL, start it with --
-- This file is called a script. It is where we write SQL code and then execute it
-- We're going to be talking about Data Definition Language in this script:

-- drop table gets rid of the table from the database, not just the data but the structure itself:
-- we add the "if exists" to check if the table exists or not before we delete it:
drop table if exists pet_store;

-- when we create a table, we give it a name and define some columns:
-- with varchar, we specify the max length of the strings
-- "if not exists" checks if it doesn't exist, because we wouldn't want to try to make a table
-- that already exists: 
create table if not exists pet_store (pet_name varchar(50), species varchar(50), color varchar(50), pet_age integer, legs integer, bree varchar(50));

-- truncate deletes all the data in a table:
-- won't do much now because we have no data:
truncate pet_store;

-- alter a pre-existing table:
-- remove mispelled column
alter table pet_store drop column bree;
-- add correctly spelled column
alter table pet_store add column breeed varchar(50);
-- we made another typo, so now we can edit it directly:
alter table pet_store rename column breeed to breed;

-- this is DQL, but we use it here to see what happened:
select * from pet_store;