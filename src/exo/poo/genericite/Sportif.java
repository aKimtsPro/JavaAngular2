package exo.poo.genericite;

public abstract class Sportif {

    private String nom;

    public Sportif(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
