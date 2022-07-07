package com.revature.dao;

import com.revature.entity.Pet;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.Transaction;

// Since this class represents a DAO, or a data access object,
// its methods will directly relate to CRUD/databases
public class PetDao {

    // TODO: There's a lot of boiler plate set up code that we have to do for this method. A future step could be 
    // putting all that repetive logic in its own method so we don't have to keep writing it out

    // let's make an insert method
    public void insert(Pet pet) {
        // here we'll do the database logic:
         // first, we create a configuration based on hibernate.cfg.xml:
         Configuration cfg = new Configuration();
         // connect configuration to the file:
         cfg.configure("hibernate.cfg.xml");
 
         // a factory that creates sessions
         SessionFactory factory = cfg.buildSessionFactory();
 
         // start a session
         Session session = factory.openSession();
 
         // start a transaction, which is a series of SQL commands or operations (insert, update, etc.)
         Transaction transaction = session.beginTransaction();
 
         // save the pet (this is the same as inserting in this case)
         session.save(pet);
 
         // commit the transaction
         transaction.commit();
 
         // close out the session:
         session.close();
    }
    
}
