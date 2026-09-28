package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void greetWorks() {
        assertEquals("Hello, Ravi!", App.greet("Ravi"));
    }
}