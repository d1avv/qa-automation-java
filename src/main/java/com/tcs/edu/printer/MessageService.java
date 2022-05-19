package com.tcs.edu.printer;

import com.tcs.edu.decorator.MessageOrder;
import com.tcs.edu.decorator.Severity;
import com.tcs.edu.decorator.SeverityDecorator;
import com.tcs.edu.decorator.TimestampMessageDecorator;
import com.tcs.edu.decorator.MessageOrder;

import static com.tcs.edu.decorator.TimestampMessageDecorator.PAGE_SIZE;

public class MessageService {
    /**
     * API
     */
    public static void processMessage(Severity level, String message, String... messages) {
        if (level != null && message != null && messages != null) {
            String severity = SeverityDecorator.mapToString(level);
            ConsolePrinter.print(TimestampMessageDecorator.decorate(message) + " " + severity);
            for (String current : messages) {
                ConsolePrinter.print(TimestampMessageDecorator.decorate(current) + " " + severity);
            }
        } else {
            System.out.println("Игнорируем NPE");
        }
    }

    public static void processMessage(Severity level, MessageOrder order, String... messages) {

        String severity = SeverityDecorator.mapToString(level);
        //ConsolePrinter.print(TimestampMessageDecorator.decorate(message) + " " + severity);
        if (order == MessageOrder.DESC) {
            for (int index = messages.length - 1; index >= 0; index--) {
                //ConsolePrinter.print(severity + " " + TimestampMessageDecorator.decorate(message) + " " + index);
                int counter = index + 1;
                ConsolePrinter.print(TimestampMessageDecorator.decorate(messages[index]) + " " + counter + " " + severity);
            }
        } else {
            for (int index = 0; index < messages.length; index++) {
                //ConsolePrinter.print(severity + " " + TimestampMessageDecorator.decorate(message));
                int counter = index + 1;
                ConsolePrinter.print(TimestampMessageDecorator.decorate(messages[index]) + " " + counter + " " + severity);
            }
        }
    }
}
