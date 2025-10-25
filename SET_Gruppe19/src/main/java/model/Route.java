package model;

import java.sql.Date;
import java.util.ArrayList;

public class Route {

    private int id;
    private String name;
    private Date time;
    private ArrayList<BussStop> busRoute;

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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public ArrayList<BussStop> getBusRoute() {
        return busRoute;
    }

    public void setBusRoute(ArrayList<BussStop> busRoute) {
        this.busRoute = busRoute;
    }

    public Route(int id, String name, Date time, ArrayList<BussStop> busRoute) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.busRoute = busRoute;
    }

    public void calculateTotalPrice() {
        // hva gjør denne?
    }

    public void recommendedRoute() {
        // lager beste rute bassert på start og stopp
    }
}
