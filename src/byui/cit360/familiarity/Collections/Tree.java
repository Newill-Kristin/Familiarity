package byui.cit360.familiarity.Collections;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Kristin Newill (aingealfire) on 1/16/2019.
 */
public class Tree {

    private static Scanner input = new Scanner(System.in);
    TreeSet<String> demoTree1 = new TreeSet<>();

    public void treeCol() {


        System.out.println("Lets make a TreeSet! ");
        System.out.print("Enter the first thing to add to your TreeSet: ");
        Scanner input = new Scanner(System.in);
        String thing = input.nextLine();
        demoTree1.add(thing);

        int num = demoTree1.size();
        System.out.println("You have " + num + " items in your TreeSet. \n");
        System.out.println("Your TreeSet contains:");
        demoTree1.forEach(t -> System.out.println(t));
        //run the Lists Menu
        this.runListMenu();
    }

    public void runListMenu() {
        //Display Menu
        System.out.print("\n"
                + "\nWhat do you want to do now?"
                + "\nA: Add more to my TreeSet"
                + "\nR: Remove something from my TreeSet"
                + "\nC: Return to the CollectionsDemo Menu"
                + "\nX: Exit"
                + "\n"
                + "\nPlease choose an Option: ");

        //Get response
        String choice = input.nextLine();
        choice = choice.toUpperCase();

        // Case switch for choice
        switch (choice) {
            case "A": {
                this.treeadd(); // Add
            }
            break;
            case "R": {
                this.treerem(); // Remove
            }
            break;
            case "C": {
                this.retmenu(); // Return to CollectionsDemo
            }
            break;
            case "X": {
                this.exit(); // Exit
            }
            break;
            default:
                System.out.print("\n*** Invalid Entry *** Try Again: ");
                this.runListMenu();
                break;
        }
    }


    private void treeadd() {
        System.out.print("Enter something to add to your TreeSet: ");
        Scanner additem = new Scanner(System.in);
        String addthing = additem.nextLine();
        demoTree1.add(addthing);

        int num = demoTree1.size();
        System.out.println("You have " + num + " items in your TreeSet. \n");
        System.out.println("Your TreeSet contains:");
        demoTree1.forEach(t -> System.out.println(t));
        this.runListMenu();
    }

    private void treerem() {
        System.out.print("Enter something to remove from your TreeSet: ");
        Scanner remitem = new Scanner(System.in);
        String remthing = remitem.nextLine();
        demoTree1.remove(remthing);

        int num = demoTree1.size();
        System.out.println("You have " + num + " items in your TreeSet. \n");
        System.out.println("Your TreeSet contains:");
        demoTree1.forEach(t -> System.out.println(t));
        this.runListMenu();
    }

    private void retmenu() {
        //Create Menu
        ColMenuView colMenuView = new ColMenuView();

        //Display Menu
        colMenuView.collectionMenu();
    }

    private void exit() {
        System.exit(0);
    }

}
