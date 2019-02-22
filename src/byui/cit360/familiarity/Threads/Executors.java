package byui.cit360.familiarity.Threads;

import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 1/22/2019.
 */
public class Executors {

    private static Scanner input = new Scanner(System.in);

    public void runExecutorsMenu() throws Exception {
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
                this.runExecutorsMenu();
                break;
        }
    }

    private void demo() throws Exception {

        //Trigger New Demo
        ExecutorDemoRun aDemo = new ExecutorDemoRun();

        //Run Demo
        aDemo.main();

        this.runExecutorsMenu();

    }

    private void retmenu () throws Exception {
        //Create Menu
        ThreadMenuView threadMenuView = new ThreadMenuView();

        //Display Menu
        threadMenuView.threadMenu();
    }

    private void exit () {
        System.exit(0);
    }

}
