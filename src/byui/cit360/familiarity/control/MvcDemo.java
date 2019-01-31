package byui.cit360.familiarity.control;

import byui.cit360.familiarity.model.Mvc.Mvc;

import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 1/29/2019.
 */
public class MvcDemo {

    private static Scanner input = new Scanner(System.in);

    //Enter Contact
    public void enterContact (String firstName, String lastName, String addressLine1, String addressLine2, String city, String state, String zip String tele) {

        System.out.print("Please enter your First Name: ");
            Scanner addfn = new Scanner(System.in);
            String addfirst = addfn.nextLine();
            Mvc.setFirstName(addfirst);

        System.out.print("Please enter your Last Name: ");
            Scanner addln = new Scanner(System.in);
            String addlast = addln.nextLine();
            Mvc.setLastName(addlast);

        System.out.print("Please enter the first line of your address: ");
            Scanner adda1 = new Scanner(System.in);
            String addadd1 = adda1.nextLine();
            Mvc.setAddressLine1(addadd1);

        System.out.print("Please enter a second line of your address (if any): ");
            Scanner adda2 = new Scanner(System.in);
            String addadd2 = adda2.nextLine();
            Mvc.setAddressLine2(addadd2);

        System.out.print("Please enter your city: ");
            Scanner addcit = new Scanner(System.in);
            String addcity = addcit.nextLine();
            Mvc.setCity(addcity);

        System.out.print("Please enter your state: ");
            Scanner addst = new Scanner(System.in);
            String addstate = addst.nextLine();
            Mvc.setState(addstate);

        System.out.print("Please enter your zipcode: ");
            Scanner addz = new Scanner(System.in);
            String addzip = addz.nextLine();
            Mvc.setZip(addzip);

        System.out.print("Please enter your phone number: ");
            Scanner addtel = new Scanner(System.in);
            String addtele = addtel.nextLine();
            Mvc.setTele(addtele);


    }



    //Retrieve Contact(s)
    private static Mvc retriveContact() {
        Mvc contact = new Mvc{};
        contact.getFirstName();
        contact.getLastName();
        contact.getAddressLine1();
        contact.getAddressLine2();
        contact.getCity();
        contact.getState();
        contact.getZip();
        contact.getTele();
        return contact;

    }

}

/*
    Scanner additem = new Scanner(System.in);
    String addthing = additem.nextLine();
    demoList1.add(addthing);

*/