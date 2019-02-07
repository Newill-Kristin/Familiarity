package byui.cit360.familiarity.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 2/5/2019.
 */
public class HibernateDemo {

    SessionFactory factory;
    Session hs = null;

    private static Scanner input = new Scanner(System.in);

    public void hibDemo() {

        Session hs = HibernateUtils.getSessionFactory().openSession();

        //Call all Records
        System.out.println("Displaying all records in table: \n");
        String HQL = "FROM contact";
        Query q = hs.createQuery(HQL);

        List<ContactEntity> list = q.list();

        for(ContactEntity con : list){
            System.out.println("\n" + con.getFirstName() + " " + con.getLastName()
                    + "\n " + con.getAdd1()
                    + "\n" + con.getAdd2()
                    + "\n" + con.getCity() + ", " + con.getState() + " " + con.getZip()
                    + "\n" + con.getTele() + "\n");
        }


        //Call just one Record
        System.out.println("Pulling a single record from the table: ");
        ContactEntity con2 = (ContactEntity) hs.load(ContactEntity.class, "1");
        System.out.println("\n" + con2.getFirstName() + " " + con2.getLastName()
                + "\n " + con2.getAdd1()
                + "\n" + con2.getAdd2()
                + "\n" + con2.getCity() + ", " + con2.getState() + " " + con2.getZip()
                + "\n" + con2.getTele() + "\n");


        //Call Multiple Records




        //Add a Record




        //Remove a Record




        hs.close();

        HibernateMenuView.runHibMenu();

    }

}

/*

private HibDemo() {
        factory = HibernateUtils.getSessionFactory();
    }

    public List<ContactEntity> getContacts() {

        try {
            hs1 = factory.openSession();
            hs1.getTransaction().begin();
            String sql = "FROM byui.cit360.familiarity.Hibernate.ContactEntity";
            List<ContactEntity> con = List<ContactEntity>hs1.createQuery(sql).getResultList();
            hs1.getTransaction().commit();
            return con;
        }

        catch (Exception e1) {
            e1.printStackTrace();
            hs1.getTransaction().rollback();
            return null;
        }

        finally {
            hs.close();

            HibernateMenuView.runHibMenu();
        }


public static HibDemo getInstance() {

        if (single_instance == null) {
            single_instance = new HibDemo();
        }

        return single_instance;
    }


 hs1 = factory.openSession();
        Transaction tx = null;

        try {
            tx = hs.beginTransaction();
            // do some work
   ...
            tx.commit();
        }

        catch (Exception e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            hs.close();
        }

 */