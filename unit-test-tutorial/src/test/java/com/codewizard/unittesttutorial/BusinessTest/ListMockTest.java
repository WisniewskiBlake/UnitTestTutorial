package com.codewizard.unittesttutorial.BusinessTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListMockTest {

    List mock = Mockito.mock(List.class);

    @Test
    public void returnSingleVal() {        
        when(mock.size()).thenReturn(5);
        assertEquals(5, mock.size());        
    }

    @Test
    public void returnMultiVal() {        
        when(mock.size()).thenReturn(5).thenReturn(10);
        assertEquals(5, mock.size());
        assertEquals(10, mock.size());
    }

    @Test
    public void returnWithParams() {        
        when(mock.size()).thenReturn(5);
        assertEquals(5, mock.size());        
    }

}