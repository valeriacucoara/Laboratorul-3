package plante;

public class Cactus extends Planta {
    public Cactus() {
        super("Cactus");
    }

    @Override
    public void creste() {
        System.out.println(nume + " creste incet si stocheaza apa.");
    }

    public void creste(int inaltime) {
        System.out.println(nume + " a crescut cu " + inaltime + " cm.");
    }
}
