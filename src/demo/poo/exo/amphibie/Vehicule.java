package demo.poo.exo.amphibie;

public abstract class Vehicule {

    private float poid;

    public Vehicule(float poid) {
        this.poid = poid;
    }

    public abstract void seDeplacer();

    public float getPoid() {
        return poid;
    }

    public void setPoid(float poid) {
        this.poid = poid;
    }
}
