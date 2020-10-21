package demo.poo.exo.amphibie;

public class Bateau extends Vehicule implements Navigant {

    private int puissance;

    public Bateau(float poid, int puissance) {
        super(poid);
        setPuissance(puissance);
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    @Override
    public void seDeplacer() {
        naviguer();
    }

    @Override
    public void naviguer() {
        System.out.println("le bateau navigue.");
    }
}
