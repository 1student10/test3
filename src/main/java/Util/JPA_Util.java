package Util;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPA_Util {
    public static EntityManagerFactory factory;
    static {
        factory = Persistence.createEntityManagerFactory("default");
    }
    public static EntityManager getEntityManager(){
        return factory.createEntityManager();
    }
}