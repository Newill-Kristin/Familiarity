package byui.cit360.familiarity.http;


import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 2/21/2019.
 */
public class HttpDemo {

    HttpController httpCon = new HttpController();
    private static Scanner input = new Scanner(System.in);

    public void httpMenu() throws Exception {

        //Display Menu
        System.out.print("\n"
                + "\nWhat would you like to Demonstrate: "
                + "\nN: Names Only"
                + "\nA: Names with SAM ID"
                + "\nD: Names with choice of Detail"
                + "\nM: Return to Main Menu"
                + "\nX: Exit"
                + "\n"
                + "\nPlease choose an Option: ");

        //Get response
        String choice = input.nextLine();
        httpCon.dRequest(choice);
    }

}
