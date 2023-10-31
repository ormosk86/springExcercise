package com.ormosk.contentcalendar;

import org.springframework.stereotype.Component;

@Component
public class Message {

    String message = "Hello Faszi!";

    public String getMessage() {
        return message;
    }
}
