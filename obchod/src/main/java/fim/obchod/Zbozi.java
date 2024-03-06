package fim.obchod;

public class Zbozi {
    String nazev;
    String zkratka;

    enum Jednotka {ks, kg, l};
    Jednotka jednotka;

    public Zbozi(String nazev, String zkratka, Jednotka jednotka) {
        this.nazev = nazev;
        this.zkratka = zkratka;
        this.jednotka = jednotka;
    }
    
}
