package com.tcs.edu.decorator;

import java.time.Instant;

/**
 * Class provides decorating of the message
 * @author d.avilov
 */

public class TimestampMessageDecorator {
    /**
     * This Method is used to decorate input message by adding current time stamp
     * @param message a string that will be decorated
     * @return decorated message
     */

    public static int MESSAGECOUNT = 0;

    public static String decorate(String message) {
        String decoratedMessage = Instant.now() + " " + message;
        return decoratedMessage;
    }
}
