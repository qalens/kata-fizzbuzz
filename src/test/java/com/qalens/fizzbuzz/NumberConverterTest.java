package com.qalens.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumberConverterTest {
    @ParameterizedTest
    @CsvSource({"1,1", "47,47", "98,98"})
    public void shouldConvertNumberToStringWithoutFizzOrBuzz(int number,String toString){
        final NumberConverter converter = new NumberConverter(number);
        Assertions.assertEquals(toString,converter.toString());
    }
    @ParameterizedTest
    @CsvSource({"3,Fizz", "99,Fizz"})
    public void shouldConvertNumberToFizzWhenDivisibleBy3(int number,String toString){
        final NumberConverter converter = new NumberConverter(number);
        Assertions.assertEquals(toString,converter.toString());
    }
    @ParameterizedTest
    @CsvSource({"5,Buzz", "100,Buzz"})
    public void shouldConvertNumberToBuzzWhenDivisibleBy5(int number,String toString){
        final NumberConverter converter = new NumberConverter(number);
        Assertions.assertEquals(toString,converter.toString());
    }
}
