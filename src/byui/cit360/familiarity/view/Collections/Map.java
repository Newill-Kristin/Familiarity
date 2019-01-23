package byui.cit360.familiarity.view.Collections;

import byui.cit360.familiarity.view.ColMenuView;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 1/16/2019.
 */
public class Map {

    private static Scanner input = new Scanner(System.in);
    HashMap<String, String> demoMap1 = new HashMap<>();

    public void mapCol() {


        System.out.println("Lets make a map! ");
        System.out.print("For the first thing to add to your map");
        System.out.print("Enter a key for what you want to add: ");
        Scanner input1 = new Scanner(System.in);
        String key = input1.nextLine();
        if (demoMap1.containsKey(key)) {
            System.out.println(key + " was already used");
            this.mapCol();
        }
        System.out.print("Enter what you want to add: ");
        Scanner input2 = new Scanner(System.in);
        String thing = input2.nextLine();
        demoMap1.put(key, thing);

        int num = demoMap1.size();
        System.out.println("You have " + num + " items in your map. \n");
        System.out.println("Your map contains:");
        for (String keys : demoMap1.keySet()) {
            System.out.println("Key: " + keys + " Value: " + demoMap1.get(keys));
        }
        //run the Map Menu
        this.runMapMenu();
    }

    public void runMapMenu() {
        //Display Menu
        System.out.print("\n"
                + "\nWhat do you want to do now?"
                + "\nA: Add more to my map"
                + "\nM: Modify something on my map"
                + "\nR: Remove something from my map"
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
                this.mapadd(); // Add
            }
            break;
            case "M": {
                this.mapmod(); // Modify
            }
            break;
            case "R": {
                this.maprem(); // Remove
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
                this.runMapMenu();
                break;
        }
    }


    private void mapadd() {
        System.out.print("For the next thing to add to your map");
        System.out.print("Enter a key for what you want to add: ");
        Scanner addmap1 = new Scanner(System.in);
        String key = addmap1.nextLine();
        if (demoMap1.containsKey(key)) {
            System.out.println(key + " was already used");
            this.mapCol();
        }
        System.out.print("Enter what you want to add: ");
        Scanner addmap2 = new Scanner(System.in);
        String thing = addmap2.nextLine();
        demoMap1.put(key, thing);

        int num = demoMap1.size();
        System.out.println("You have " + num + " items in your map. \n");
        System.out.println("Your map contains:");
        for (String keys : demoMap1.keySet()) {
            System.out.println("Key: " + keys + " Value: " + demoMap1.get(keys));
        }
        this.runMapMenu();
    }

    private void mapmod() {
        System.out.print("Enter the key of what you to modify from your map: ");
        Scanner moditem = new Scanner(System.in);
        String modnum = moditem.nextLine();
        System.out.print("Enter what you want the new value to be: ");
        Scanner moditem2 = new Scanner(System.in);
        String newthing = moditem2.nextLine();
        demoMap1.replace(modnum, newthing);

        int num = demoMap1.size();
        System.out.println("You have " + num + " items in your map. \n");
        System.out.println("Your map contains:");
        for (String keys : demoMap1.keySet()) {
            System.out.println("Key: " + keys + " Value: " + demoMap1.get(keys));
        }
        this.runMapMenu();
    }

    private void maprem() {
        System.out.print("Enter they key for the item you want to remove from your map: ");
        Scanner remitem = new Scanner(System.in);
        String remthing = remitem.nextLine();
        demoMap1.remove(remthing);

        int num = demoMap1.size();
        System.out.println("You have " + num + " items in your map. \n");
        System.out.println("Your map contains:");
        for (String keys : demoMap1.keySet()) {
            System.out.println("Key: " + keys + " Value: " + demoMap1.get(keys));
        }
        this.runMapMenu();
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
