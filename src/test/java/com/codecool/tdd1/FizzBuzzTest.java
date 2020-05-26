package com.codecool.tdd1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void init() {
        fizzBuzz = new FizzBuzz();
    }


    @Test
    public void smokeTest(){
        assertTrue(true);
    }

    @Test
    public void fizzBuzzObjectIsNotNull() {
        assertNotNull(fizzBuzz);
    }

    @Test
    public void fizzBuzzReturnsWith1on1() {
        String ret = fizzBuzz.calculate(1);
        assertEquals("1", ret);
    }

    @Test
    public void fizzBuzzReturnsWith2on2() {
        String ret = fizzBuzz.calculate(2);
        assertEquals("2", ret);
    }

    @Test
    public void fizzBuzzReturnsFizzon3() {
        String ret = fizzBuzz.calculate(3);
        assertEquals("Fizz", ret);
    }

    @Test
    public void fizzBuzzReturnsFizzon9() {
        String ret = fizzBuzz.calculate(9);
        assertEquals("Fizz", ret);
    }

    @Test
    public void fizzBuzzReturnsBuzzon5() {
        String ret = fizzBuzz.calculate(5);
        assertEquals("Buzz", ret);
    }

    @Test
    public void fizzBuzzReturnsBuzzon10() {
        String ret = fizzBuzz.calculate(10);
        assertEquals("Buzz", ret);
    }

    @Test
    public void fizzBuzzReturnsFizzBuzzon15() {
        String ret = fizzBuzz.calculate(15);
        assertEquals("FizzBuzz", ret);
    }

    @Test
    public void fizzBuzzReturnsFizzBuzzon30() {
        String ret = fizzBuzz.calculate(30);
        assertEquals("FizzBuzz", ret);
    }

    // %7 -> Qooz

    @Test
    public void fizzBuzzReturnsQoozon7() {
        String ret = fizzBuzz.calculate(7);
        assertEquals("Qooz", ret);
    }

    @Test
    public void fizzBuzzReturnsFizzQoozon21() {
        String ret = fizzBuzz.calculate(21);
        assertEquals("FizzQooz", ret);
    }

    @Test
    public void fizzBuzzReturnsBuzzQoozon35() {
        String ret = fizzBuzz.calculate(35);
        assertEquals("BuzzQooz", ret);
    }
}
