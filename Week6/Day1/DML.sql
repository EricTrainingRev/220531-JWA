-- Data Manipulation Language is all about editing the information within a table
-- This is one of our DDL commands, it wipes out the table of it's data:
truncate pet;

select * from pet;

-- insert a new pet:
insert into pet values (1, 'Ashes', 'cat', 'grey', 10, 4, 'Maine Coone');
insert into pet values (2, 'Ashes', 'cat', 'orange', 5, 4, 'orange-haired cat');
insert into pet values (3, 'Toro', 'cat', 'b&w', 14, 4, 'domestic short hair');
insert into pet values (4, 'Sevyn', 'dog', 'brown', 1, 4, 'Pitbull');

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

