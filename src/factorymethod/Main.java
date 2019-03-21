package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        System.out.println("");
        AterioivaOtus opiskelija = new Opiskelija();
        opiskelija.aterioi();
        System.out.println("");
        AterioivaOtus vaksi = new Vaksi();
        vaksi.aterioi();
    }
}
