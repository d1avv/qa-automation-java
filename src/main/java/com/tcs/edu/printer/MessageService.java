package com.tcs.edu.printer;

import com.tcs.edu.decorator.Severity;
import com.tcs.edu.decorator.SeverityDecorator;
import com.tcs.edu.decorator.TimestampMessageDecorator;

public class MessageService {
    /**
     * API
     */
    public static void processMessage (Severity level, String message) {
        final String prefixDecoratedMessage = TimestampMessageDecorator.decorate(message);
        final String severity = SeverityDecorator.mapToString(level);

        ConsolePrinter.print(severity + " " + prefixDecoratedMessage);
    }
}
