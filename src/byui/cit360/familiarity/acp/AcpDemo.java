package byui.cit360.familiarity.acp;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 3/6/2019.
 */
public class AcpDemo {

    private AcpController myACP = new AcpController();

    public void acpDemo() throws Exception {

        myACP.mapCommand("A", new AcpOne());
        myACP.mapCommand("B", new AcpTwo());
        myACP.mapCommand("R", new AcpRet());

        HashMap acpMap = new HashMap();

        Scanner input = new Scanner(System.in);
        System.out.println("Please Select what you would like to see: \n"
                            + "A - To see Demo choice 1 \n"
                            + "B - To see Demo choice 2 \n"
                            + "R - To Return to the Main Menu \n");

        String choice = input.next();
        choice = choice.toUpperCase();

        myACP.handleRequest(choice, acpMap);

    }


}
