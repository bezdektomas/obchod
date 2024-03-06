package fim.obchod;

public class Produkt {
    Zbozi zbozi;
    Vyrobce vyrobce;
    int kod;
    double kvantita;

    public String line(String sep) {
        return this.kod + sep + this.zbozi + sep + this.vyrobce + "\n";
    }

    @Override
    public String toString() {
        return this.kod + " # " + this.zbozi.nazev + " # " + this.vyrobce.nazev;
    }

    public Produkt(Zbozi zbozi, Vyrobce vyrobce, int kod, double kvantita) {
        this.zbozi = zbozi;
        this.vyrobce = vyrobce;
        this.kod = kod;
        this.kvantita = kvantita;
    }
}
