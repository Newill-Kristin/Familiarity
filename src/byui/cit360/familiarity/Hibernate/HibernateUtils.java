package byui.cit360.familiarity.Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by Kristin Newill (aingealfire) on 2/6/2019.
 */
public class HibernateUtils {

    private static final SessionFactory sfac = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {

        try{
            ServiceRegistry servReg = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();

            Metadata meta = new MetadataSources(servReg).getMetadataBuilder().build();

            return meta.getSessionFactoryBuilder().build();

        }

        catch (Throwable ex){

            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }

    }

    public static SessionFactory getSessionFactory () {
        return sfac;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }

}
