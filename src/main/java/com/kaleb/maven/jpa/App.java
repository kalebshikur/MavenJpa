package com.kaleb.maven.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
 
    {
    	Rest rr = new Rest();
    	rr.setId(106);
    	rr.setName("demona");
    	rr.setPoints(1919);
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	
    	em.persist(rr);
    	
    	em.getTransaction().commit();
    	
    	
    //	Rest rs = em.find(Rest.class, 103);
    	
    	System.out.println(rr);
    	
        System.out.println( "Hello World!" );
    }
}
