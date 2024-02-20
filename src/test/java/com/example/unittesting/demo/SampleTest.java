package com.example.unittesting.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void sumTestCase() {

        Sample sample = new Sample();

        assertEquals(5, sample.sumService(2, 3));
    }

    @Test
    void multiplyTestCase(){

        Sample sample = new Sample();

        assertEquals(2, sample.multiplyService(2, 1));
    }

}