package com.kobietydokodu.spring;

public class WrongInputDataFormatException extends Exception{

    public WrongInputDataFormatException(String reason, String statement) {
        super(reason + ": " + statement);
    }

    public WrongInputDataFormatException(String reason, String statement, Throwable cause) {
        super(reason + ": " + statement, cause);
    }
}
