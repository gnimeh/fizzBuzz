package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzTest {
    @Test
    void should_return_1_given_FizzBuzz_when_fizz_buzz_input_1() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.fizzBuzz(1);
        //then
        assertEquals(1, fizzBuzz.fizzBuzz(1));
    }
}
