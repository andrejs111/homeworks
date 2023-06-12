package io.codelex.oop.summary.generics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;

public class Combiner {

    //Fix this method so it can receive two any kind of objects
    //Test the functionality
    public static void main(String[] args) {
    }
    public static <T> String combineTwoItems(T t, T b) {
        return "First item: " + t.toString() + "; Second item: " + b.toString();
    }
    @Test
    public void checkCombinerNumbers(){
        assertEquals("First item: 2; Second item: 2", combineTwoItems(2, 2));
    }
}
