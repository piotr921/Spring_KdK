package com.kobietydokodu.spring;

import java.text.ParseException;
import java.util.Date;

public class Cat {

    private String name;
    private String owner;
    private Date birthDate;
    private float weight;

    public Cat() {
        this.name = Interface.readName();
        this.owner = Interface.readOwner();

        Date birthDate = null;
        Float weight = null;

        do {
            try {
                birthDate = Interface.readDate();
            } catch (WrongInputDataFormatException e) {
                System.out.println(e.getMessage());
                if (e.getCause() != null) {
                    System.out.println(" Orginal exception: " + e.getCause().getMessage());
                }
            } catch (ParseException e) {
                System.out.println(e.getCause().getMessage());
            }
        } while(birthDate == null);
        this.birthDate = birthDate;

        try {
            weight = Interface.readWeight();
        } catch (WrongInputDataFormatException e) {
            System.out.println(e.getMessage());
            if (e.getCause() != null) {
                System.out.println(" Orginal exception: " + e.getCause().getMessage());
            }
        }
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
