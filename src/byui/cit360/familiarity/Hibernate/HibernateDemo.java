package byui.cit360.familiarity.Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

import static byui.cit360.familiarity.Hibernate.HibernateMenuView.*;

/*
 * Created by Kristin Newill (aingealfire) on 2/5/2019.
 */

public class HibernateDemo {

    private static Scanner input = new Scanner(System.in);

    public void hibDemo() {

        Session hs = HibernateUtils.getSessionFactory().openSession();

        //Call all Records
        System.out.println("Displaying all records in table: \n");
        String HQL = "FROM Contact";
        Query q = hs.createQuery(HQL);

        List<Contact> list = q.list();

        for (Contact con : list) {
            System.out.println("\n" + con.getFirstName() + " " + con.getLastName()
                    + "\n " + con.getAdd1()
                    + "\n" + con.getAdd2()
                    + "\n" + con.getCity() + ", " + con.getState() + " " + con.getZip()
                    + "\n" + con.getTele() + "\n");
        }


        //Call just one Record
        System.out.println("Pulling a single record from the table: ");
        Contact con2 = hs.load(Contact.class, 2);
        System.out.println("\n" + con2.getFirstName() + " " + con2.getLastName()
                + "\n " + con2.getAdd1()
                + "\n" + con2.getAdd2()
                + "\n" + con2.getCity() + ", " + con2.getState() + " " + con2.getZip()
                + "\n" + con2.getTele() + "\n");

        hs.close();

        //Updating a record in the database
        Session hs2 = HibernateUtils.getSessionFactory().openSession();
        System.out.println("\n Updating a contact:");
        Transaction tr = hs2.beginTransaction();

        Contact con3 = hs2.load(Contact.class, 4);
        con3.setFirstName("Bubba");

        hs2.update(con3);
        tr.commit();

        System.out.println("\n Update Successful... \n");

        System.out.println("\n" + con3.getFirstName() + " " + con3.getLastName()
                + "\n " + con3.getAdd1()
                + "\n" + con3.getAdd2()
                + "\n" + con3.getCity() + ", " + con3.getState() + " " + con3.getZip()
                + "\n" + con3.getTele() + "\n");

        hs2.close();
        tr = null;


        //Deleting a record in the database
        Session hs3 = HibernateUtils.getSessionFactory().openSession();
        Transaction tr3 = hs3.beginTransaction();

        Contact con4 = hs3.load(Contact.class, 4);
        if (con4 != null) {
            hs3.delete(con4);
        }

        tr3.commit();

        System.out.println("\n Record deleted. No more Bubba!");

        hs3.close();
        tr3 = null;


        //Adding a record in the database
        Session hs4 = HibernateUtils.getSessionFactory().openSession();
        Transaction tr4 = hs4.beginTransaction();

        Contact con5 = new Contact();
        con5.setId(4);
        con5.setFirstName("Mama");
        con5.setLastName("Claus");
        con5.setAdd1("1 North Pole Dr");
        con5.setAdd2("Box 4646");
        con5.setCity("Winterville");
        con5.setState("NP");
        con5.setZip("43433");
        con5.setTele("4646464646");

        hs4.save(con5);

        tr4.commit();

        System.out.println("\n" + con5.getFirstName() + " " + con5.getLastName()
                + "\n " + con5.getAdd1()
                + "\n" + con5.getAdd2()
                + "\n" + con5.getCity() + ", " + con5.getState() + " " + con5.getZip()
                + "\n" + con5.getTele() + "\n");

        hs4.close();
        tr4 = null;

        //Resetting record in the database
        Session hs5 = HibernateUtils.getSessionFactory().openSession();
        Transaction tr5 = hs5.beginTransaction();

        Contact con6 = hs5.load(Contact.class, 4);
        con3.setFirstName("Santa");

        hs5.update(con6);
        tr5.commit();

        hs5.close();
        tr5 = null;


        this.endDemo();

    }

    private void endDemo() {
        HibernateMenuView hib1 = new HibernateMenuView();

        hib1.runHibMenu();
    }

}




