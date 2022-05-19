package com.tcs.edu.printer;

import com.tcs.edu.decorator.Severity;
import com.tcs.edu.decorator.SeverityDecorator;

import static com.tcs.edu.decorator.TimestampMessageDecorator.*;

/**
 * Class provides methods for printing input messages
 *
 * @author d.avilov
 */
public class ConsolePrinter {
    /**
     * This Method is used to print input messages into console
     *
     * @param decoratedMessage a string that will be print
     */
    public static void print(String decoratedMessage) {
        System.out.println(decoratedMessage);
    }

    /**
     * This Method is used to print input messages into console with current TimeStamp
     * @param message a string that will be print
     */
//    public static void printWithDecoration(Severity severity, String message) {
//
//
//        for (int i = 0; i < PAGE_SIZE; i++) {
//            print(decorate(level, message) + " " + SeverityDecorator.mapToString(severity));
//        }
//    }

}