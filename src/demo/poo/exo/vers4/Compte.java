package demo.poo.exo.vers4;

import java.time.LocalDate;
import java.time.Period;

public class Compte {

    // variables membres

    private String numeroCompte;
    private double solde;
    private Personne titulaire;

    public Compte(String numeroCompte, Personne titulaire) {
        this.numeroCompte = numeroCompte;
        this.setTitulaire( titulaire );
    }

    // Methods

    public void retrait(double montant){
        if(montant > 0)
            setSolde(getSolde() - montant);
    }

    public void depot(double montant){
        if(montant > 0)
            setSolde(getSolde() + montant);
    }


    @Override
    public String toString() {
        return "Compte:" +
                "\ntitu : " + ( getTitulaire() == null ? "inconnu" : getTitulaire().getNom() ) +
                "\nsolde : " + getSolde() +
                "\nnum : " + getNumeroCompte();
    }

    // Get/Set

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) {
        this.solde = solde;
    }

    public void setTitulaire(Personne titulaire) {

        if( titulaire != null && titulaire.getDateNaissance() != null)
        {
            int ages = Period.between(titulaire.getDateNaissance(), LocalDate.now()).getYears();
            if(ages >= 18)
            {
                this.titulaire = titulaire;
            }
        }

    }

    public Personne getTitulaire() {
        return titulaire;
    }

}
