package byui.cit360.familiarity.view;

import byui.cit360.familiarity.Collections.CollectionsDemo;
import byui.cit360.familiarity.Threads.ThreadsDemo;
import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 1/22/2019.
 */
public class MainMenu {

    private static Scanner input = new Scanner(System.in);

    // Output options to work with

    public void mainMenu() {

        //Display mainMenu
        System.out.print("\n"
                + "\nFamiliarity to Demonstrate: "
                + "\nC: Collections"
                + "\nT: Threads, Executors, and Runnables"
                + "\nA: Application Controller Pattern"
                + "\nM: MVC"
                + "\nH: Hibernate"
                + "\nQ: QCJSON & JSON"
                + "\nN: Android HttpUrlConnection"
                + "\nS: Servlets"
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
            case "A": {
                this.acp(); // Trigger ACP
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
                this.android(); // Trigger Android HttpUrlConnection
            }
            break;
            case "S": {
                this.servlet(); // Trigger Servlets
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


    private void col() {
        //Trigger CollectionsDemo
        CollectionsDemo collectionsDemo = new CollectionsDemo();

        collectionsDemo.collection();
    }

    private void thread() {
        //System.out.println("\n*** ThreadsDemo, Executors, and Runnables Demo ***");

        ThreadsDemo threadsDemo = new ThreadsDemo();

        threadsDemo.threads();

    }

    private void acp() {
        System.out.println("\n*** Application Controller Pattern Demo ***");

    }

    private void mvc() {
        System.out.println("\n*** MVC Demo ***");

    }

    private void hibernate() {
        System.out.println("\n*** Hibernate Demo ***");

    }

    private void json() {
        System.out.println("\n*** Hibernate Demo ***");

    }

    private void android() {
        System.out.println("\n*** Android HttpUrlConnection Demo ***");

    }

    private void servlet() {
        System.out.println("\n*** Servlet Demo ***");

    }

    private void junit() {
        System.out.println("\n*** JUnit & System Level Test Demo ***");

    }

    private void exit() {
        System.exit(0);
    }

}
