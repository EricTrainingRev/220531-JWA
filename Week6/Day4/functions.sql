drop table people;
create table people(id serial primary key, name varchar(50), job varchar(50), salary integer);

insert into people values (default, 'Rory', 'trainer', 600);
insert into people values (default, 'James', 'trainer', 1000);
insert into people values (default, 'Joe Mama', 'wizard', 10002);
insert into people values (default, 'Bill', 'boxer', 1000);
insert into people values (default, 'Bozo', 'clown', 10000);
insert into people values (default, 'Krusty', 'clown', 20000);
insert into people values (default, 'Pennywise', 'clown', 0);
insert into people values (default, 'Rat', 'dog', 9000);
insert into people values (default, 'Gandalf', 'wizard', 1000000);
insert into people values (default, 'Homie', 'clown', 500);
insert into people values (default, 'Courage', 'cowardly dog', 600);

-- scalar functions (functions that act on single data points)
select upper(name) from people;
select lower(name) from people;
-- get the length of the string:
select length(name) from people;

-- aggregate functions act on entire groups of data
-- a few new clauses GROUP BY
-- HAVING, similar to WHERE, but it checks group conditions
-- only display the statistics for jobs with an avg salary greater than 1000
-- alias, display the column as something else
select job, count (*) as number, avg(salary), max(salary), min(salary), sum(salary) from people group by job having avg(salary) > 1000;

