package com.tcs.edu;

import com.tcs.edu.printer.ConsolePrinter;
import com.tcs.edu.decorator.TimestampMessageDecorator;

class Application {
    public static void main(String[] args) {
        String message = "Hello world!";
        ConsolePrinter.print(TimestampMessageDecorator.decorate(message));
    }
}