package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrinterTest {
    @Test
    public void testPrint() {
        String testString = "Hello, world!";
        Printer<String> printer = new Printer<>(testString);

        printer.print();

        Assertions.assertEquals(testString, printer.getThingToPrint());
    }
}
