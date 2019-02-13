package byui.cit360.familiarity.Hibernate;

import byui.cit360.familiarity.view.MainMenu;

import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 2/5/2019.
 */
public class HibernateMenuView {

    private static Scanner input = new Scanner(System.in);

    public void runHibMenu() {
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
                runHibMenu();
                break;
        }
    }

    private void demo() {

        //Trigger New Demo
        HibernateDemo aDemo = new HibernateDemo();

        //Run Demo
        aDemo.hibDemo();

        runHibMenu();

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
