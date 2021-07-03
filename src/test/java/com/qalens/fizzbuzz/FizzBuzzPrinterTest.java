package com.qalens.fizzbuzz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.*;

public class FizzBuzzPrinterTest {
    final ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream originalResultStream;

    @BeforeEach
    public void setDesiredMocks(){
        originalResultStream=System.out;
        System.setOut(new PrintStream(baos));
    }
    @Test
    public void shouldPrintFizzBuzz() throws IOException {
        String[] args = null;
        FizzBuzzPrinter.main(args);
        final InputStream result=this.getClass().getResourceAsStream("expected.txt");
        Assertions.assertEquals(new String(result.readAllBytes()),new String(baos.toByteArray()));
    }
    @AfterEach
    public void resetMocks(){
        System.setOut(originalResultStream);
    }
}
