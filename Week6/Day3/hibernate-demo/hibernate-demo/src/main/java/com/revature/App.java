package com.revature;

import com.revature.dao.PetDao;
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
        Pet pet2 = new Pet("Shadow", "Dog", "Grey", 10, 4, "golden retriever");
        // Now that we have a java object set up/created, the cool thing about hibernate
        // is that we can insert into the database

        // create an instance of our pet dao
        PetDao petDao = new PetDao();
        // using the insert method, insert both of the pets:
        petDao.insert(pet);
        petDao.insert(pet2);


        // store the return value from the database:
        // we need a default pet constructor for this to work
        // because the way hibernate gets values is it makes an empty object first and 
        // then uses setters to fill out those values:
        Pet pet3 = petDao.getById(15);
        System.out.println("This is the pet we received: " + pet3.toString());

        // get all pets from tables
        System.out.println(petDao.getAllPets());

        // update pet with id 15 using this new information:
        petDao.updatePet(15, new Pet("new name", "new species", "new color", 5, 11, "new breed"));
        

        // // first, we create a configuration based on hibernate.cfg.xml:
        // Configuration cfg = new Configuration();
        // // connect configuration to the file:
        // cfg.configure("hibernate.cfg.xml");

        // // a factory that creates sessions
        // SessionFactory factory = cfg.buildSessionFactory();

        // // start a session
        // Session session = factory.openSession();

        // // start a transaction, which is a series of SQL commands or operations (insert, update, etc.)
        // Transaction transaction = session.beginTransaction();

        // // save the pet (this is the same as inserting in this case)
        // session.save(pet);
        // session.save(pet2);

        // // commit the transaction
        // transaction.commit();

        // // close out the session:
        // session.close();
        

        // TODO Test out where the table is created



    }
}
