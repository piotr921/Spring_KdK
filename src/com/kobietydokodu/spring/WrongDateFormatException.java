package com.kobietydokodu.spring;

public class WrongDateFormatException extends Exception{

    public WrongDateFormatException(String reason, String statement) {
        super(reason + ": " + statement);
    }

    public WrongDateFormatException(String reason, String statement, Throwable cause) {
        super(reason + ": " + statement, cause);
    }
}
