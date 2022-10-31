package org.example;

import java.util.Random;

public class ClearAir {

    private int dustMeter;
    private int moistureMeter;
    private Location userLocation;

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


    public void printAllMeters(){// вывод всех значений счетчиков
        // вычисление значений счетчиков по местоположению пользователя
        parseData(userLocation);
        // вывод значений счетчиков на экран
        System.out.println("dust: " + dustMeter + "% " + "moisture: " + moistureMeter + "% on " + userLocation);
    }

    private void parseData(Location location){//входящие параметры: локация откуда берутся значения
        System.out.println("searching info in " + location + "...");
        Random rand = new Random();
        // установка значений параметров
        setDustMeter(rand.nextInt(100));
        setMoistureMeter(rand.nextInt(100));
    }
}
