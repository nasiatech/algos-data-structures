package com.nasiatech.exercises.chapter1.reinforcement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R1AndrewTest {
    R1Andrew testAll = new R1Andrew();
    @Test
    public void testAdd(){
        assertEquals(5, testAll.addNumber(2,3));
    }
    @Test
    public void testAllBase(){

        testAll.R1inputAllBase();
    }
    @Test
    public void testisMultiple(){
        assertEquals(false, testAll.R3isMultiple(0,4));

    }
    @Test
    public void testR4isEven(){
        assertTrue(testAll.R4isEven(4));
    }

}