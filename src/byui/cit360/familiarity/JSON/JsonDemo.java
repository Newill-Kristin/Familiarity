package byui.cit360.familiarity.JSON;


import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 2/19/2019.
 */
public class JsonDemo {

    Controller controller = new Controller();
    private static Scanner input = new Scanner(System.in);

    public void jsonMenu() throws Exception {

        //Display Menu
        System.out.print("\n"
                + "\nWhat would you like to Demonstrate: "
                + "\nW: Write to JSON"
                + "\nR: Read JSON file"
                + "\nM: Return to Main Menu"
                + "\nX: Exit"
                + "\n"
                + "\nPlease choose an Option: ");

        //Get response
        String choice = input.nextLine();
        controller.dRequest(choice);
        }
}
