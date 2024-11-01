package plante;

public class Arbore extends Planta {
    public Arbore() {
        super("Arbore");
    }

    @Override
    public void creste() {
        System.out.println(nume + " creste in inaltime.");
    }

    public void creste(int inaltime) {
        System.out.println(nume + " a crescut cu " + inaltime + " cm.");
    }
}
