package byui.cit360.familiarity.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "contact", schema = "cit360familiarity")


/*
 * Created by Kristin Newill (aingealfire) on 2/8/2019.
 */


public class Contact {
    private String firstName;
    private String lastName;
    private String add1;
    private String add2;
    private String city;
    private String state;
    private String zip;
    private String tele;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    public String getAdd2() {
        return add2;
    }

    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(firstName, contact.firstName) &&
                Objects.equals(lastName, contact.lastName) &&
                Objects.equals(add1, contact.add1) &&
                Objects.equals(add2, contact.add2) &&
                Objects.equals(city, contact.city) &&
                Objects.equals(state, contact.state) &&
                Objects.equals(zip, contact.zip) &&
                Objects.equals(tele, contact.tele);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, add1, add2, city, state, zip, tele);
    }

    private int id;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
