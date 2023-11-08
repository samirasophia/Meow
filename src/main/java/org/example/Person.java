package org.example;

public class Person {

        String Name;
        String Geschlecht;
        int Alter;

    public Person(String Name, String Geschlecht, int Alter) {
        this.Alter = Alter;
        this.Name = Name;
        this.Geschlecht = Geschlecht;
    }


    public void Vorstellen() {
        System.out.println("Hallo ich bin " + Name + " und ich bin " + Alter + " und mein Geschlecht ist " + Geschlecht);
    }}