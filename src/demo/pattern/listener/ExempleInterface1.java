package demo.pattern.listener;

public class ExempleInterface1 {

    public static void main(String[] args) {

        Thermometre.getInstance()
                .addListener( (temperature) -> System.out.println("la temperature est de : " + temperature) )
                .addListener( (t) -> System.out.println("arrete de changer la temperature!"));

        InterfaceConsole.getInstance().start();

    }

}
