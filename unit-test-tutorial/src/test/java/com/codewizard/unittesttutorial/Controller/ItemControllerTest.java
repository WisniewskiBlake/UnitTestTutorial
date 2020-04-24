package com.codewizard.unittesttutorial.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.regex.MatchResult;

import com.codewizard.unittesttutorial.HelloWorldController;
import com.codewizard.unittesttutorial.ItemController;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.engine.TestExecutionResult.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.StatusAssertions;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ItemController.class)
public class ItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void dummyItem_basic() throws Exception {
        //calling GET /hello-world application/json
        RequestBuilder request = MockMvcRequestBuilders.get("/dummy-item")
            .accept(MediaType.APPLICATION_JSON);
        ResultMatcher ok = MockMvcResultMatchers.status()
                                            .isOk();
        ResultMatcher content = MockMvcResultMatchers.content()
            .json("{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}");
        MvcResult result = (MvcResult) mockMvc.perform(request)
            .andExpect(ok)
            .andExpect(content)
            .andReturn();
        
        
        //verifying "Hello World"
        // assertEquals("Hello World", result.getResponse().getContentAsString());
    }

}