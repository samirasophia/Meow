package org.example;

public class ObjektAuto {
    public static void main(String[] args) {
        Cars myCar = new Cars ("Daytona", "Bmw", "blau", 293484, 80);
        myCar.starten("BMW oder so");
        Cars catCar = new Cars ("Ford", "Kuga", "blau", 456789, 120);
myCar.beschleunigen("BMW", 80);
catCar.beschleunigen("Ford", 120);

    }
}
