package demo.poo.exo.garage;

public class Main {

    public static void main(String[] args) {

        Vehicule v = new Vehicule("vw", "model1", -10);
        System.out.println( v ); // sout utilise le toString()
        v.seDeplacer();

        System.out.println("---");

        Bateau b = new Bateau("bateau", "eau", 0 , 0);
        System.out.println( b );
        b.seDeplacer();

        System.out.println("---");

        Voiture voit = new Voiture("","",0,0,0,0);
        System.out.println(voit);
        voit.seDeplacer();
        System.out.println(voit);
        voit.seDeplacer(10);
        System.out.println(voit);
    }
}
