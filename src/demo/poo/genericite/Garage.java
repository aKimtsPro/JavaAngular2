package demo.poo.genericite;

public class Garage<V extends Vehicule> {

    private V vehicule;

    public V getVehicule() {
        return vehicule;
    }

    public void setVehicule(V vehicule) {
        this.vehicule = vehicule;
    }
}
