package controllers;

import models.Boats;
import  models.YachtBoat;
import play.*;
import play.api.templates.Html;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {

    public static Result MyMain(Html content){ return ok(MyMain.render(content));}

    public static Result index() {
        return MyMain(Home1.render());
    }

    public static Result Portfolio(){return MyMain(MyPortfolio.render());}


    public static Result ShowBoat(){
        YachtBoat boat;
        boat = new YachtBoat();
        boat.setName("Titanic");
        boat.setId("B001");
        boat.setYear("1998");
        boat.setContry("New York");
        boat.setPrice(25000000.00);

        boat.setSeat_amount(3000);
        boat.setEasinesslevel(2);
        boat.setFloors_amount(6);
        boat.setSpeed_boat(250);
        boat.setWeight(3000);
        boat.setType("Yacht Boat");
        return MyMain(showBoat.render(boat));
    }

    public static Result ListBoat (){
        List<YachtBoat> boats = new ArrayList<YachtBoat>();
        YachtBoat boat = new YachtBoat();

        //public YachtBoat(String name, String year, String id, String contry, double price, int seat_amount, int floors_amount, String type, double weight, int easinesslevel, double speed_boat)

        boats.add(new YachtBoat("Hight Scaling","1880","B001","Taipe",200000000.00,6,9,"Yacht Boat",1500,5,250));
        boats.add(new YachtBoat("Torpido Spen","1980","B002","London",150000000.00,5,6,"Yacht Boat",2500,3,150));
        boats.add(new YachtBoat("Morvesca","1990","B003","Paris",180000000.00,7,8,"Yacht Boat",2000,2,150));
        boats.add(new YachtBoat("2PS","1999","B004","Japan",160000000.00,6,8,"Yacht Boat",2600,4,360));

        return MyMain(ShowListBoat.render(boats));
    }


    public static Result boatForm(){
        return MyMain(Boat_Form.render());
    }

    public static Result ShowBoatform(){
        DynamicForm showForm = Form.form().bindFromRequest();
        String bid,bname,byear,bcontry,btype;
        int sit_amount,floor_mount,bweight,blevel,bspeed;
        double  bprice;

        bid = showForm.get("bid");
        bname = showForm.get("bname");
        byear = showForm.get("byear");
        bcontry = showForm.get("bcontry");
        btype = showForm.get("btype");
        blevel = Integer.parseInt(showForm.get("blevel"));
        bspeed = Integer.parseInt(showForm.get("bspeed"));
        sit_amount = Integer.parseInt(showForm.get("sit_amount"));
        floor_mount = Integer.parseInt(showForm.get("floor_amount"));
        bweight = Integer.parseInt(showForm.get("bweight"));
        bprice = Double.parseDouble(showForm.get("bprice"));


        
        YachtBoat showboat = new YachtBoat();

        showboat.setName(bname);
        showboat.setId(bid);
        showboat.setYear(byear);
        showboat.setContry(bcontry);
        showboat.setPrice(bprice);

        showboat.setSeat_amount(sit_amount);
        showboat.setEasinesslevel(blevel);
        showboat.setFloors_amount(floor_mount);
        showboat.setSpeed_boat(bspeed);
        showboat.setWeight(bweight);
        showboat.setType(btype);

        return MyMain(ShowBoat_Form.render(showboat));
    }
    public static YachtBoat bbboat;
    public static Form<YachtBoat> helBoat = Form.form(YachtBoat.class);

    public static Result helper_boat(){
        return MyMain(Helper_boat.render(helBoat));
    }

    public static Result postHelper(){
        Form<YachtBoat> nhelpform = helBoat.bindFromRequest();

        if(nhelpform.hasErrors()){
            //flash("KeyError","ข้อมูลมีความผิดพลาด กรุณาตรวจสอบข้อมูล");
            return MyMain(Helper_boat.render(nhelpform));
        }else{
            bbboat = nhelpform.get();
            return  MyMain(postHelper_boat.render(bbboat));

        }
    }

    public static Form<Boats> frmBoats = Form.form(Boats.class);
    public static Result newBoats(){
        return MyMain(BoatsListDB.render(frmBoats));
    }
    public static Result createBoats(){
        Form<Boats> newfrmBoats = frmBoats.bindFromRequest();
        Boats bb = new Boats();
        if(newfrmBoats.hasErrors()){
            return MyMain(BoatsListDB.render(frmBoats));
        }else{
            bb = newfrmBoats.get();
            Boats.create(bb);
            return listBoats();
        }
    }

    public static List<Boats> boats = new ArrayList<Boats>();
    public static Result listBoats(){
        boats = Boats.all();
        return MyMain(ShowListDBBoats.render(boats));
    }

}

