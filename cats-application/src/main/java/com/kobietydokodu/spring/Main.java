package com.kobietydokodu.spring;

import java.text.ParseException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        CatDAO cats = new CatDAO();
        boolean exit = false;

        do {
            char nextAction = Interface.menu();
            switch (nextAction) {
                case '1':
                    System.out.println("--Adding new cat--");
                    Cat toAdd = new Cat();

                    toAdd.setName(Interface.readName());
                    toAdd.setOwner(Interface.readOwner());

                    Date birth = null;
                    do {
                        try {
                            birth = Interface.readDate();
                        } catch (WrongInputDataFormatException e) {
                            System.out.println(e.getMessage());
                            if (e.getCause() != null) {
                                System.out.println(" Orginal exception: " + e.getCause().getMessage());
                            }
                        }
                    } while (birth == null);
                    toAdd.setBirthDate(birth);

                    Float weight = null;

                    do {
                        try {
                            weight = Interface.readWeight();
                        } catch (WrongInputDataFormatException e) {
                            e.printStackTrace();
                        }
                    } while(weight == null);
                    toAdd.setWeight(weight);

                    cats.addCat(toAdd);
                    break;

                case '2':
                    Interface.displayCatsDetails(cats);
                    break;

                case 'x':
                    System.out.println("exit");
                    exit = true;
                    break;

                default:
                    System.out.println("Unsupported operation, type: 1,2 or x");
                    break;
            }

        } while (!exit);
    }
}
