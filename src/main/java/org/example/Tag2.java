import java.util.Scanner;
public class Tag2{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib ein Wort ein: ");
        String wort = scanner.nextLine();

        if (istPalindrom(wort)) {
            System.out.println(wort + " ist ein Palindrom.");
        } else {
            System.out.println(wort + " ist kein Palindrom.");
        }
    }

    public static boolean istPalindrom(String wort) {
        int laenge = wort.length();
        for (int i = 0; i < laenge / 2; i++) {
            if (wort.charAt(i) != wort.charAt(laenge - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

