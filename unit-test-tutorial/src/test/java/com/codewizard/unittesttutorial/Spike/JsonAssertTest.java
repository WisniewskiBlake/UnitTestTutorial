package com.codewizard.unittesttutorial.Spike;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {

    String actualResponse = "{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}";

    @Test
    public void jsonAssert() throws JSONException {
        String expectedResponse = "{\"id\":1,\"name\":\"Ball\"}";
        JSONAssert.assertEquals(expectedResponse, actualResponse, true);
    }

}