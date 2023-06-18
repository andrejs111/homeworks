package io.codelex.java.advanced.test.Exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class JoinerTest {

    @Test
    public void testJoinerWithDifferentArgs() {
        Joiner<Integer> joinerTest = new Joiner<>();
        String result = joinerTest.join(1, 2, 3, 4);
        Assertions.assertEquals(result, "1-2-3-4");
    }

    @Test
    public void testJoinerIllegalArgumentException() {
        Joiner<Object> joinerTest = new Joiner<>();
        String result = joinerTest.join(1);
        Assertions.assertThrows(RuntimeException.class, () -> joinerTest.join(1, "human"));
    }
}
