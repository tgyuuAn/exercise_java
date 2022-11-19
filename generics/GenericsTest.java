package generics;

public class GenericsTest {
    public static void main(String[] args){
        GenericPrinter<Powder> Gprinter = new GenericPrinter<Powder>();
        Gprinter.setMaterial(new Powder());
        Powder powder = Gprinter.getMaterial();

        System.out.println(Gprinter);
        System.out.println(powder);

        GenericPrinter<Plastic> GprinterPlastic = new GenericPrinter<Plastic>();
        GprinterPlastic.setMaterial(new Plastic());
        Plastic plastic = GprinterPlastic.getMaterial();

        GprinterPlastic.doPrinting();
        System.out.println(plastic);
    }
}
