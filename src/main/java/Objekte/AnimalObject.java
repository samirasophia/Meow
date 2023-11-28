package Objekte;

import Objekte.Animal;

import java.util.ArrayList;

public class AnimalObject {
    public static void main(String[] args) {
        Animal Tiger = new Animal(4, 0, "RAAAAAAAAWR!");
        Animal Cat = new Animal(4, 0, "Meow!u^u");
        Animal Dog = new Animal(4, 0, "Bark Bark!owo");
        Animal Fish = new Animal(4, 0, "~blub~");
        Cat.soundOutput();

//Array
        ArrayList<Animal> zoo = new ArrayList<>();
        Animal[] animals = new Animal[4];
        animals[0] = Tiger;
        animals[1] = Cat;
        animals[2] = Dog;
        animals[3] = Fish;

//Aufgabe 2 oder so
        System.out.println(Cat.toString());

        //Aufgabe Bonus
        addObject(Cat);

    }


    public static void addObject(Animal animal) {
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(animal);
        System.out.println(zoo);
    }

}

