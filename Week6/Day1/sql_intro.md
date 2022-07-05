## What is Data? Database? Why is it useful? Examples?
- personal info
- banking info
- contacts
- information that we're storing that relates to an application 
- Databases help us keep track of data
- records
- massive amounts of data
- stores information in one place *, makes it easy to query, manipulate data, create

## SQL?
- Structured Query Language
- data is going to be stored in a structured/organized way, makes it easy to query or select from the data

## AWS RDS
- RDS Relational Database Service - allows us to create databases on the cloud 
- we don't have to worry about hosting it on our own machines, good accessibility
- Even though it's hosted on the cloud, we access it from our local computers

## MFA Multi-Factor Authentication
- Don't lose thousands of dollars!
- Set up MFA so that an extra code is required to log in
- In addition to password, you can set it up so that a code is sent to your phone which is also required to log in
- Now, a hacker would need your phone as well as your password to log in

## Creating RDS:
- Standard Create (not Easy Create)
- Postgres, elephant icon
- PostgresSQL 13.4-R1 (or leave it as default)
- Templates, choose Free Tier!!! Or else you will get charged
- for instance identifier, write a name that will help you remember (in our case "pets")
- leave master username as "postgres" or change it, just make sure you remember it
- for password, just make sure you remember it
- Under connectivity, select publicly accessible
- the rest can be left default

## Setting up Security Rules:
- from our instances menu/list, click on the one we just made (pets)
- scroll down to Connectivity and Security
- under VPC Security Group, click on the blue link (look something like: default (sg-0b8c1282d4ab78afa))
- Security Groups help us filter traffic in and out of our service (RDS)
- Click on inbound rules
- edit inbound rules
- Click Add rule
- Under Type, we select PostgreSQL, source: My IP
- This allows us to connect to the RDS from our local computer, not anywhere else
- Click on Save rules

## Connecting to our RDS instance:
- navigate to our list of RDS instances on AWS
- Click on our instance (pets)
- Under connectivity and security, we see the information that we need for connecting
- On Dbeaver, click on Database -> new database connection
- Select PostgreSQL
- Under Host, we put in our endpoint from AWS, example: pets.cmm7dyyeb3rr.us-east-1.rds.amazonaws.com
- Shouldn't have to change database or username, if we left it on default
- password is where we put in the password that we set up on AWS
- try default passwords like "root", "password", "postgres"
- Click on "test connection" to test it to make sure you can connect
- When the test is successful, click on Finish and your new connection should appear on the left sidebar
- We use this connection to send requests/commands to the database

## DBeaver
- application that lets us connect to, interact with databases
- DBeaver is not a database itself, it is just an application that we use to interact with a database that we already have set up
- This is why we still need to create a database on RDS before we use DBeaver
- [Install Link](https://dbeaver.io/download/)

## SQL
- case-insensitive, so we use snake case, or _ between words
- data types: varchar(n), integer, serial, boolean, date, time, timestamp
- char contains extra padding, therefore takes up more space, varchar does not have the padding so more memory efficient
- example: varchar(50) but you only store the word 'cat', this would only take up 3 letters
- char(50) but only store the word 'cat', it would take up the full 50 because the extra 47 letters would be strored as blank spaces
- All strings should be single quotes
- serial is an integer but it has special capabilities to help us uniquely identify our records

## Definitions
- database - collection of data. In the case of SQL, a database is a collection of related tables
    - example, if we had a pet store database, the tables could be pets, customers, items
- relational database - tables in the database are related in some way
    - example, a customer could own a pet, or posess many items
- table - represents an object/entity, comprised of rows and columns
- columns - represents a field, has some data type, and some constraints
    - example, a column could be name indicating that the values in that column represent a name
- row - represents a specific record in the table
    - example, a record would give all the relevent information for an entity (Ashes, cat, grey fur, 10 years old)


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
4. 
5. 

## Primary Keys
- let's say we have 2 pets with the same name
- How do we differentiate between them? (ex: update/delete) We don't want the same actions to happen to both of them
- We need a way to universally distinguish between pets regardless of any of the other fields (name, age, species)
- This is where primary keys come in
- Primary keys
    - uniquely identify a record/row in a table
    - have to be unique, no two primary keys can repeat
    - can't be null, they have to have some value


## if exists vs. if not exists
- when we check "if exists" before we drop, we want to make sure we're dropping something
- If we drop a table, picture it like we're setting a box on fire (getting rid of it)
    - However, we don't want to set a fire if there's nothing to burn so the "if exists" checks to make sure that there is a box (or table) to burn
- when we check "if not exists" before we create a table, we want to make sure we're not creating any duplicates
-  if we already have a box labelled "pets", we don't want to create another box named "pets" because that would confused, it would be redundant
    - so, by checking to make sure it doesn't exist, we ensure that no redundant boxes are created