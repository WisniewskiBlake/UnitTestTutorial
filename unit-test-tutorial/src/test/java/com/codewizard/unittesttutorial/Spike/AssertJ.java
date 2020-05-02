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
public class AssertJ {

    @Autowired
    MockMvc mockMvc;



    @Test
    public void assertjTest() throws Exception {
        List<Integer> numbers = Arrays.asList(12,15,25);

        assertThat(numbers).hasSize(3);
        assertThat(numbers).contains(12, 25);
        assertThat(numbers).allMatch(x -> x > 10);
        assertThat(numbers).allMatch(x -> x < 100);

        assertThat(numbers)
                .hasSize(3)
                .contains(12, 15)
                .allMatch(x -> x > 10)
                .allMatch(x -> x < 100);

    }

}