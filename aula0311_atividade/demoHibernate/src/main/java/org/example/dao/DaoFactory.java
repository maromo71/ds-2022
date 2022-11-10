package org.example.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DaoFactory {
    public static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("aplicativo");

    public static EntityManager em = emf.createEntityManager();
}
