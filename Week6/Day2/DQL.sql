-- data query language is all about viewing/reading data from the table:
-- * means all columns
select * from pet;

-- specify which columns we want to grab, limiting the columns we get
select pet_name, species from pet;

-- specify which records we get:
select * from pet where species = 'cat';
-- all cats younger than 10:
select * from pet where species = 'cat' and pet_age < 10;

-- all cats or pets younger than 10:
select * from pet where species = 'cat' or pet_age < 10;

-- select distinct pet names:
select distinct pet_name from pet;

-- select only the first 5 pets
select * from pet limit 5;

-- order by a certain attribute:
select * from pet order by pet_name;
select * from pet order by pet_name limit 6;
select * from pet order by pet_name desc;
select * from pet order by pet_name asc;

