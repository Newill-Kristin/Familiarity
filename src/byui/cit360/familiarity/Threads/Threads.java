package byui.cit360.familiarity.Threads;

import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 1/22/2019.
 */
public class Threads {

    private static Scanner input = new Scanner(System.in);

    public void runThreadMenu() {
        //Display Menu
        System.out.print("\n"
                + "\nWhat do you want to do now?"
                + "\nD: Run the Demo"
                + "\nT: Return to the Concept Menu"
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
            case "T": {
                this.retmenu(); // Return to Thread Menu
            }
            break;
            case "X": {
                this.exit(); // Exit
            }
            break;
            default:
                System.out.print("\n*** Invalid Entry *** Try Again: ");
                this.runThreadMenu();
                break;
        }
    }

    private void demo() {

        //Trigger New Demo
        ThreadDemo aDemo = new ThreadDemo();

        //Run Demo
        aDemo.run();


        this.runThreadMenu();

    }

    private void retmenu () {
        //Create Menu
        ThreadMenuView threadMenuView = new ThreadMenuView();

        //Display Menu
        threadMenuView.threadMenu();
    }

    private void exit () {
        System.exit(0);
    }


}
