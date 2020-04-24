package com.codewizard.unittesttutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @GetMapping("/dummy-item")
    public String helloWorld() {
        return "Hello World";
    }    

}