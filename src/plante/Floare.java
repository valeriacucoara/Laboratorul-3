package plante;

public class Floare extends Planta {
    public Floare() {
        super("Floare");
    }

    @Override
    public void creste() {
        System.out.println(nume + " infloreste.");
    }

    public void creste(int numarFlori) {
        System.out.println(nume + " a inflorit " + numarFlori + " flori.");
    }
}
