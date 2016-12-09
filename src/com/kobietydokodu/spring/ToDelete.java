package com.kobietydokodu.spring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToDelete {

    public static void main(String[] args) {

        //Pattern pattern = Pattern.compile("\\d{4}\\.\\d{2}\\.\\d{2}");
        //Pattern pattern = Pattern.compile("\\d{4}(\\.\\d{2}){2}");


        Pattern pattern = Pattern.compile("\\d{4}\\.([0][1-9]|[1][1-2])\\.([1-2][1-9]|[3][0-1])");
        Matcher matcher = pattern.matcher("2000.09.33");


        /*
        Pattern pattern = Pattern.compile("[1-2][1-9]|[3][0-1]");
        Matcher matcher = pattern.matcher("39");
        */
        System.out.println(matcher.matches());
    }
}
