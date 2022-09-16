package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Moje zmena");
        System.out.println("zadejte pocet kol: ");
        int pocetopak = sc.nextInt();

        scitani(0, 1, pocetopak);

    }

    static void scitani(int a, int b, int rounds) {

        if (rounds == 0) return;
        if (a == 0) System.out.print(a + " " + b);
        int c = a + b;
        System.out.print(" " + c);
        a = b;
        b = c;
        rounds = rounds - 1;
        scitani(a, b, rounds);

    }
}
