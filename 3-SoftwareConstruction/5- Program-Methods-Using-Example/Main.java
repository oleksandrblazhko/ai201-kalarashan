package org.example;


public class Main {
    public static void main(String[] args) {
        User user = new User();// создание объекта User
        user.setUserLocation(new Location(12,34));// присваивание полю юзера новой локации
        System.out.println(user); // вывод всей информации о юзере
        ClearAir clearAir = new ClearAir();// создание объекта ClearAir
        user.sendLocation(clearAir);// отправка локации юзера на ClearAir
        clearAir.printAllMeters();// вывод значений счетчиков
    }
}