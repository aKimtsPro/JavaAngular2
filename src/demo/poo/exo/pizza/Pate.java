package demo.poo.exo.pizza;

public enum Pate {

    PETITE(5,10),
    MOYENNE(8, 15),
    GRANDE(12, 20);

    private final double prix;
    private final int taille;

    Pate(double prix, int taille) {
        this.prix = prix;
        this.taille = taille;
    }

    public double getPrix() {
        return prix;
    }

    public int getTaille() {
        return taille;
    }
}
