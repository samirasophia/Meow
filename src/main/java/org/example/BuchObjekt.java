package org.example;

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
    }

