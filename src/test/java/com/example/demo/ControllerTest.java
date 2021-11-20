package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ControllerTest {

    @InjectMocks
    Controller controller;

    @Test
    public void getString() {
        String string = controller.getString();
        Assertions.assertEquals("string", string);
    }

}
