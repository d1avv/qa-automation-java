package com.tcs.edu;

import static com.tcs.edu.printer.ConsolePrinter.*;
import static com.tcs.edu.decorator.TimestampMessageDecorator.*;

class Application {
    public static void main(String[] args) {
        String message = "Hello world!";

        for (int i = 0; i < PAGE_SIZE; i++) {
            messageCount ++;
            printWithDecoration(message);
        }
    }
}