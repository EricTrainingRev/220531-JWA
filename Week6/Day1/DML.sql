-- Data Manipulation Language is all about editing the information within a table
-- This is one of our DDL commands, it wipes out the table of it's data:
-- truncate is the same as delete from with no where clause
truncate pet;

select * from pet;

--insert into pet (id, pet_name, species, color, pet_age, legs, breed) values (default, 'new pet', 'new species', 'grey', 1,1,'new breed');

-- insert a new pet:
-- the "default" keyword automatically counts our ids for us:
insert into pet values (default, 'Ashes', 'cat', 'grey', 10, 4, 'Maine Coone');
insert into pet values (default, 'Ashes', 'cat', 'orange', 5, 4, 'orange-haired cat');
insert into pet values (default, 'Toro', 'cat', 'b&w', 14, 4, 'domestic short hair');
insert into pet values (default, 'Sevyn', 'dog', 'brown', 1, 4, 'Pitbull');
insert into pet values (default, 'new dog', 'dog', 'brown', 15, 4, 'German Shepard');
insert into pet values (default, 'Scooby Doo', 'dog', 'brown', 8, 4, 'Great Dane');
insert into pet values (default, 'Garfield', 'cat', 'orange', 10, 4, 'Tabby');
insert into pet values (default, 'Clifford', 'dog', 'red', 2, 4, 'Big Red Dog');
-- update an existing pet:
-- for an update clause, we want to change something only under a certain condition:
-- if we don't have a where clause, update the entire table:
update pet set pet_age = 11 where id = 1;

-- delete a pet, removes a record from the table based on condition:
delete from pet where id = 1;
-- delete all records from the table, no where clause
-- delete from pet;

-- select all columns and all rows from pet:
select * from pet;

