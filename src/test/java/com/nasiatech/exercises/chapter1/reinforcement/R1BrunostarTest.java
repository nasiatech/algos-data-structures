package com.nasiatech.exercises.chapter1.reinforcement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R1BrunostarTest {
    R1Brunostar testBruno = new R1Brunostar();

    @Test
    public void testAdd2Nums() {
        assertEquals(3, testBruno.add2Nums(1,2));
    }

    @Test
    public void testInputAllBaseTypes() {
//        assertEquals(3, testBruno.inputAllBaseTypes());
    }

    @Test
    public void testIsMultiple() {
        assertEquals(true, testBruno.isMultiple(6,3));
        assertEquals(false, testBruno.isMultiple(5,3));
    }

    @Test
    public void testIsEven() {
        assertEquals(true, testBruno.isEven(6));
        assertEquals(true, testBruno.isEven(2));
        assertEquals(false, testBruno.isEven(5));
    }

    @Test
    public void testSum() {
        assertEquals(15, testBruno.r15sum(5));
        assertEquals(0, testBruno.r15sum(0));
        assertEquals(1, testBruno.r15sum(1));
    }

    @Test
    public void testSumOdd() {
        assertEquals(16, testBruno.r16sumOdd(7));
        assertEquals(0, testBruno.r15sum(0));
        assertEquals(1, testBruno.r15sum(1));
    }

    @Test
    public void testSumOddSq() {
        assertEquals(35, testBruno.r17sumOddSq(5));
        assertEquals(84, testBruno.r17sumOddSq(7));
        assertEquals(0, testBruno.r17sumOddSq(0));
        assertEquals(1, testBruno.r17sumOddSq(2));
    }

    @Test
    public void testCountVowels() {
        assertEquals(3, testBruno.r18countVowels("elephant"));
        assertEquals(0, testBruno.r15sum(0));
    }

}