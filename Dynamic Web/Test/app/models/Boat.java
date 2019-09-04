package models;

/**
 * Created by CHAIWAT on 8/13/2019.
 */
public class Boat {
    private String id;
    private String name;
    private Double price;
    private String country;

    public Boat(String id, String name, Double price, String country) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.country = country;
    }

    public Boat() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
