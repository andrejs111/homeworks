package io.codelex.typesandvariables.practice;

import java.sql.SQLOutput;

public class Exercise5 {
    public static void main(String[] args) {
        String course1 = "English III";
        String course2 = "Precalculus";
        String course3 = "Music Theory";
        String course4 = "Biotechnology";
        String course5 = "Principles of Technology I";
        String course6 = "Latin II";
        String course7 = "AP US History";
        String course8 = "Business Computer Information Systems";

        String teacher1 = "Ms. Lapan";
        String teacher2 = "Mrs. Gideon";
        String teacher3 = "Mr. Davis";
        String teacher4 = "Ms. Palmer";
        String teacher5 = "Ms. Garcia";
        String teacher6 = "Mrs. Barnett";
        String teacher7 = "Ms. Johannessen";
        String teacher8 = "Mr. James";

        System.out.println("+--------------------------------------------------------------+");
        System.out.printf("| 1 | %38s | %15s |\n", course1, teacher1); // %ns format specifier - minimum width of the string, in case of absence of value, adds blanks
        System.out.printf("| 2 | %38s | %15s |\n", course2, teacher2);
        System.out.printf("| 3 | %38s | %15s |\n", course3, teacher3);
        System.out.println("________________________________________________________________");
        System.out.printf("| 4 | %38s | %15s |\n", course4, teacher4);
        System.out.printf("| 5 | %38s | %15s |\n", course5, teacher5);
        System.out.printf("| 6 | %38s | %15s |\n", course6, teacher6);
        System.out.printf("| 7 | %38s | %15s |\n", course7, teacher7);
        System.out.println("________________________________________________________________");
        System.out.printf("| 8 | %38s | %15s |\n", course8, teacher8);
        System.out.println("+--------------------------------------------------------------+");



    }
}
