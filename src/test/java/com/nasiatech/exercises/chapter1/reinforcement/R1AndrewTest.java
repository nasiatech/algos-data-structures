package com.nasiatech.exercises.chapter1.reinforcement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R1AndrewTest {
    @Test
    public void testAdd(){
        R1Andrew testadd = new R1Andrew();
        assertEquals(5, testadd.addNumber(2,3));
    }
    @Test
    public void testAllBase(){
        R1Andrew testAll = new R1Andrew();
        testAll.inputAllBase();
    }

}