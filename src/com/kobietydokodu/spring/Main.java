package com.kobietydokodu.spring;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        CatDAO cats = new CatDAO();

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

        cats.addCat(kot);

        for(int i=0; i<cats.getCatList().size(); i++) {
            System.out.println(cats.getCatList().get(i).introduceYourself());
        }

        Interface.menu();
    }
}
