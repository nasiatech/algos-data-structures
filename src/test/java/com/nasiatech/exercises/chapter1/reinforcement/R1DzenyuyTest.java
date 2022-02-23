package com.nasiatech.exercises.chapter1.reinforcement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class R1DzenyuyTest {
    public R1Dzenyuy ob = new R1Dzenyuy();
    @Test
     public void testIsMultiple(){
         assertTrue(ob.isMultiple(6,3));
     }

     @Test
    public void testIsEven(){
        assertTrue(ob.isEven(4));
     }

     @Test void  testSum(){
        assertEquals(6,ob.SumOfNumbersLessthanN(3));
     }

}