package byui.cit360.familiarity.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "contact", schema = "cit360familiarity", catalog = "")

/*
 * Created by Kristin Newill (aingealfire) on 2/8/2019.
 */

public class ContactPK implements Serializable {
    private String firstName;
    private String lastName;
    private String add1;
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
        ContactPK contactPK = (ContactPK) o;
        return Objects.equals(firstName, contactPK.firstName) &&
                Objects.equals(lastName, contactPK.lastName) &&
                Objects.equals(add1, contactPK.add1) &&
                Objects.equals(city, contactPK.city) &&
                Objects.equals(state, contactPK.state) &&
                Objects.equals(zip, contactPK.zip) &&
                Objects.equals(tele, contactPK.tele);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, add1, city, state, zip, tele);
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
