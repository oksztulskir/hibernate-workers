package com.sda.jpa.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.function.Consumer;

/**
 */
public class JpaHelper {
    private static EntityManager em;

    public static EntityManager getEntityManager() {
        if (em == null) {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysqlPU");
            em = factory.createEntityManager();
        }
        return em;
    }

    public static void doInTransaction(Consumer<EntityManager> action) {
        try {
            EntityTransaction transaction = getEntityManager().getTransaction();
            transaction.begin();
            action.accept(getEntityManager());
            transaction.commit();
        } catch (RuntimeException ex) {
            getEntityManager().getTransaction().rollback();
            throw new RuntimeException(ex);
        }
    }
}
