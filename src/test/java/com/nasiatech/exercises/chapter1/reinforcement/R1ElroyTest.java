package com.nasiatech.exercises.chapter1.reinforcement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R1ElroyTest {
    private final R1Elroy elroy = new R1Elroy();

    @Test
    public void testAdd() {

        assertEquals(5, new R1Elroy().add(2,3));
    }

    @Test
    public void testR3() {
        assertTrue(elroy.r3IsMultiple(6, 3));
        assertFalse(elroy.r3IsMultiple(5, 2));

        System.out.println(elroy.r3IsMultiple(4,0));
    }

}