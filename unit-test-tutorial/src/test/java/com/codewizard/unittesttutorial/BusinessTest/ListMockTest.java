package com.codewizard.unittesttutorial.BusinessTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListMockTest {

    @Test
    public void test() {
        List mock = Mockito.mock(List.class);
        when(mock.size()).thenReturn(5);
        assertEquals(5, mock.size());
    }

}