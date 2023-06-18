package io.codelex.java.advanced.test.Exercise3;

public class Joiner <T> {

    private String separator;

    @SafeVarargs
    public final String join(T... args) {
            if (args.length == 0) {
                return "No values added. Exiting the program.";
            }
            StringBuilder string = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                string.append(args[i].toString());
                if (i < args.length - 1) {
                    string.append(separator);
                }
            }
            return string.toString();
        }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public String getSeparator() {
        return separator;
    }
}
