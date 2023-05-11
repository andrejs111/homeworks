package io.codelex.loops.practice;

public class AsciiFigure {
    public static void main(String[] args) {                  // main method that calls the drawFigure method
        drawFigure(7);
    }

    public static void drawFigure(int rows) {
        for (int i = 1; i <= rows; i++) {                 // defines the row number for nested loops to iterate through
            for (int j = 1; j <= rows - i; j++) {         // always draws rows - i amount of / so //////  in 1st row
                System.out.print("/");
            }
            for (int k = 1; k <= i * 2 - 2; k++) {        // defines the arithmetical algorithm by which asterisks are added in every row
                System.out.print('*');
            }
            for (int l = 1; l <= rows - i; l++) {         // same as the first nested loop
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
