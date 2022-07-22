package com.revature.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    
    private static Session session;
    private static Transaction transaction;
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory(){

        // this way of creating the session factory is called the singleton design pattern

        if(sessionFactory == null){
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            sessionFactory = cfg.buildSessionFactory();
        }
         // return the factory to be used in other methods
         return sessionFactory;
    }

    // this beginTransaction method can be used any any daos that I create now
    public static void beginTransaction() {
        session = getSessionFactory().openSession();
        transaction = session.beginTransaction();   
    }

    public static void endTransaction() {
        transaction.commit();
        session.close();
}

    public static Session getSession() {
        return session;
    }





}
