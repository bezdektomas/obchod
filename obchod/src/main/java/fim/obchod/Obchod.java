package fim.obchod;

public interface Obchod {
    public void pridejDoNabidky(Produkt produkt);
    public void odstranZNabidky(Produkt produkt);

    public boolean jeVNabidce(Produkt produkt);
}
