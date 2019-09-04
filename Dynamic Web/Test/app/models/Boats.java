package models;

/**
 * Created by CHAIWAT on 8/13/2019.
 */
public class Boats extends Boat {
    private String type;
    private String year;
    private Integer seat;
    private Double speed;

    public Boats() {

    }

    public Boats(String id, String name, Double price, String country, String type, String year, Integer seat, Double speed) {
        super(id, name, price, country);
        this.type = type;
        this.year = year;
        this.seat = seat;
        this.speed = speed;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

}
