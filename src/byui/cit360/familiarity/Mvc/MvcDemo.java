package byui.cit360.familiarity.Mvc;

import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 1/29/2019.
 */
public class MvcDemo {

    private static Scanner input = new Scanner(System.in);

    public void mvcDemo() {

        //Force Add contact
        Mvc model = hardSetContact();

        model = enterContact();

        //Create a view : to write student details on console
        MvcMenuView view = new MvcMenuView();



        MvcDemoController controller = new MvcDemoController(model, view);
        controller.updateView();

        //update model data
        System.out.println("\n If I update the contact I can make it: \n");
        controller.setFirstName("George");
        controller.updateView();
    }


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


    //Enter Contact
    public static Mvc enterContact () {

        Scanner add = new Scanner(System.in);

        System.out.print("Please enter your First Name: ");
        String addfirst = add.nextLine();

        System.out.print("Please enter your Last Name: ");
        String addlast = add.nextLine();

        System.out.print("Please enter the first line of your address: ");
        String addadd1 = add.nextLine();

        System.out.print("Please enter a second line of your address (if any): ");
        String addadd2 = add.nextLine();

        System.out.print("Please enter your city: ");
        String addcity = add.nextLine();

        System.out.print("Please enter your state: ");
        String addstate = add.nextLine();

        System.out.print("Please enter your zipcode: ");
        String addzip = add.nextLine();

        System.out.print("Please enter your phone number: ");
        String addtele = add.nextLine();


        //Add Contact(s)
        Mvc contact = new Mvc(){};
        contact.setFirstName(addfirst);
        contact.setLastName(addlast);
        contact.setAddressLine1(addadd1);
        contact.setAddressLine2(addadd2);
        contact.setCity(addcity);
        contact.setState(addstate);
        contact.setZip(addzip);
        contact.setTele(addtele);
        return contact;


    }



}


