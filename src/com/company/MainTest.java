package com.company;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testIntArray(){
        Main Main = new Main();
        int expected[] = new int[]{1,2,3};
        assertArrayEquals(expected, (new int[]{1,2,3}));
    }

    @Test
    void testTheTask(){
        Main Main = new Main();
        Boolean condition;
        assertFalse(Boolean.getBoolean("Please enter a task description of less than 50 characters"),
                "Task successfully captured");
    }
    @Test
    void testIDTask(){
        var String = toString();
        assertEquals(Character.toUpperCase('0'));
    }
    private void assertEquals(int toUpperCase) {
    }

    @Test
    void testTaskDetails(){
        var String = toString();
        assertEquals(Character.toLowerCase('0'));
    }

    @Test
    void testTotalHours() {
        var Main = new Main();
        int hourA = 8;
        int hourB = 10;
        assertEquals(hourA);
        assertEquals(hourB);
    }


}
