package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by CHAIWAT on 7/21/2019.
 */
/* SuperClass */

public class Boat{

    private String id;
    private String name;
    private String year;
    private String contry;
    private double price;


    public Boat() {
    }

    public Boat(String name, String year, String id, String contry, double price) {
        this.name = name;
        this.year = year;
        this.id = id;
        this.contry = contry;
        this.price = price;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
