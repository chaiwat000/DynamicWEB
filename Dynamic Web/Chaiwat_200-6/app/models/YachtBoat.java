package models;

/**
 * Created by CHAIWAT on 7/21/2019.
 */
/*Sub Class*/
public class YachtBoat extends Boat {
    private int seat_amount;
    private int floors_amount;
    private String type;
    private double weight;
    private int easinesslevel;
    private double speed_boat;


    public YachtBoat() {
    }

    public YachtBoat(String name, String year, String id, String contry, double price, int seat_amount, int floors_amount, String type, double weight, int easinesslevel, double speed_boat) {
        super(name, year, id, contry, price);
        this.seat_amount = seat_amount;
        this.floors_amount = floors_amount;
        this.type = type;
        this.weight = weight;
        this.easinesslevel = easinesslevel;
        this.speed_boat = speed_boat;
    }

    public int getSeat_amount() {
        return seat_amount;
    }

    public void setSeat_amount(int seat_amount) {
        this.seat_amount = seat_amount;
    }

    public int getFloors_amount() {
        return floors_amount;
    }

    public void setFloors_amount(int floors_amount) {
        this.floors_amount = floors_amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getEasinesslevel() {
        return easinesslevel;
    }

    public void setEasinesslevel(int easinesslevel) {
        this.easinesslevel = easinesslevel;
    }

    public double getSpeed_boat() {
        return speed_boat;
    }

    public void setSpeed_boat(double speed_boat) {
        this.speed_boat = speed_boat;
    }
}
