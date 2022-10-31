package org.example;

import java.util.Random;

public class ClearAir {

    private int dustMeter; // параметр загрязнения воздуха
    private int moistureMeter; // параметр влажности воздуха
    private Location userLocation; // локация пользователя для которого высчитываются параметры

    public int getDustMeter() {
        return dustMeter;
    }

    public void setDustMeter(int dustMeter) {
        this.dustMeter = dustMeter;
    }

    public int getMoistureMeter() {
        return moistureMeter;
    }

    public void setMoistureMeter(int moistureMeter) {
        this.moistureMeter = moistureMeter;
    }

    public Location getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(Location userLocation) {
        this.userLocation = userLocation;
    }

    public void printAllMeters(){
        parseData(userLocation);
        System.out.println("dust: " + dustMeter + "% " + "moisture: " + moistureMeter + "% on " + userLocation);
    }

    private void parseData(Location location){//in developing
        Random rand = new Random();
        setDustMeter(rand.nextInt(100));
        setMoistureMeter(rand.nextInt(100));
    }
}
