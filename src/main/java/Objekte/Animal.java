package Objekte;

public class Animal {

     private   int legs;
    private  int arms;
    private String sound;
public Animal (int legs, int arms, String sound){
    this.legs = legs;
    this.arms = arms;
    this.sound = sound;

}
public void soundOutput (){
    System.out.println(sound);

}

    @Override
    public String toString() {
        return "Animal{" +
                "legs: " + legs +
                ", arms: " + arms +
                ", sound: '" + sound + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
