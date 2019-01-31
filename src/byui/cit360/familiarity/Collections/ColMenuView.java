package byui.cit360.familiarity.Collections;

import byui.cit360.familiarity.view.MainMenu;


import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 1/17/2019.
 */

public class ColMenuView {

    private static Scanner input = new Scanner(System.in);

    // Output options to work with - List, Set, Queue, Tree, Map

    public void collectionMenu() {

        //Display Menu
        System.out.print("\n"
                + "\nCollection Types to Demonstrate: "
                + "\nL: List"
                + "\nS: Set"
                + "\nQ: Queue"
                + "\nT: Tree"
                + "\nM: Map"
                + "\nR: Return to Main Menu"
                + "\nX: Exit"
                + "\n"
                + "\nPlease choose an Option: ");

        //Get response
        String choice = input.nextLine();
        choice = choice.toUpperCase();

        // Case switch for choice
        switch (choice) {
            case "L": {
                this.lists(); // Trigger List
            }
            break;
            case "S": {
                this.set(); // Trigger Set
            }
            break;
            case "Q": {
                this.queue(); // Trigger Queue
            }
            break;
            case "T": {
                this.tree(); // Trigger Tree
            }
            break;
            case "M": {
                this.map(); // Trigger Map
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
                this.collectionMenu();
                break;
        }
    }


    private void lists() {
        //System.out.println("\n*** Lists Demo ***");

        //Create Lists Demo
        Lists listDemo = new Lists();

        //Display List Demo
        listDemo.listCol();
    }

    private void set() {
        //System.out.println("\n*** Set Demo ***");

        //Create Set Demo
        Set setDemo = new Set();

        //Display Set Demo
        setDemo.setCol();
    }

    private void queue() {
        //System.out.println("\n*** Queue Demo ***");

        //Create Queue Demo
        Queue queueDemo = new Queue();

        //Display Queue Demo
        queueDemo.queueCol();
    }

    private void tree() {
        //System.out.println("\n*** Tree Demo ***");

        //Create Tree Demo
        Tree treeDemo = new Tree();

        //Display Tree Demo
        treeDemo.treeCol();
    }

    private void map() {
        //System.out.println("\n*** Map Demo ***");

        //Create Map Demo
        Map mapDemo = new Map();

        //Display Map Demo
        mapDemo.mapCol();
    }

    private void retmm() {
        //System.out.println("\n*** Main Menu ***");

        MainMenu mm = new MainMenu();

        //Display Map Demo
        mm.mainMenu();
    }

    private void exit() {
        System.exit(0);
    }


}
