/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.touro.mco152.bm.persist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * EM provides a reference to an EntityManager singleton.
 *
 * The EntityManager instance is used for persistence throughout the application.
 *
 * @author James
 */
public class EM {

    private static EntityManager em = null;

    /**
     * Provides client with EntityManager instance.
     * If an instance already exists, it returns that instance.
     * Otherwise, it creates and returns a new instance.
     *
     * @return the single application-wide EntityManager instance
     */
    public static EntityManager getEntityManager() {
        if (em == null) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("jDiskMarkPU");
            em = emf.createEntityManager();
        }
        return em;
    }
}
