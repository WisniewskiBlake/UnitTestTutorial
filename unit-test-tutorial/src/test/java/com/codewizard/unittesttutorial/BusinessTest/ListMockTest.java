package com.codewizard.unittesttutorial.BusinessTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListMockTest {

    List<String> mock = Mockito.mock(List.class);

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
        when(mock.get(0)).thenReturn("Code Wizard");
        assertEquals("Code Wizard", mock.get(0));
        assertEquals(null, mock.get(1));         
    }

    //anything that is an integer will return code wizard
    @Test
    public void returnWithGenericParams() {        
        when(mock.get(anyInt())).thenReturn("Code Wizard");
        assertEquals("Code Wizard", mock.get(0));
        assertEquals("Code Wizard", mock.get(1));         
    }

    //we want to get a value and verify the value is obtained using mock.get
    @Test
    public void usingVerification() {        
        String value1 = mock.get(0);
        String value2 = mock.get(1);

        verify(mock).get(0);
        verify(mock).get(anyInt());
        //verify .get() is called once
        verify(mock, times(1)).get(anyInt());         
    }

}