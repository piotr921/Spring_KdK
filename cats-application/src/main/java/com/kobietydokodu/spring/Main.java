package com.kobietydokodu.spring;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) {

        CatDAO cats = new CatDAO();
        boolean exit = false;

        do {
            char nextAction = Interface.menu();
            switch (nextAction) {
                case '1':
                    System.out.println("Adding new cat:");
                    Cat toAdd = null;

                    try {
                        toAdd = new Cat(Interface.readName(), Interface.readOwner(),
                                Interface.readDate(), Interface.readWeight());
                    } catch (WrongInputDataFormatException e) {
                        System.out.println(e.getMessage());
                        if (e.getCause() != null) {
                            System.out.println(" Orginal exception: " + e.getCause().getMessage());
                        }
                    } catch (ParseException e) {
                        System.out.println(e.getCause().getMessage());
                    }

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
