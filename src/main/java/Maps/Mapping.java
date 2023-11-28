package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Mapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        java.util.Map<String, String> medecine = new HashMap<>();
        medecine.put("Husten", "Gegen Husten");
        medecine.put("Kopfweh", "Gegen Kopfweh");
        medecine.put("Grippe", "Gegen Grippe");
        print(medecine);
int num = count(medecine);
        System.out.println(num);
        name(medecine);
        print(medecine);
    }
    public static int count (Map<?, ?> medecine){
       return medecine.size();
    }
    public static void save (Map<?, ?> medecine){
        Scanner sc = new Scanner (System.in);
        System.out.println("was löschen");
        String x = sc.nextLine();
        medecine.remove(x);
    }
    public static void print (Map<?, ?> medecine){
        for (medecine.Entry<String, String> entry : medecine.entrySet()){
            System.out.println(medecine.get());
            System.out.println(entry.getKey() + entry.getValue);
        }
    }

    public static void name(Map<?, ?> medecine){
        Scanner sc = new Scanner (System.in);
        System.out.println("welche");
        String x = sc.nextLine();
        medecine.get(x);
        if (medecine.containsKey(x)) {
            System.out.println(x);
        } else {
            System.out.println("invalid");
        }
    }
}
