package org.example._2023_11_6.mockEx;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MockNOTcallMethods {

    @Mock
    List<String> list = new ArrayList<>();


    @Test
    public void mockTest() {
        String s = "Mock";

        list.add(s);

        Mockito.verify(list).add(s); //check method call
        Assertions.assertEquals(0, list.size());
    }
}
