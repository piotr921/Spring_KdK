package com.kobietydokodu.spring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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

    public static Date readDate() throws WrongDateFormatException {
        Date date;
        String stringDate;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");

        System.out.print("Write birth date: ");
        stringDate = scanner.nextLine();

        try {
            date = simpleDateFormat.parse(stringDate);
        } catch (ParseException e) {
            throw new WrongDateFormatException("Wrong date format", stringDate, e);
        }

        return date;
    }

    public static Float readWeight() {
        Float weight = null;
        String stringWeight;

        do {
            System.out.print("Write weight: ");
            stringWeight = scanner.nextLine();

            try {
                weight = Float.parseFloat(stringWeight);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

        } while (weight == null);

        return weight;
    }
}
