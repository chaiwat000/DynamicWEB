package models;

import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by CHAIWAT on 9/4/2019.
 */
@Entity
@Table(name="tbBoats")
public class Boats extends Model {
    @Id
    @Column(length = 10)
    private String id;
    private String name;
    private String year;
    private String country;
    private double price;

    public Boats() {
    }

    public Boats(String id, String name, String year, String country, double price) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.country = country;
        this.price = price;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Database

    public static Finder<String,Boats> finder = new Finder(String.class,Boats.class);
    public static List<Boats> all(){
        return finder.all();
    }

    public static void create(Boats boats){
        boats.save();
    }


}
