-- create a table for people with name, email
create table if not exists person (id serial primary key, name varchar(50), email varchar(50));

-- insert some temporary data:
insert into person values (default, 'Rory''s', 'r@gmail.com');
insert into person values (default, 'James', 'j@gmail.com');
insert into person values (default, 'Michael', 'm@gmail.com');
insert into person values (default, 'Nirlouse', 'n@gmail.com');

truncate pet;
-- why add this new column?
-- we add this column to reference the other table, so for example, if the owner id is 1, that means whichever owner corresponds to id 1
-- owns this pet
alter table pet add column owner_id integer;
select * from pet;

-- Rory owns Ashes
insert into pet values (default, 'Ashes', 'cat', 'grey', 11, 4, 'Maine Coone', 1);

-- James owns Scooby
insert into pet values (default, 'Scooby Doo', 'dog', 'brown', 11, 4, 'Great Dane', 2);

-- let's say no one owns Goolosh
insert into pet values (default, 'Goolosh', 'aardvark', 'grey', 5, 4, 'NA', null);





select * from person;

