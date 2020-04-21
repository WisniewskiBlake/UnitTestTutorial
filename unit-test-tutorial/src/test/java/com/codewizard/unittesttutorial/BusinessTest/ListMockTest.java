package com.codewizard.unittesttutorial.BusinessTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
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
        verify(mock, times(2)).get(anyInt());
        //verify .get() is called once
        verify(mock, atLeast(1)).get(anyInt());
        verify(mock, atMost(2)).get(anyInt());
        verify(mock, never()).get(2);         
    }

    //how to capture an argument for verification test
    @Test
    public void argumentCapturing() {        
        mock.add("Some String"); 
        
        //verification
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mock).add(captor.capture());

        assertEquals("SomeString", captor.getValue());
    }

    //how to capture multiple arguments for more than 1 method call 
    @Test
    public void multipleArgumentCapturing() {        
        mock.add("Some String1");
        mock.add("Some String2"); 
        
        //verification
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mock, times(2)).add(captor.capture());

        List<String> allValues = captor.getAllValues();

        assertEquals("Some String1", allValues.get(0));
        assertEquals("Some String2", allValues.get(1));
    }

    @Test
    public void spying() {        
        ArrayList arrayListMock = Mockito.mock(ArrayList.class);
        
    }

}