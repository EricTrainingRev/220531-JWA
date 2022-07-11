## topics for this afternoon:
- Aggregate and Scalar functions - functions that act on our SQL data
- Foreign Keys - link tables in a database
- Object Relational Mapping - linking our Java classes to RD tables

## Foreign Keys
- primary keys - non-null and unique, acts as the primary identifier of a record in a table
- foreign keys connect or relate too tables
- pet table could have a column owner_id that relates to a person table

## Aggregate and Scalar Functions
- scalar function - a function that acts on a single value
- aggregate function - a function that acts on multiple values
- GROUP BY lets us group data by a column/field
- HAVING is like WHERE but it checks conditions on the group level
- RORY TODO, find a list of the different 

## Object Relational Mapping
- Map Java objects to SQL tables
- Pet object -> pet table
- fields in our class (name, age, etc.) map directly to the columns in our relational database

### Impedance mismatch (differences between object-oriented and relational database paradigms)
1. Granularity - refers to the mismatch in the number of classes that are mapped to the number of tables in the database
2. Inheritance - java objects can be connectec via inheritance while tables are not
3. Identiy - records in a table are identified by a primary key whereas objects are identified by their object equality (attributes, data)
4. Association - java objects are linked by association while in a database, tables are linked via foreign keys
5. Naviagation - the ways of accessing objects and data in a database are fundamentally different

All these reasons are why we need to map java objects to a database using hibernate rather than just directly putting them in
- id annotation
- map the fields to columns
- map objects to tables

### Object States
1. Transient State - an object that is created in Java with the new keyword but doesn't have a row in the database
2. Persistent State - we created an object and called save(), persist() or saveOrUpdate(), persisted it to the database. At this point, the connection between Java and SQL is there, where the java object is synced up with the row in the table
3. Detached - when the session closes, a persistent object becomes detached

### State vs Behavior Testing
- To be continued