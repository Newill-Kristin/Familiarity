package byui.cit360.familiarity.view.Collections;

import byui.cit360.familiarity.view.ColMenuView;

import java.util.HashSet;
import java.util.Scanner;


/**
 * Created by Kristin Newill (aingealfire) on 1/16/2019.
 */
public class Set {

    private static Scanner input = new Scanner(System.in);
    HashSet<String> demoSet1 = new HashSet<>();

    public void setCol() {

        System.out.println("Lets make a set! ");
        System.out.print("Enter the first thing to add to your set: ");
        Scanner input = new Scanner(System.in);
        String thing = input.nextLine();
        if (demoSet1.add(thing)) {
            System.out.println(thing + " is added to the set");
        }
        if (!demoSet1.add(thing)) {
            System.out.println(thing + " is already added to the set");
        }

        System.out.println("Your set contains:");
        System.out.println(demoSet1);

        //run the Lists Menu
        this.runSetMenu();
    }


    public void runSetMenu() {
        //Display Menu
        System.out.print("\n"
                + "\nWhat do you want to do now?"
                + "\nA: Add more to my set"
                + "\nR: Remove something from my set"
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
                this.setadd(); // Add
            }
            break;
            case "R": {
                this.setrem(); // Remove
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
                this.runSetMenu();
                break;
        }
    }

    private void setadd() {
        System.out.print("Enter something to add to your set: ");
        Scanner additem = new Scanner(System.in);
        String addthing = additem.nextLine();
        demoSet1.add(addthing);
        if (demoSet1.add(addthing)) {
            System.out.println(addthing + " is added to the set");
        }
        if (!demoSet1.add(addthing)) {
            System.out.println(addthing + " is already added to the set");}

        System.out.println("Your set contains:");
        System.out.println(demoSet1);
                this.runSetMenu();
        }

        private void setrem () {
            System.out.print("Enter something to remove from your set: ");
            Scanner remitem = new Scanner(System.in);
            String remthing = remitem.nextLine();
            demoSet1.remove(remthing);
            if (demoSet1.remove(remthing)) {
                System.out.println(remthing + " has been removed");
            }

            System.out.println("Your set contains:");
            System.out.println(demoSet1);
            this.runSetMenu();
        }

        private void retmenu () {
            //Create Menu
            ColMenuView colMenuView = new ColMenuView();

            //Display Menu
            colMenuView.collectionMenu();
        }

        private void exit () {
            System.exit(0);
        }

    }