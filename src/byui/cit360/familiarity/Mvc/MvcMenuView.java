package byui.cit360.familiarity.Mvc;


import byui.cit360.familiarity.view.MainMenu;

import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 1/29/2019.
 */
public class MvcMenuView {

    public void printContact(String firstName, String lastName, String addressLine1, String addressLine2, String city, String state, String zip, String tele){
        System.out.println("\n Contact: ");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Address: " + addressLine1 + "\n"
                                        + addressLine2 + "\n"
                                        + city + ", " + state + " " + zip);
        System.out.println("Phone: " + tele);

    }

    private static Scanner input = new Scanner(System.in);

    public void runMVCMenu() {
        //Display Menu
        System.out.print("\n"
                + "\nWhat do you want to do now?"
                + "\nD: Run the Demo"
                + "\nM: Return to the Main Menu"
                + "\nX: Exit"
                + "\n"
                + "\nPlease choose an Option: ");

        //Get response
        String choice = input.nextLine();
        choice = choice.toUpperCase();

        // Case switch for choice
        switch (choice) {
            case "D": {
                this.demo(); // Add
            }
            break;
            case "M": {
                this.retmm(); // Return to Main Menu
            }
            break;
            case "X": {
                this.exit(); // Exit
            }
            break;
            default:
                System.out.print("\n*** Invalid Entry *** Try Again: ");
                this.runMVCMenu();
                break;
        }
    }

    private void demo() {

        //Trigger New Demo
        MvcDemo aDemo = new MvcDemo();

        //Run Demo
        aDemo.mvcDemo();

        this.runMVCMenu();

    }

    private void retmm() {
        //System.out.println("\n*** Main Menu ***");

        MainMenu mm = new MainMenu();

        //Display Map Demo
        mm.mainMenu();
    }

    private void exit () {
        System.exit(0);
    }




}
