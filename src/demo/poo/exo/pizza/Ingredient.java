package demo.poo.exo.pizza;

public class Ingredient {

    private String nom;
    private double prix;

    public Ingredient(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {

        if( prix < 0 )
            throw new IllegalArgumentException("le prix doit être positif.");

        this.prix = prix;
    }
}
