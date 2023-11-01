package org.example;

public class Arrays {
    public static void main(String[]args){
    String[]names = new String [4];
    names[0] = "meow";
    names[1] = "meo";
    names[2] = "me";
    names[3] = "m";
        for (int i = 0; i < names.length; i++){
            System.out.println("Array " + i + ":" + names[i]);
        }
}}
