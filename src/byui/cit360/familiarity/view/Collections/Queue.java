package byui.cit360.familiarity.view.Collections;

import byui.cit360.familiarity.view.ColMenuView;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 1/16/2019.
 */
public class Queue {

    private static Scanner input = new Scanner(System.in);
    Deque demoQueue1 = new LinkedList();

    public void queueCol() {


        System.out.println("Lets make a double ended queue! ");
        System.out.print("Enter the first thing to add to your double ended queue: ");
        Scanner input = new Scanner(System.in);
        String thing = input.nextLine();
        demoQueue1.add(thing);

        int num = demoQueue1.size();
        System.out.println("You have " + num + " items in your deque. \n");
        System.out.println("Your deque contains:");
        demoQueue1.forEach(l -> System.out.println(l));
        //run the Queues Menu
        this.runQueueMenu();
    }

    public void runQueueMenu() {
        //Display Menu
        System.out.print("\n"
                + "\nWhat do you want to do now?"
                + "\nA: Add more to my deque"
                + "\nR: Remove something from my deque"
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
                this.listadd(); // Add
            }
            break;
            case "R": {
                this.listrem(); // Remove
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
                this.runQueueMenu();
                break;
        }
    }


    private void listadd() {
        System.out.println("Do you want to add to the front or end of your deque?");
        System.out.print("Enter F for front or E for end:");
        String addfrbk = input.nextLine();
        addfrbk = addfrbk.toUpperCase();

        // Case switch for choice
        switch (addfrbk) {
            case "F": {
                System.out.print("Enter what you want to add:");
                Scanner additem = new Scanner(System.in);
                String addthing = additem.nextLine();
                demoQueue1.addFirst(addthing);
            }
            break;
            case "E": {
                System.out.print("Enter what you want to add:");
                Scanner additem = new Scanner(System.in);
                String addthing = additem.nextLine();
                demoQueue1.addLast(addthing);
            }
            break;
            default:
                System.out.print("\n*** Invalid Entry *** Try Again: ");
                this.listadd();
                break;
        }

        int num = demoQueue1.size();
        System.out.println("You have " + num + " items in your deque. \n");
        System.out.println("Your deque contains:");
        demoQueue1.forEach(l -> System.out.println(l));
        this.runQueueMenu();
    }

    private void listrem() {
        System.out.println("Do you want to remove the first or last item of your deque, or a specific item?");
        System.out.print("Enter F for front, E for end, or S for specific:");
        String addfrbk = input.nextLine();
        addfrbk = addfrbk.toUpperCase();

        // Case switch for choice
        switch (addfrbk) {
            case "F": {
                demoQueue1.removeFirst();
            }
            break;
            case "E": {
                demoQueue1.removeLast();
            }
            break;
            case "S": {
                System.out.print("Enter what you want to remove:");
                Scanner remitem = new Scanner(System.in);
                String remthing = remitem.nextLine();
                demoQueue1.remove(remthing);
            }
            break;
            default:
                System.out.print("\n*** Invalid Entry *** Try Again: ");
                this.listadd();
                break;
        }

        int num = demoQueue1.size();
        System.out.println("You have " + num + " items in your deque. \n");
        System.out.println("Your deque contains:");
        demoQueue1.forEach(l -> System.out.println(l));
        this.runQueueMenu();
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