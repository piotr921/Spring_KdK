package com.kobietydokodu.spring;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Cat kot = new Cat();
        Date birth;
        Float weight;
        kot.setName(Interface.readName());
        kot.setOwner(Interface.readOwner());

        do {
            try {
                birth = Interface.readDate();
            } catch (WrongInputDataFormatException e) {
                System.out.println(e.getMessage());
                birth = null;
                if (e.getCause() != null) {
                    System.out.println(" Orginal exception: " + e.getCause().getMessage());
                }
            }
        } while(birth == null);

        kot.setBirthDate(birth);

        do {
            try {
                weight = Interface.readWeight();
            } catch (WrongInputDataFormatException e) {
                System.out.println(e.getMessage());
                weight = null;
                if (e.getCause() != null) {
                    System.out.println(" Orginal exception: " + e.getCause().getMessage());
                }
            }
        } while(weight == null);

        kot.setWeight(weight);

        System.out.println(kot.introduceYourself());
    }
}
