package com.kobietydokodu.spring;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Cat kot = new Cat();
        Date birth = new Date();
        kot.setName(Interface.readName());
        kot.setOwner(Interface.readOwner());

        do {
            try {
                birth = Interface.readDate();
            } catch (WrongDateFormatException e) {
                System.out.println(e.getMessage());
                birth = null;
                if (e.getCause() != null) {
                    System.out.println(" Orginal exception: " + e.getCause().getMessage());
                }
            }
        } while(birth == null);

        kot.setBirthDate(birth);
        kot.setWeight(Interface.readWeight());

        System.out.println(kot.introduceYourself());
    }
}
