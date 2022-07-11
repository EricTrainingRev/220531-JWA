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
insert into pet values (default, 'Shadow', 'cat', 'grey', 11, 4, 'Maine Coone', 1);

-- James owns Scooby
insert into pet values (default, 'Scooby Doo', 'dog', 'brown', 11, 4, 'Great Dane', 2);

-- let's say no one owns Goolosh
insert into pet values (default, 'Goolosh', 'aardvark', 'grey', 5, 4, 'NA', null);

-- inner join:
-- specify which tables to join
-- specify which condition to join them on
-- inner join only takes matches where there are valid values in both tables
-- we're only taking pet/owner pairs for which there is a valid pet and a valid owner
select * from pet inner join person on pet.owner_id = person.id;
-- left join, so we get Goolosh, because there are valid left values even though there are no right values (no person that owns Goolosh)
-- we're going to take every pet regardless of whether they have an owner
select * from pet left join person on pet.owner_id = person.id;
-- right join, we're going to take every person regardles of whether they have a pet
select * from pet right join person on pet.owner_id = person.id;
-- full outer join:
-- we're taking everything, we're going to have a lot of null values
select * from pet full outer join person on pet.owner_id = person.id;
-- pet left join person is the same as person right join pet, the only difference would be the order of the columns in the resulting table


select * from person;

