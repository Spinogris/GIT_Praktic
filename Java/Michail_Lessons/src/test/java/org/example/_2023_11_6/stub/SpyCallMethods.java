package org.example._2023_11_6.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class SpyCallMethods {

    @Spy
    List<String> list = new ArrayList<>();


    @Test
    public void mockTest() {
        String s = "Mock";

        list.add(s);

        Mockito.verify(list).add(s); //check method call
        Assertions.assertEquals(1, list.size());
    }
}