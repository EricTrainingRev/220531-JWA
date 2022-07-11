select * from pet;
-- let's create a view of all the cats in our pet table:
-- give our view a name and then a query that represents what data will appear in the view
create view cat as select * from pet where species = 'cat';

-- we can select from a view as if we're selecting from a table:
select * from cat;

-- we can edit views once we make them
-- we add in the "or replace" clause to say that if the view already exists, we edit or replace it:
create or replace view cat as 
select * from pet where color = 'grey';

select * from cat;


-- if we don't need the view anymore, we can drop it:
drop view cat;
