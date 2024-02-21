package fim.obchod;

import java.util.List;

public interface Obchod {
    public void pridejDoNabidky(Produkt produkt);
    public void odstranZNabidky(Produkt produkt);

    public boolean jeVNabidce(Produkt produkt);
    public void ulozNabidku(String fileName);
    public void nactiNabidku(String fileName);
    public void vymazNabidku();

    public List<Produkt> nabidka();

}
