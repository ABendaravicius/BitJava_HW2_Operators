package com.arnas.hw2;

public class Operators {
    public static void main(String[] args) {
        // Veiksmo ( 5 / 2 ) liekana
        int liekana = 5 % 2;
        System.out.println(liekana);

        System.out.println("---");

        // Dalyba iš nulio
        // double dalybaIsNulio = 2 / 0;
        System.out.println("Dalinant iš nulio gaunama Arithmetic Exception klaida.");

        System.out.println("---");

        int x = 10;
        int y = 5;
        System.out.println(x == 10 && y <= 5); // kas bus išspausdinta? - True
        System.out.println(x <= y && y > 5); // kas bus išspausdinta? - False
        System.out.println("abc" instanceof String); // kas bus išspausdinta? - True

        System.out.println("3/3 spėjimai buvo teisingi prieš paleidžiant programą.");
    }
}