package byui.cit360.familiarity.Mvc;


/**
 * Created by Kristin Newill (aingealfire) on 1/29/2019.
 */
public class MvcDemoController {

    private Mvc model;
    private MvcMenuView view;

    public MvcDemoController (Mvc model, MvcMenuView view) {
        this.model = model;
        this.view = view;
    }

    public void setFirstName(String firstName) {
        model.setFirstName(firstName);
    }

    public String getFirstName() {
        return model.getFirstName();
    }

    public void setLastName(String lastName) {
        model.setLastName(lastName);
    }

    public String getLastName() {
        return model.getLastName();
    }

    public void setAddressLine1(String addressLine1) {
        model.setAddressLine1(addressLine1);
    }

    public String getAddressLine1() {
        return model.getAddressLine1();
    }

    public void setAddressLine2(String addressLine2) {
        model.setAddressLine2(addressLine2);
    }

    public String getAddressLine2() {
        return model.getAddressLine2();
    }

    public void setCity(String city) {
        model.setCity(city);
    }

    public String getCity() {
        return model.getCity();
    }

    public void setState(String state) {
        model.setState(state);
    }

    public String getState() {
        return model.getState();
    }

    public void setZip(String zip) {
        model.setZip(zip);
    }

    public String getZip() {
        return model.getZip();
    }

    public void setTele(String tele) {
        model.setTele(tele);
    }

    public String getTele() {
        return model.getTele();
    }

    public void updateView(){
        view.printContact(model.getFirstName(), model.getLastName(), model.getAddressLine1(), model.getAddressLine2(), model.getCity(), model.getState(), model.getZip(), model.getTele());
    }


}
