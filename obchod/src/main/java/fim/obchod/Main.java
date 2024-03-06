package fim.obchod;

public class Main {
    public static void main(String[] args) {

        Obchod obchod = new ObchodImpl();
        obchod.napln();

        System.out.println(obchod.vypis());
    }
}