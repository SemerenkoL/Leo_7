package com.company;

public class Main {
    public static void main(String[] args) {
        Car car2 = new Car();
        car2.model = "Mersedes Benz";
        car2.maxSpeed = 260;
        car2.volume = 5;
        car2.weight = 415;

        Car car1 = new Car();
        car1.model = "Bugatti Veyron";
        car1.maxSpeed = 360;
        car1.volume = 5;
        car1.weight = 537;

        System.out.println(car1.equals(car2));
        if (car1.equals(car2))
        System.out.println("Bugatti Veyron скорее всего выиграет гонку");
        else
            System.out.println("Mersedes Benz скорее всего выиграет гонку");


    }

}
