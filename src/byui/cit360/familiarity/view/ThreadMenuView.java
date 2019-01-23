package byui.cit360.familiarity.view;

import byui.cit360.familiarity.view.Collections.*;
import byui.cit360.familiarity.view.Threads.Executors;
import byui.cit360.familiarity.view.Threads.Runnables;
import byui.cit360.familiarity.view.Threads.Threads;

import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 1/17/2019.
 */

public class ThreadMenuView {

    private static Scanner input = new Scanner(System.in);

    // Output options to work with - List, Set, Queue, Tree, Map

    public void threadMenu() {

        //Display Menu
        System.out.print("\n"
                + "\nWhat would you like to Demonstrate: "
                + "\nT: ThreadsDemo"
                + "\nE: Executors"
                + "\nU: Runnables"
                + "\nR: Return to Main Menu"
                + "\nX: Exit"
                + "\n"
                + "\nPlease choose an Option: ");

        //Get response
        String choice = input.nextLine();
        choice = choice.toUpperCase();

        // Case switch for choice
        switch (choice) {
            case "T": {
                this.thread(); // Trigger List
            }
            break;
            case "E": {
                this.executor(); // Trigger Set
            }
            break;
            case "U": {
                this.runnable(); // Trigger Queue
            }
            break;
            case "R": {
                this.retmm(); // Trigger MainMenu
            }
            break;
            case "X": {
                this.exit(); // Display Menu
            }
            break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                this.threadMenu();
                break;
        }
    }


    private void thread() {
        //System.out.println("\n*** Threads Demo ***");

        Threads threadDemo = new Threads();

        threadDemo.runThreadMenu();
    }

    private void executor() {
        System.out.println("\n*** Executor Demo ***");

        Executors executorsDemo = new Executors();

        executorsDemo.runExecutorsMenu();

    }

    private void runnable() {
        System.out.println("\n*** Runnable Demo ***");

        Runnables runnablesDemo = new Runnables();

        runnablesDemo.runRunnablesMenu();

    }

    private void retmm() {
        //System.out.println("\n*** Main Menu ***");

        MainMenu  mm = new MainMenu();

        //Display Map Demo
        mm.mainMenu();
    }

    private void exit() {
        System.exit(0);
    }


}
