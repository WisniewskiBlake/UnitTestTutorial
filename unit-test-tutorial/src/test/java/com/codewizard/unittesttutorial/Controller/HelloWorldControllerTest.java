package com.codewizard.unittesttutorial.Controller;

import com.codewizard.unittesttutorial.HelloWorldController;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void helloWorld_basic() {

        RequestBuilder request = MockMvcRequestBuilders
            .get("/hello-world")
            .accept(MediaType.APPLICATION_JSON);
        mockMvc.perform(request);
        

        //calling /hello-world
        //verifying "Hello World"
    }

}