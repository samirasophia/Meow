package Objekte;

import java.util.Scanner;

public class BuchObjekt {

  private  String autor;
    private String verlag;
    private int jahr;
    private double bewertung;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getVerlag() {
        return verlag;
    }

    public void setVerlag(String verlag) {
        this.verlag = verlag;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public double getBewertung() {
        return bewertung;
    }

    public void setBewertung(double bewertung) {
        this.bewertung = bewertung;
    }

    public BuchObjekt(String autor, int jahr, double bewertung, String verlag) {
        this.autor = autor;
        this.jahr = jahr;
        this.bewertung = bewertung;
        this.verlag = verlag;
    }

    public static class BuchObjektÜbung {
        //Aufgrund deutscher Bücher wurden ausschliesslich deutsche Variablenamen verwendet.

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String weitermachen;
            BuchObjekt FarmDerTiere = new BuchObjekt("George Owell", 1984, 7.5, "anaconda");
            do {
                System.out.println("Was willst du ändern");
                String auswahl = sc.nextLine();


                switch (auswahl) {
                    case "autor":
                        System.out.println("zu was?");
                        FarmDerTiere.setAutor(sc.nextLine());
                        System.out.println(FarmDerTiere.getAutor());
                        break;

                    case "jahr":
                        System.out.println("zu welchem Jahr?");
                        FarmDerTiere.setJahr(sc.nextInt());
                        System.out.println(FarmDerTiere.getJahr());
                        break;
                    case "bewertung":
                        System.out.println("Zu welcher Zahl?");
                        FarmDerTiere.setBewertung(sc.nextDouble());
                        System.out.println(FarmDerTiere.getBewertung());
                        break;
                    case "Verlag":
                        System.out.println("Zu welchem Verlag?");
                        FarmDerTiere.setVerlag(sc.nextLine());
                        System.out.println(FarmDerTiere.getVerlag());
                        break;
                    default:
                        System.out.println("invalid");
                }


                System.out.println("nocmla?");
                sc.nextLine();
                weitermachen = sc.nextLine();
            }

            while (weitermachen.equalsIgnoreCase("ja"));
            System.out.println(FarmDerTiere.getJahr());
            System.out.println(FarmDerTiere.getAutor());
            System.out.println(FarmDerTiere.getVerlag());
            System.out.println(FarmDerTiere.getBewertung());
        }
    }
}

