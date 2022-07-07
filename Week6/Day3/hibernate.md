## Hibernate and JPA
- JPA  - Java Persistence API, 
    - Java is a programming language, so that's going to allow us to write complex applications
    - Persistence is all about interacting with a database (insert, getting, deleting, updating)
    - API - the functionalities/methods that we can use/do to interact with these databases
- Hibernate is a specific tool that uses object-relational mapping to connect Java code with our database
- Object-Relational Mapping - maps Java objects to tables in our database
- Example, we have a pets table in our database, so we can predict that we will have to make a Pet class in Java
- Because we map a java object to our tables, it makes the data really easy to work with

## CRUD
- Create - creating/inserting new data into a table
- Read - getting/selecting data
- Update - updating pre-existing data
- Delete - deleting data

## Review of Databases
- we can have multiple databases per our RDS
- We have multiple tables in our database
- For our hibernate demo, we can create our own database, so it won't conflict with the work we've already done
- create database <name>
- To connect, we can duplicate our connection, just like when we logged in as a different user

## How to set up Maven
- Open up Visual Studio Code
- Control-shift-p -> type in Maven: Create Maven Project
- Choose maven-archetype-quickstart
- Select 1.4
- change com.example to com.revature
- change the artifcact id to hibernate-demo
- Select a destination folder
- Now the project should start to build in the terminal
- It will prompt you for various values
- For version, you can put 1
- When prompted, enter the letter "y"
- Then you can open the project
- In the pom xml , change the version to 1.8 in the maven.compiler.source tag
- Add these dependencies to the pom xml:
```
   <!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->
    <dependency>
        <groupId>org.hibernate</groupId>
        <artifactId>hibernate-core</artifactId>
        <version>6.1.1.Final</version>
        <type>pom</type>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.postgresql/postgresql -->
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.4.0</version>
</dependency>
```