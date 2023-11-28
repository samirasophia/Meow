package org.example;

import java.util.Scanner;
public class Gerade {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("zahl 1");
        int zahl1 = sc.nextInt();
        int wuff = gerade(zahl1);
        System.out.println(wuff);
    }
    public static int gerade(int x) {
        int meow = x % 2;
        if (meow == 0) {

            return x;
        } else {
            int aaaa = x*2;
            return aaaa;

        }
    }}


