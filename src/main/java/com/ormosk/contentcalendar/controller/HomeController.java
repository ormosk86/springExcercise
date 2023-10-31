package com.ormosk.contentcalendar.controller;

import com.ormosk.contentcalendar.config.ContentCalendarProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    //@Value("${cc.welcomeMessage: Default Welcome Message}")
    //private String welcomeMessage;

    private final ContentCalendarProperties properties;

    public HomeController(ContentCalendarProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/")
    public ContentCalendarProperties home(){
        return properties;
    }
}
