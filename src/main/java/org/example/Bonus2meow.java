package org.example;

import java.util.Scanner;

public class Bonus2meow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib Text");
        String blah = sc.nextLine();

        System.out.println("Gib Text");
        String bleh = sc.nextLine();
        int kauf = 0;
        int lange1 = blah.length();
        int lange2 = bleh.length();
        if (lange1 < lange2) {
            kauf = lange2;
        } else {
            kauf = lange1;
        }
        char[] meow1 = new char[lange1];
        char[] meow2 = new char[lange2];

        for (int i = 0; i < lange1; i++) {
            meow1[i] = blah.charAt(i);

        }
        for (int i = 0; i < lange2; i++) {
            meow2[i] = bleh.charAt(i);

        }

        if (ueberpruef(meow1, meow2, kauf)) {
            System.out.println("stimmt");
        } else {
            System.out.println("nein");

        }

    }

    public static boolean ueberpruef(char[] meow1, char[] meow2, int kauf) {

        for (int i = 0; i < kauf; i++) {
            if (meow1[i] != meow2[i]) {
                return false;
            }

        }
        return true;
    }
}







