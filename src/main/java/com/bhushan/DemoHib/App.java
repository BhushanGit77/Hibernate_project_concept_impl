package com.bhushan.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Alien a1 = new Alien();
       
       a1.setAid(107);
       a1.setAname("Jadoo");
       a1.setAtech("Java");

       Configuration conn = new Configuration().configure().addAnnotatedClass(Alien.class);
       SessionFactory sf = conn.buildSessionFactory();
       Session session = sf.openSession(); 
       
       Transaction tx = session.beginTransaction();
       session.save(a1);
       tx.commit();
       
       System.out.println("Hello World");

    }
    
}
