package Domaci16_05;

public class MainKlas {
    public static void main(String[] args) {

        Proizvod p1 = new Proizvod("mleko",150,"20.07.2022.");
        p1.stampanje();

        Proizvod p2 = new Proizvod("sir",300,"05.10.2022.");
        p2.stampanje();

        Proizvod p3 = new Proizvod("sladoled",100,"28.06.2022.");
        p3.stampanje();
    }
}
