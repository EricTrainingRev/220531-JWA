drop table if exists pet, person;

create table person(id serial primary key, name_ varchar(50));

-- using the key word "References" we denote owner_id as a foreign key that relates to the primary key of the person table
-- adding "on delete cascade" means if we delete a record which is referenced by another record, that record will be deleted
create table pet (id serial primary key, pet_name varchar(50), species varchar(50), owner_id integer references person on delete cascade);

-- because this is the first record, it will have id 1
insert into person values (default, 'Rory');

-- by putting in id 1, we are saying that Rory owns Ashes
insert into pet values(default, 'Ashes', 'cat', 1);

-- what happens when we try to put in an owner that doesn't exist:
-- because we have the foreign key constraint set up, we aren't allowed to add references to owners that don't exist
-- insert into pet values (default, 'Garfield','cat', 2);

-- What happens when we try to delete an owner that is being referenced by the pet table:
-- we can't do this because that would make Ashes an orphan
delete from person where id = 1;

delete from pet where id = 1;

-- one way around this:

select * from pet;
select * from person;

-- We can't delete a record which another record relies on