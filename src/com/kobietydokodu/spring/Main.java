package com.kobietydokodu.spring;

import java.text.ParseException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Cat kot = new Cat();
        Date birth = null;
        Float weight;

        kot.setName(Interface.readName());
        kot.setOwner(Interface.readOwner());

        do {
            try {
                birth = Interface.readDate();
            } catch (WrongInputDataFormatException e) {
                System.out.println(e.getMessage());
                if (e.getCause() != null) {
                    System.out.println(" Orginal exception: " + e.getCause().getMessage());
                }
            } catch (ParseException e1){
                e1.getCause().getMessage();
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
