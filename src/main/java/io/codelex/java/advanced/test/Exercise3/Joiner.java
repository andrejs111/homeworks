package io.codelex.java.advanced.test.Exercise3;

public class Joiner <T> {

    @SafeVarargs
    public final String join(T... args) {
        if (args.length == 0) {
            return "";
        }
        Class<?> firstElementType = args[0].getClass();
        for (int i = 1; i < args.length; i++) {
            if (args[i].getClass() != firstElementType) {
                throw new RuntimeException("Arguments passed are of different types.");
            }
        }
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < args.length; i++) {
            string.append(args[i].toString());
            if (i < args.length - 1) {
                String symbolToSeparate = "-";
                string.append(symbolToSeparate);
            }
        }
        return string.toString();
    }
}
