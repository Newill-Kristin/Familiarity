package byui.cit360.familiarity.view.Collections;

import byui.cit360.familiarity.view.ColMenuView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 1/16/2019.
 */
public class Lists {

    private static Scanner input = new Scanner(System.in);
    List<String> demoList1 = new ArrayList<>();

    public void listCol() {


        System.out.println("Lets make a list! ");
        System.out.print("Enter the first thing to add to your list: ");
        Scanner input = new Scanner(System.in);
        String thing = input.nextLine();
        demoList1.add(thing);

        int num = demoList1.size();
        System.out.println("You have " + num + " items in your list. \n");
        System.out.println("Your list contains:");
        demoList1.forEach(l -> System.out.println(demoList1.indexOf(l) + ": " + l));
        //run the Lists Menu
        this.runListMenu();
    }

    public void runListMenu() {
        //Display Menu
        System.out.print("\n"
                + "\nWhat do you want to do now?"
                + "\nA: Add more to my list"
                + "\nM: Modify something on my list"
                + "\nR: Remove something from my list"
                + "\nS: Sort my list"
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
            case "M": {
                this.listmod(); // Modify
            }
            break;
            case "R": {
                this.listrem(); // Remove
            }
            break;
            case "S": {
                this.listsrt(); // Sort
                break;
            }
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


    private void listadd() {
        System.out.print("Enter something to add to your list: ");
        Scanner additem = new Scanner(System.in);
        String addthing = additem.nextLine();
        demoList1.add(addthing);

        int num = demoList1.size();
        System.out.println("You have " + num + " items in your list. \n");
        System.out.println("Your list contains:");
        demoList1.forEach(l -> System.out.println(demoList1.indexOf(l) + ": " + l));
        this.runListMenu();
        }

    private void listmod() {
        System.out.print("Enter the list number of what you to modify from your list: ");
        Scanner moditem = new Scanner(System.in);
        int modnum = moditem.nextInt();
        System.out.print("Enter what you want the new value to be: ");
        Scanner moditem2 = new Scanner(System.in);
        String newthing = moditem2.nextLine();
        demoList1.set(modnum, newthing);

        int num = demoList1.size();
        System.out.println("You have " + num + " items in your list. \n");
        System.out.println("Your list contains:");
        demoList1.forEach(l -> System.out.println(demoList1.indexOf(l) + ": " + l));
        this.runListMenu();
        }

    private void listrem() {
        System.out.print("Enter something to remove from your list: ");
        Scanner remitem = new Scanner(System.in);
        String remthing = remitem.nextLine();
        demoList1.remove(remthing);

        int num = demoList1.size();
        System.out.println("You have " + num + " items in your list. \n");
        System.out.println("Your list contains:");
        demoList1.forEach(l -> System.out.println(demoList1.indexOf(l) + ": " + l));
        this.runListMenu();
    }

    private void listsrt() {
        System.out.print("Sorting your list...");
        Collections.sort(demoList1);

        int num = demoList1.size();
        System.out.println("You have " + num + " items in your list. \n");
        System.out.println("Your list contains:");
        demoList1.forEach(l -> System.out.println(demoList1.indexOf(l) + ": " + l));
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