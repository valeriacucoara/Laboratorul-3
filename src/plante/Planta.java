package plante;

public abstract class Planta implements Crestere {
    protected String nume;

    public Planta(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void creste(int inaltime) {
        System.out.println(nume + " a crescut cu " + inaltime + " cm.");
    }
}
