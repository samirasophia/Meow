package org.example;
import java.util.Scanner;
public class Bonus {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib Text");
        String text = sc.nextLine();
        int länge = text.length();
        for (int i = 0; i < länge; i++) {
            System.out.println(text.charAt(i));
            }
    }
}
