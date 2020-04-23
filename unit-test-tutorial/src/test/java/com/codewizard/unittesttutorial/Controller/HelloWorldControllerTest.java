package com.codewizard.unittesttutorial.Controller;

import com.codewizard.unittesttutorial.HelloWorldController;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTest {

    @Test
    public void helloWorld_basic() {
        //calling /hello-world
        //verifying "Hello World"
    }

}