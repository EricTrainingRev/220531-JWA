package com.revature;

import com.revature.entity.Pet;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // create a pet object
        Pet pet = new Pet("Ashes from hibernate", "Cat", "grey", 10, 4, "Maine Coone");
        
        // Now that we have a java object set up/created, the cool thing about hibernate
        // is that we can insert into the database

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
