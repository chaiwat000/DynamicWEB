package controllers;

import models.Boats;
import play.*;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result Boat(){
        Boats boats;
        boats = new Boats();
        boats.setId("B001"); //super class
        boats.setName("Titanic");
        boats.setPrice(1800000.00);
        boats.setCountry("New York");

        boats.setType("Yanch Boat"); //sub class
        boats.setYear("1912");
        boats.setSeat(3200);
        boats.setSpeed(230.5);

        return ok(showBoats.render(boats));
    }

    public static Result ListBoat(){
        //Boats(String id, String name, Double price, String country, String type, String year, Integer seat, Double speed)
        List<Boats> boatss = new ArrayList<Boats>();
        boatss.add(new Boats("B001","Lambo",18000000.00,"London","Yancht Boat","1900",6000,230.5));
        boatss.add(new Boats("B001","Lambo",18000000.00,"London","Yancht Boat","1900",6000,230.5));
        boatss.add(new Boats("B001","Lambo",18000000.00,"London","Yancht Boat","1900",6000,230.5));
        boatss.add(new Boats("B001","Lambo",18000000.00,"London","Yancht Boat","1900",6000,230.5));
        boatss.add(new Boats("B001","Lambo",18000000.00,"London","Yancht Boat","1900",6000,230.5));

        return ok(showListBoat.render(boatss));
    }
}
