-- create a table for movies:
create table movie (id serial primary key, title varchar(50), release_date date);

-- for each movie, add date for when movie was released, note the format and the fact that the dates are in single quotes
insert into movie (id, title, release_date) values (default, 'Star Wars', '05-25-1977');
insert into movie (id, title, release_date) values (default, 'Avengers Endgame', '04-26-2019');
insert into movie (id, title, release_date) values (default, 'Singing in the Rain', '04-11-1952');

-- view our results;
select * from movie;

-- here we can find a list of other types of date objects in SQL: https://www.w3schools.com/sql/sql_dates.asp
-- examples: datetime, timestamp, year