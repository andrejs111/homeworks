package io.codelex.java.advanced.test.Exercise3;

import java.math.BigDecimal;

public class JoinerMain {
    public static void main(String[] args) {
        Joiner<Object> joinerTest = new Joiner<>();
        System.out.println(joinerTest.join(1, 2, "human", 'a', BigDecimal.valueOf(339)));
    }
}