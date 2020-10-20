package demo.poo.exo.banque.vers2;

import java.time.LocalDate;

public class Personne {
    String nom;
    String prenom;
    LocalDate dateNaissance;

    public Personne() {
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance=LocalDate.now();
    }

    public Personne(String nom, String prenom, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }
}

