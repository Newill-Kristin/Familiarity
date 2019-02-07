package byui.cit360.familiarity.Hibernate;

import javax.persistence.*;
import java.util.Objects;


/**
 * Created by Kristin Newill (aingealfire) on 2/5/2019.
 */
@Entity
@Table(name = "contact", schema = "cit360familiarity", catalog = "")
@IdClass(ContactEntityPK.class)

public class ContactEntity {

    private int id;
    private String firstName;
    private String lastName;
    private String add1;
    private String add2;
    private String city;
    private String state;
    private String zip;
    private String tele;

    @Id
    @Column(name = "id", nullable = false, length = 11)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    @Column(name = "firstName", nullable = false, length = 30)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Id
    @Column(name = "lastName", nullable = false, length = 30)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Id
    @Column(name = "add1", nullable = false, length = 45)
    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    @Id
    @Column(name = "add2", nullable = true, length = 45)
    public String getAdd2() {
        return add2;
    }

    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    @Id
    @Column(name = "city", nullable = false, length = 45)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Id
    @Column(name = "state", nullable = false, length = 15)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Id
    @Column(name = "zip", nullable = false, length = 5)
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Id
    @Column(name = "tele", nullable = false, length = 20)
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
        ContactEntity that = (ContactEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(add1, that.add1) &&
                Objects.equals(add2, that.add2) &&
                Objects.equals(city, that.city) &&
                Objects.equals(state, that.state) &&
                Objects.equals(zip, that.zip) &&
                Objects.equals(tele, that.tele);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, add1, add2, city, state, zip, tele);
    }
}
