package demo.poo.exo.playlist;

import demo.poo.enumeration.Genre;

public abstract class Musique {

    private String nom;
    private String longueur;
    private Genre genre;


    public Musique(String nom, String longueur) {
        this.nom = nom;
        this.longueur = longueur;
    }

    public abstract void jouer();

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

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
