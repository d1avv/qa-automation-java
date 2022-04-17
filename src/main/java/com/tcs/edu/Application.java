package com.tcs.edu;

import com.tcs.edu.decorator.Severity;

import static com.tcs.edu.printer.ConsolePrinter.*;
import static com.tcs.edu.printer.MessageService.*;
import static com.tcs.edu.decorator.TimestampMessageDecorator.*;

class Application {
    public static void main(String[] args) {
        String message = "Hello world!";

        //printWithDecoration(Severity.MINOR, message);
        for (int i = 0; i < PAGE_SIZE; i++) {
            switch (i) {
                case 0: {
                    processMessage(Severity.MINOR, message);
                    break;
                }
                case 1: {
                    processMessage(Severity.REGULAR, message);
                    break;
                }
                case 2: {
                    processMessage(Severity.REGULAR, message);
                    break;
                }
                case 3: {
                    processMessage(Severity.MAJOR, message);
                    break;
                }
                case 4: {
                    processMessage(Severity.MINOR, message);
                    break;
                }
                case 5: {
                    processMessage(Severity.MAJOR, message);
                    break;
                }
            }
        }
    }
}