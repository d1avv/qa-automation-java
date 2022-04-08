package com.tcs.edu;

import static com.tcs.edu.printer.ConsolePrinter.*;
import static com.tcs.edu.decorator.TimestampMessageDecorator.*;

class Application {
    public static void main(String[] args) {
        String message = "Hello world!";
        messagecount += 1;
        printWithDecoration(message);
        messagecount += 1;
        printWithDecoration(message);
        messagecount += 1;
        printWithDecoration(message);
    }
}