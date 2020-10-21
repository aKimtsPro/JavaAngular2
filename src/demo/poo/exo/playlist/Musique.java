package demo.poo.exo.playlist;

public abstract class Musique {

    private String nom;
    private String longueur;


    public Musique(String nom, String longueur) {
        this.nom = nom;
        this.longueur = longueur;
    }

    public abstract void jouer();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLongueur() {
        return longueur;
    }

    public void setLongueur(String longueur) {
        this.longueur = longueur;
    }
}
