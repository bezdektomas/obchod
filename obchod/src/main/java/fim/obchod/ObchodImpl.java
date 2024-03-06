package fim.obchod;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ObchodImpl implements Obchod {
    
    private HashMap<Integer, Produkt> nabidka;

    public ObchodImpl() {
        nabidka = new HashMap<>();
    }

    public void pridejDoNabidky(Produkt produkt) {
        nabidka.put(produkt.kod, produkt);
    }

    public void odstranZNabidky(Produkt produkt) {
        nabidka.remove(produkt.kod);
    }

    public List<String> vypis() {
        ArrayList<String> result = new ArrayList<>();
        for (Produkt p : this.nabidka.values()) {
            result.add(p.toString());
        }

        return result;
    }

    @Override
    public boolean jeVNabidce(Produkt produkt) {
        return nabidka.containsValue(produkt);
    }

    @Override
    public void nactiNabidku(String fileName)
    {
       
 
    } 

    @Override
    public void ulozNabidku(String fileName) {
        ulozNabidku(fileName, ";");
    }

   
    public void ulozNabidku(String fileName, String sep)
    {
        try
        {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            bufferedWriter.write("Nabidka:\n");
            for (Produkt p : nabidka.values()) {
                bufferedWriter.write(p.line(sep));
            }

            bufferedWriter.close();
        }
        catch (IOException e) {
            System.err.println("Nabidku se nepodarilo ulozit do souboru " + fileName);
        }
    }
 


    @Override
    public void vymazNabidku() {
        nabidka.clear();
    }

    public void napln() {
        Zbozi z1 = new Zbozi("Chleba", "Chleba", Zbozi.Jednotka.ks);
        
        Zbozi z2 = new Zbozi("Kofola", "Kof", Zbozi.Jednotka.l);

        Vyrobce v1 = new Vyrobce("Pekař");
        Vyrobce v2 = new Vyrobce("Kofola ČeskoSlovensko");

        Produkt p1 = new Produkt(z1, v1, 5454, 1);
        Produkt p2 = new Produkt(z2, v2, 100, 1.5);

        

        pridejDoNabidky(p1);
        pridejDoNabidky(p2);
    }

}
