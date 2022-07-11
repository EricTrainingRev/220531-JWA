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

![Venn Diagram](https://docs.trifacta.com/download/attachments/160412683/JoinVennDiagram.png?version=1&modificationDate=1596167437085&api=v2)

## Transactions
- transaction a series of commands (could be inserts, updates, deletes, sometimes queries but mostly DML)
- we're going to learn about some rules that ensure that the transactions don't "mess with" the database
- ACID acronym helps us remember these rules
- Atomic - think of the smallest piece of matter, can't be broken up. In the same way, transactions should be atomic meaning that either everything in a transaction happens or nothing does. In other words we can't break up a transaction. 
Example: transferring money from one account to another. This would involve subtracting 100 dollars from one account and adding 100 dollars to another account. We wouldn't want only one of those commands to happen because either the 100 dollars would dissappear completely or we would have a 100 dollars that appeared out of nowhere.
- Consistent - the data in the database should remain consistent and logical before and after the transaction. An example could be if we have a primary key set up (unique and non-null). We would want to ensure that the primary key stays valid before and after the transaction, ensuring that each record has a unique-non-null value for the primary key field. Nothing in the transaction should make the primary key null or non-unique. Consistency isn't just about primary keys, it ensures that all of the rules we have set up with the table stay consistent and logical before and after the transaction.
- Isolation - deals with 2 or more transactions. If 2 transactions are executed, one transaction should not affect the other. Imagine you're paying someone 20 dollars and also getting 30 dollars from someone else. These are 2 completely different transactions so they should NOT affect each other. The 2 transactions are isolated from each other. 
- Durable - if some sort of failure occurs, (crashes, power outages, natural disasters), make sure that the committed data is stored. Imagine if the power went out at a data center. You want to make sure that the data is still there when the power goes back on.

## Multiplicity Relationships
- Reminder, what makes a database a relational database?
- In our databases we have multiple tables that relate to each other
- example: pets have an owner column that "relates to" the person column
### One to One Relationship
- 1 entity that maps to 1 and only 1 entity
- At a school, each student has a specific schedule with their classes, times, materials required, etc.
- Each student only has one schedule. Even if student has multiple classes, still one schedule. 
- Each schedule belongs to one student. 
### One to Many Relationship
- 1 entity that has many entities related to it
- One owner can have many pets whereas one pet can only belong to a single owner
### Many to Many Relationship
- Many entities mapped to many other entities
- A schedule could have multiple classes
- A class can be in multiple schedules

### Example (many to one, one to one):
![Example of Multiplictity Relationships in an e-commerce example](https://i.stack.imgur.com/ThOGR.png)

## SQL Views
- A View is virtual table that we create using the results of some sort of select query
- we can create, modify, or drop views
- we can select from views as if it was a real table

## SQL
- default lets SQL take care of the incrementing id for us, stores in a sequence
- example: insert values(default) will insert the next number
- we can reset the sequence by either dropping and recreating the table, or altering the sequence directly