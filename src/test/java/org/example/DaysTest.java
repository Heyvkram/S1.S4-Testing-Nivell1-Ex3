package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DaysTest {

    @Test
    void getDayTest() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            Days.getDay(100);
        });
    }
}