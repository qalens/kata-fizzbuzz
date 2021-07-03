package com.qalens.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumberConverterTest {
    @ParameterizedTest
    @CsvSource({"1,1", "48,48", "98,98"})
    public void shouldConvertNumberToStringWithoutFizzOrBuzz(int number,String toString){
        final NumberConverter converter = new NumberConverter(number);
        Assertions.assertEquals(converter.toString(),toString);
    }
}
