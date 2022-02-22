package com.nasiatech.exercises.chapter1.reinforcement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R1BrunostarTest {

    @Test
    public void testAdd2Nums() {
        R1Brunostar testAdd = new R1Brunostar();
        assertEquals(3, testAdd.add2Nums(1,2));
    }
}