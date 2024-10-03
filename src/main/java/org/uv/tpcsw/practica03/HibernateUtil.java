package org.uv.tpcsw.practica03;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
    
    private static final SessionFactory sessionFactory;
 
     static {
        // Create the SessionFactory from standard (hibernate.cfg.xml) 
        // config file.
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

        sessionFactory = configuration.buildSessionFactory(serviceRegistry);

    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
}
