package com.tcs.edu.decorator;

/**
 * class provides to string representation of the severity level. Ex: "REGULAR" -> "(!)"
 */

public class SeverityDecorator {
    public static String mapToString(Severity severity) {
        String severityString;
        switch (severity){
            case MAJOR: {
                severityString = "(!!!)";
                break;
            }
            case REGULAR: {
                severityString = "(!)";
                break;
            }
            case MINOR: {
                severityString = "()";
                break;
            }
            default:{
                severityString = null;
            }
        }
        return severityString;
    }
}
