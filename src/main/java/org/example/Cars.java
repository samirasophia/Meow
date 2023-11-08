package org.example;

public class Cars {
    String Marke;
    String Modell;
    String Farbe;
    int Baujahr;
int Geschwidigkeit;
    Cars(String Marke, String Modell, String Farbe, int Baujahr, int Geschwindigkeit) {

    }

    public void starten(String Marke) {
        System.out.println("Das Auto " + Marke + " wird gestartet.");
    }
    public void beschleunigen(String Modell, int Geschwindigkeit) {
        int i = 0;
        while(i<=Geschwindigkeit){
        System.out.println("Derzeitige Geschwindigkeit: " + i);
        i += 10;
    }
}}
