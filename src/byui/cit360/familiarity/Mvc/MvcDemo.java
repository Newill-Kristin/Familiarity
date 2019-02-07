package byui.cit360.familiarity.Mvc;

import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 1/29/2019.
 */
public class MvcDemo {

    private static Scanner input = new Scanner(System.in);

    public void mvcDemo() {

        //Force Add contact
        Mvc model = MvcMenuView.enterContact();
        //model = hardSetContact();

        //Create a view : to write student details on console
        MvcMenuView view = new MvcMenuView();

        MvcDemoController controller = new MvcDemoController(model, view);
        controller.updateView();

        //update model data
        System.out.println("\n By adding the code to update the contact I can make it: \n");
        controller.setFirstName("Fred");
        controller.updateView();
    }

/*
    //Force Set Contact(s)
    private static Mvc hardSetContact() {
        Mvc contact1 = new Mvc(){};
        contact1.setFirstName("Fred");
        contact1.setLastName("Weasley");
        contact1.setAddressLine1("The Burrow");
        contact1.setAddressLine2("");
        contact1.setCity("CityName");
        contact1.setState("NoState");
        contact1.setZip("54321");
        contact1.setTele("1234567890");
        return contact1;
    }
*/





}


