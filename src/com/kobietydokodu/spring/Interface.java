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

    public static Date readDate() throws WrongInputDataFormatException, ParseException {
        Date date = null;
        String stringDate;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");

        System.out.print("Write birth date: ");
        stringDate = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\d{4}(\\.\\d{2}){2}");
        Matcher matcher = pattern.matcher(stringDate);
        if (matcher.matches()) {
            date = simpleDateFormat.parse(stringDate);
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
}
