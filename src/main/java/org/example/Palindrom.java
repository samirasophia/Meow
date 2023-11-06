package org.example;

import java.util.Scanner;

public class Palindrom {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gib ein Wort ein: ");
        String rawr = sc.nextLine();

        if (Palindrom(rawr)) {
            System.out.println(rawr + " ist ein Palndrom.");
        } else {
            System.out.println(rawr + " ist kein Palindro.");
        }
    }

    public static boolean Palindrom(String wort) {
        int laenge = wort.length();
        for (int i = 0; i < laenge / 2; i++) {
            if (wort.charAt(i) != wort.charAt(laenge - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
//rawr für meh drip drip
