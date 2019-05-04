package morphia;


import java.io.Serializable;
import java.util.List;

public class Person implements Serializable {

    private int id;

    private String name;

    private Address address;

    List<Article> mesArticles;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
