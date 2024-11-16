package net.engineeringdigest.journalApp.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    public String healthCheck(){
        return"Ok";
    }
}
