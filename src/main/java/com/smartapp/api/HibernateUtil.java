package com.smartapp.api;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * User: sridhar.anumandla
 * Date: 7/7/14
 * Time: 11:01 PM
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
