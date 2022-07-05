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