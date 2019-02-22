package byui.cit360.familiarity.view;

import byui.cit360.familiarity.Collections.CollectionsDemo;
import byui.cit360.familiarity.Hibernate.HibernateMenuView;
import byui.cit360.familiarity.JSON.JsonDemo;
import byui.cit360.familiarity.Mvc.MvcMenuView;
import byui.cit360.familiarity.Threads.ThreadsDemo;
import byui.cit360.familiarity.http.HttpDemo;

import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 1/22/2019.
 */
public class MainMenu {

    private static Scanner input = new Scanner(System.in);

    // Output options to work with

    public void mainMenu() throws Exception {

        //Display mainMenu
        System.out.print("\n"
                + "\nFamiliarity to Demonstrate: "
                + "\nC: Collections"
                + "\nT: Threads, Executors, and Runnables"
                + "\nM: MVC"
                + "\nH: Hibernate"
                + "\nQ: JSON"
                + "\nN: HttpUrlConnection"
                + "\nJ: JUnit & System Level Tests"
                + "\nX: Exit"
                + "\n"
                + "\nPlease choose an Option: ");

        //Get response
        String choice = input.nextLine();
        choice = choice.toUpperCase();

        // Case switch for choice
        switch (choice) {
            case "C": {
                this.col(); // Trigger CollectionsDemo
            }
            break;
            case "T": {
                this.thread(); // Trigger ThreadsDemo
            }
            break;
            case "M": {
                this.mvc(); // Trigger MVC
            }
            break;
            case "H": {
                this.hibernate(); // Trigger Hibernate
            }
            break;
            case "Q": {
                this.json(); // Trigger JSON
            }
            break;
            case "N": {
                this.url(); // Trigger HttpUrlConnection
            }
            break;
            case "J": {
                this.junit(); // Trigger JUnit
            }
            break;
            case "X": {
                this.exit(); // Display Menu
            }
            break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                this.mainMenu();
                break;
        }
    }


    private void col() throws Exception {
        //Trigger CollectionsDemo
        CollectionsDemo collectionsDemo = new CollectionsDemo();

        collectionsDemo.collection();
    }

    private void thread() throws Exception {
        //System.out.println("\n*** ThreadsDemo, Executors, and Runnables Demo ***");

        ThreadsDemo threadsDemo = new ThreadsDemo();

        threadsDemo.threads();

    }

    private void mvc() throws Exception {
        //System.out.println("\n*** MVC Demo ***");

        MvcMenuView mvc1 = new MvcMenuView();

        mvc1.runMVCMenu();

    }

    private void hibernate() throws Exception  {
        //System.out.println("\n*** Hibernate Demo ***");

        HibernateMenuView hib1 = new HibernateMenuView();

        hib1.runHibMenu();

    }

    private void json() throws Exception {
        //System.out.println("\n*** JSON Demo ***");

        JsonDemo jd = new JsonDemo();
        jd.jsonMenu();

    }

    private void url()  throws Exception {
        //System.out.println("\n*** HttpUrlConnection Demo ***");

        HttpDemo http = new HttpDemo();
        http.httpMenu();
    }

    private void junit() throws Exception  {
        System.out.println("\n*** JUnit & System Level Test Demo ***");

    }

    private void exit() {
        System.exit(0);
    }

}
