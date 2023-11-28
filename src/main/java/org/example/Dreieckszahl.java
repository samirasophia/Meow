package org.example;
import java.util.ArrayList;
public class Dreieckszahl {
    public static void main(String[] args) {
int x = 0;
int y = 0;
        ArrayList<Integer> Teiler = new ArrayList<>();
        dreieckszahlenFinder(x,Teiler, y);
    }

    public static void dreieckszahlenFinder(int x, ArrayList<Integer> Teiler, int y) {

        int a = 1;
        int b = 0;

        while (Teiler.size() < 8) {
Teiler.clear();
            System.out.println(x);
            y++;
            x += y;

            for (int t = 1; t <= x; t++) {
                if (x % t == 0) {
                    if (Teiler.contains(t)) {

                    } else {
                        Teiler.add(t);
                    }
    }
}}
        System.out.println(Teiler);
    }
}
//ich han kei ahnig wie dreieckszahlig funktioniere, deswege funktioniert das nid :3