## SQL Sub-languages
- Not to be confused with dialects (ex: postgres, mysql, etc.)
1. Data Definition Language (DDL) - all about defining our tables rather than the individual data
    - create tables - creating the columns, constraints, primary/foreign keys, creating the structure of the table, not inserting any data, can only create table once, unless we drop it again
    - drop tables - getting rid of the entire table
    - truncate tables - get rid of the data in the table but the table will still be there (meaning the structure will still be there)
    - alter tables - lets you do similar specifications as in create table, but to an already existing table
        - example, renaming a column, adding a column
2. Data Manipulation Language (DML) - all about inserting, updating, deleting the data within our table:
    - insert - inserts data into a table
    - update - update data that already exists in the table
    - delete - permanently delete records from the table
3. Data Query Language (DQL) - used to query for or view the data in our table
    - select -> tells us we're getting data from a table
    - from -> indicates which table
    - where -> gives a condition to filter the rows, only return rows/records that match that condition
    - distinict -> ensures results are unique
    - limit -> limits our record count
    - order by <attribute> -> orders records by attribute, can be asc or desc (defaults to asc)
4. Data Control Language (DCL) - used to manage access to a database:
    - grant -> gives permissions to a user
    - revoke -> takes permissions away
    - Copy/paste connection on Dbeaver, give it a new name
    - edit the credentials to match the new user
    - make sure the new connection is selected when executing scripts
5. 

## Joins
- take 2 or more tables and combine the data together
- we need to introduce an person table where an person can own 1 or more pets
- a pet can't belong to one or more owner right
- not every pet is owned
- not every person has a pet
- Different types of joins:
1. inner join -> return matches that exist in both tables
2. left outer join -> return matches in both tables as well as the first (left) table
3. right outer join-> return matches in both tables as well as the second (right) table
4. full outer join -> return matches including everything

## SQL
- default lets SQL take care of the incrementing id for us, stores in a sequence
- example: insert values(default) will insert the next number
- we can reset the sequence by either dropping and recreating the table, or altering the sequence directly