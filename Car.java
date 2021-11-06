package com.company;

public class Car {
    int volume;
    int maxSpeed;
    String model;
    int weight;

    public boolean equals(Car car) {
        if (this.maxSpeed > car.maxSpeed)
            return true;

        else
            return false;
    }




}


