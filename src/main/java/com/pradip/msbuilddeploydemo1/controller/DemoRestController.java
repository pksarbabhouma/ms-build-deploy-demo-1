package com.pradip.msbuilddeploydemo1.controller;

import com.pradip.msbuilddeploydemo1.entities.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    @GetMapping ("/hello")
    public Person greet(@RequestParam(required = false, defaultValue = "FIRST-NAME") String firstName, @RequestParam(required = false, defaultValue = "LAST-NAME") String lastName) {
        return new Person(firstName, lastName);
    }
}
