package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {

    private String name;
    private String email;
    private Date birthdate;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    List <Order> orders = new ArrayList<>();

    public Client () {
    }

    public Client(String name, String email, Date birthdate) {
        this.name = name;
        this.email = email;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public List<Order> getOrders() {
        return orders;
    }
    public String toString () {
        return name +
                " (" + sdf.format(birthdate) +
                ") - " +
                email;
    }
}
