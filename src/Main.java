package plante;

public class Main {
    public static void main(String[] args) {
        Arbore arbore = new Arbore();
        Cactus cactus = new Cactus();
        Floare floare = new Floare();

        arbore.creste();
        cactus.creste();
        floare.creste();


        arbore.creste(10);
        cactus.creste(5);
        floare.creste(3);
    }
}
