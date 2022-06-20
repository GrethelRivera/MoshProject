package com.rivera.day2;

public class Car {
    private String company;
    private int speed;

    public Car (String company, int speed) {     //constructor
        this.company = company;
        this.speed = speed;
    }

    public String getCompany () {   //getter
        return company;

    }

    public int getSpeed() {    //getter
        return speed;
    }

}