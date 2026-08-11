package com.vit.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void testAdd() {
        int expected = 5;
        int actual = App.add(2, 3);
        
        if (actual == expected) {
            System.out.println("TEST PASSED: App.add(2, 3) returned 5.");
        } else {
            System.err.println("Test failed: expected " + expected + " but received " + actual);
        }
        
        assertEquals(expected, actual);
    }
}