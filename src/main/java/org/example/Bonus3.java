package org.example;

import java.util.Scanner;

public class Bonus3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("wie viele zahlen");
        int x = sc.nextInt();
        int[] zahl1 = new int[x];


        for (int i = 0; i < x; i++) {
            System.out.println("Zahlen befüllen");
            int y = sc.nextInt();
            zahl1[i] += y;
        }


        System.out.println("wie viele zahlen");
        int z = sc.nextInt();
        int[] zahl2 = new int[z];
        int meow = 1;


        for (int i = 0; i < x; i++) {
            System.out.println("Zahlen befüllen");
            int y = sc.nextInt();
            zahl2[i] += y;
        }

        for (int i = 0; i < x; i++) {
            meow = 1;
            if (i + i < zahl2.length) {

                for (int h = 0; h < i + 1; h++) {

                    meow *= zahl2[i + h];

                }
                sum = zahl1[i] * meow;
                System.out.println(sum);
            }


        }
    }

}
