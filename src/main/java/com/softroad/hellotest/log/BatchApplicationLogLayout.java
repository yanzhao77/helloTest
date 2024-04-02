package com.softroad.hellotest.log;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.LayoutBase;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BatchApplicationLogLayout extends LayoutBase<ILoggingEvent> {

    @Override
    public String doLayout(ILoggingEvent event) {
        return new StringBuilder()
                .append("[")
                .append(String.format("%-5s", event.getLevel()))
                .append("]")
                .append("\t")
                .append(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS").format(LocalDateTime.now()))
                .append("\t")
                .append(getHostName())
                .append("\t")
                .append(event.getFormattedMessage())
                .append("\n")
                .toString();
    }

    private String getHostName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
        }
        return "";
    }
}
