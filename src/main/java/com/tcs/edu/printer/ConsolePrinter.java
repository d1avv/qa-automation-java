package com.tcs.edu.printer;

import static com.tcs.edu.decorator.TimestampMessageDecorator.*;

/**
 * Class provides methods for printing input messages
 * @author d.avilov
 */
public class ConsolePrinter {
    /**
     * This Method is used to print input messages into console
     * @param message a string that will be print
     */
    public static void print(String message){
        System.out.println(message);
    }

    /**
     * This Method is used to print input messages into console with current TimeStamp
     * @param message a string that will be print
     */
    public static void printWithDecoration(String message) {
        print(messagecount + " " + decorate(message));
    }
}