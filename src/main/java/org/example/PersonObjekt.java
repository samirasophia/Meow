package org.example;

public class PersonObjekt {
    public static void main(String[] args) {
Person myPerson = new Person("Silvan","Männlich", 21);
        Person aPerson = new Person("Silva","Männlic", 1);
        myPerson.Vorstellen();
        aPerson.Vorstellen();
        Person cPerson = new Person("Siva","Mänlic", 14);
        cPerson.Vorstellen();
        Person bPerson = new Person("Sila","Männic", 17);
        bPerson.Vorstellen();
        if(aPerson.Name.equalsIgnoreCase(bPerson.Name)){
            System.out.println("meow");
        } else {
            System.out.println("miau");
        }
    }
}