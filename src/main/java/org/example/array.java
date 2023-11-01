package org.example;
import java.util.Arrays;
public class array {
    public static void main(String[]args){
        int[] names = new int [10];
        names[0] = 1;
        names[1] = 2;
        names[2] = 3;
        names[3] = 4;
        names[4] = 4;
        names[5] = 4;
        names[6] = 8;
        names[7] = 4;
        names[8] = 4;
        names[9] = 4;
        int[] meow = new int [10];
        meow[0] = 1;
        meow[1] = 2;
        meow[2] = 3;
        meow[3] = 4;
        meow[4] = 4;
        meow[5] = 4;
        meow[6] = 8;
        meow[7] = 4;
        meow[8] = 4;
        meow[9] = 4;
        int sum = 0;
        Arrays.sort(names);
        System.out.println(names[9]);
        for (int i = 0; i < names.length; i++){
            sum += names[i] + meow [i];
            System.out.println(sum);
            System.out.println("Array " + i + ":" + names[i]);
        }
    }}
