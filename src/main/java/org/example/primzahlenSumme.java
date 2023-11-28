package org.example;
import java.util.ArrayList;
public class primzahlenSumme {
    public static void main(String[] args) {
        int n = 2;
        int x = 2000000;
        ArrayList<Integer> primzahlen = new ArrayList<>();
        while(n<x){
if(findPrimzahlen(n)){
primzahlen.add(n);

}
        n++;
        }
long endsum = listadd(primzahlen);
        System.out.println(endsum);
    }
    public static boolean findPrimzahlen (int n){
        if (n==4){
            return false;
        }
        for (int t = 2; t<n/2; t++){
            if(n%t==0){

                return false;

            }
        }

        return true;
    }
    public static long listadd (ArrayList<Integer> primzahlen){
        long sum = 0;
        for (int i = 0; i < primzahlen.size(); i++){
            sum += primzahlen.get(i);
        }
        return sum;
    }
}
