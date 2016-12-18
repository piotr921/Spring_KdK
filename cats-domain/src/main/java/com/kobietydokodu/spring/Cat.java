package com.kobietydokodu.spring;

import java.util.Date;

public class Cat {

    private String name;
    private String owner;
    private Date birthDate;
    private float weight;

    public Cat() {
    }

    public Cat(String name, String owner, Date birthDate, float weight) {
        this.name = name;
        this.owner = owner;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String introduceYourself() {
        return "Name = " + name + ", bitrh date = " + birthDate +
                ", weight = " + weight + ", owner = " + owner;
    }
}
