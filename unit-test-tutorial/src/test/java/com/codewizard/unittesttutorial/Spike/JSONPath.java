package com.codewizard.unittesttutorial.Spike;


import com.codewizard.unittesttutorial.Controller.HelloWorldController;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloWorldController.class)
public class JSONPath {

    @Autowired
    MockMvc mockMvc;



    @Test
    public void easierWithJsonPath() throws Exception {
        String responseFromServer = "[" +
                "  {id: 10001, name: \"Laptop\", quantity: 5234}," +
                "  {id: 10002, name: \"Java\", quantity: 1544}," +
                "  {id: 10003, name: \"IntelliJ\", quantity: 4645}," +
                "  {id: 10004, name: \"Unit Tests\", quantity: 5246}" +
                "]";

        DocumentContext context = JsonPath.parse(responseFromServer);
        int length = context.read("$.length()");
        assertThat(length).isEqualTo(3);

    }

}