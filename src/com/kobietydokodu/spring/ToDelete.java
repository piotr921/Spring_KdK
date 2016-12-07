package com.kobietydokodu.spring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToDelete {

    public static void main(String[] args) {

        //Pattern pattern = Pattern.compile("\\d{4}\\.\\d{2}\\.\\d{2}");
        Pattern pattern = Pattern.compile("\\d{4}(\\.\\d{2}){2}");
        Matcher matcher = pattern.matcher("50");
        System.out.println(matcher.matches());
    }
}
