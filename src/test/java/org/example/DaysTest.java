package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DaysTest {

    @Test
    void getDayTest() {
        int number = 0;
        try {
            Days.getDay(100);
            number = 0;
        }catch (ArrayIndexOutOfBoundsException e){
            number = 1;
        }
        assertEquals(1, number);
     }
}