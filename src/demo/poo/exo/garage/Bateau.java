package demo.poo.exo.garage;

public class Bateau extends Vehicule {

    private int superficie;

    public Bateau(String marque, String modele, int puissance, int superficie) {
        super(marque, modele, puissance);
        this.setSuperficie(superficie);
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        if(superficie >= 0)
            this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Bateau:" +
                "\n\t-marque : " + getMarque() +
                "\n\t-modele : " + getModele() +
                "\n\t-puissance : " + getPuissance() +
                "\n\t-superficie : " + getSuperficie();
    }
}
