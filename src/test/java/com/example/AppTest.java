package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @ParameterizedTest
    @CsvSource({
            "2, 3, 5"
    })
    void add_shouldCalculateCorrectly(int a, int b, int expected) {
        assertEquals(expected, App.add(a, b));
    }
}
