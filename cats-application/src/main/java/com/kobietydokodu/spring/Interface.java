package com.kobietydokodu.spring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Interface {

    private static Scanner scanner = new Scanner(System.in);

    public static String readName() {
        System.out.print("Write cat name: ");
        return scanner.nextLine();
    }

    public static String readOwner() {
        System.out.print("Write owner name: ");
        return scanner.nextLine();
    }

    public static Date readDate() throws WrongInputDataFormatException {
        Date date;
        String stringDate;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");

        System.out.print("Write birth date: ");
        stringDate = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\d{4}\\.([0][1-9]|[1][0-2])\\.([0-2][1-9]|[3][0-1])");
        Matcher matcher = pattern.matcher(stringDate);
        if (matcher.matches()) {
            try {
                date = simpleDateFormat.parse(stringDate);
            } catch (ParseException e) {
                throw new WrongInputDataFormatException("Cannot parse", stringDate, e);
            }
        } else {
            throw new WrongInputDataFormatException("Wrong date format", stringDate);
        }

        return date;
    }

    public static Float readWeight() throws WrongInputDataFormatException {
        Float weight;
        String stringWeight;

        System.out.print("Write weight: ");
        stringWeight = scanner.nextLine();

        try {
            weight = Float.parseFloat(stringWeight);
        } catch (NumberFormatException e) {
            throw new WrongInputDataFormatException("Input cannot be parse to float", stringWeight, e);
        }

        return weight;
    }

    public static char menu() {
        System.out.println("\nSelect next step: \n1-Add new cat \n2-Display cat's details \nx-Close program");

        char operation = scanner.nextLine().charAt(0);

        return operation;
    }

    public static void displayCatsDetails(CatDAO catDao) {
        boolean stop = false;

        System.out.println("Cat list:\n");
        for (Cat cat : catDao.getCatList()) {
            System.out.println(catDao.getCatList().indexOf(cat) + ". " + cat.getName());
        }

        do {
            System.out.println("\nWrite cat's id:");
            Integer index = Integer.valueOf(scanner.nextLine());

            if (index < catDao.getCatList().size() && index >= 0) {
                System.out.println(catDao.getCatList().get(index).introduceYourself());
                stop = true;
            } else {
                System.out.println("Wrong index");
            }
        } while (!stop);
    }
}
