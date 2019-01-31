package byui.cit360.familiarity.view;


/**
 * Created by Kristin Newill (aingealfire) on 1/29/2019.
 */
public class MvcMenuView {


    public void printContact(String firstName, String lastName, String addressLine1, String addressLine2, String city, String state, String zip String tele){
        System.out.println("Contact: ");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Address: " + addressLine1 + "\n"
                                        + addressLine2 + "\n"
                                        + city + ", " + state + " " + zip);
        System.out.println("Phone: " + tele);

    }

}
