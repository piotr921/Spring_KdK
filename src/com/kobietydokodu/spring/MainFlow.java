package com.kobietydokodu.spring;

public class MainFlow {

    public static void main(String[] args) {

        CatDAO cats = new CatDAO();
        boolean exit = false;

        do {
            String nextAction = Interface.menu();
            switch (nextAction) {
                case "1":
                    System.out.println("Adding new cat:");
                    Cat toAdd = new Cat();
                    cats.addCat(toAdd);
                    break;

                case "2":
                    Interface.displayCatsDetails(cats);
                    break;

                case "x":
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
