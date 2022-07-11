package com.revature.dao;

import com.revature.entity.Pet;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

// Since this class represents a DAO, or a data access object,
// its methods will directly relate to CRUD/databases
public class PetDao {

    // set up some member variables so we can use them in our methods
    private Session session;
    private Transaction transaction;

    // setting up the session factory:
    // static keyword means this method belongs to the class, rather than the instance
    private static SessionFactory getSessionFactory() {
         // first, we create a configuration based on hibernate.cfg.xml:
         Configuration cfg = new Configuration();
         // connect configuration to the file:
         cfg.configure("hibernate.cfg.xml");
 
         // a factory that creates sessions (this line creates the table in the database)
         SessionFactory factory = cfg.buildSessionFactory();

         // return the factory to be used in other methods
         return factory;
    }

    // we want to use the factory to create a session and then begin a transaction
    // We're going to be reusing this code so much, it's worth it to make a method so we can just call it whenever
    // we want to do a database operation
    private void beginTransaction() {
        // first, we create a session:
        // we're getting our factory from the method that we made right above
        // and then creating a session using that factory:
        // TODO: We're creating a session every time, so this could be memory inefficient, so we could modify this code
        // to use less memory by reusing the same session:
        this.session = PetDao.getSessionFactory().openSession();
        this.transaction = session.beginTransaction();
    
    }

    // whenever we end a transaction, we want to commit and close the session
    private void endTransaction() {
            transaction.commit();
            session.close();
    }

    // let's make an insert method (create)
    public void insert(Pet pet) {
        beginTransaction();
         // save the pet (this is the same as inserting in this case)
         session.save(pet);
         endTransaction();
    }
    
    // (Read)
    // given an id for a pet, return the correspondibg pet record/object
    public Pet getById(int id) {
        beginTransaction();
        Pet pet = session.get(Pet.class, id);
        endTransaction();
        return pet;
    }

    // (Read)
    // a list store can store many pets:
    public List<Pet> getAllPets() {
        beginTransaction();
        //                                                                              SQL query:                       // specify we want pet objects     // we want a list of pet objects
        List<Pet> pets = session.createQuery("SELECT p from Pet p", Pet.class).getResultList();
        endTransaction();
        return pets;
    }
    
    // update pet set name = 'new name' where id = 3;
    public Pet updatePet(int id, Pet newPet){
        beginTransaction();
        // get the pet that we want to update from the database:
        Pet petDB = session.get(Pet.class, id);
        // we go through each field and update them (don't change id)
        petDB.setName(newPet.getName());
        petDB.setSpecies(newPet.getSpecies());
        petDB.setAge(newPet.getAge());
        petDB.setBreed(newPet.getBreed());
        petDB.setColor(newPet.getColor());
        petDB.setLegs(newPet.getLegs());
        // persist these changes:
        session.save(petDB);
        endTransaction();
        return petDB;

        // TODO: make use of the session.update to make this method 
        // more concise
    }

    public void deletePet(int id){
        beginTransaction();
        // first we find the pet that we want to delete:
        Pet petToDelete = session.get(Pet.class, id);
        // and then we delete it:
        session.delete(petToDelete);
        endTransaction();
    }   
}
