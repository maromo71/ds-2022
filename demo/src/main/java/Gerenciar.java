import entity.Empregado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Gerenciar {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();
        empregado.setNome("Marcos");
        empregado.setCargo("Professor");
        empregado.setDepartamento("TI");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(empregado);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
