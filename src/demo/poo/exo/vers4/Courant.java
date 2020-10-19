package demo.poo.exo.vers4;

import java.time.LocalDate;
import java.time.Period;

public class Courant {
    private String numeroCompte;
    private double solde;
    private double ligneCredit = 1000;
    private Personne titulaire;


    public Courant(String numeroCompte, Personne titulaire) {
        setNumeroCompte(numeroCompte);
        setTitulaire(titulaire);
    }

    public Courant(String numeroCompte, double solde, Personne titulaire) {
        setNumeroCompte(numeroCompte);
        setSolde(solde);
        setTitulaire(titulaire);
    }


    public String getNumeroCompte() {
        return numeroCompte;
    }

    private void setNumeroCompte(String numeroCompte) {
        if((numeroCompte.length()==16) && (numeroCompte.startsWith("be")))
//        if((numeroCompte.length()==16) && (numeroCompte.indexOf("be") == 0))
            this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) {
        if (solde >= -ligneCredit)
            this.solde = solde;
    }

    public void setLigneCredit(double ligneCredit) {
        if(ligneCredit>=0)
        {
            this.ligneCredit = ligneCredit;
        }
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

    public double getLigneCredit() {
        return ligneCredit;
    }

    void depot (double montant){
        if (montant<=0)
            System.out.println("error");
        else
            setSolde(getSolde() + montant);
    }
    void retrait (double montant){

        if (montant<=0)
            System.out.println("error");
        else
            setSolde(getSolde() - montant);

    }

    public void afficher(){
        System.out.println("Courant:" +
                "\ntitu : " + ( getTitulaire() == null ? "inconnu" : getTitulaire().getNom() ) +
                "\nsolde : " + getSolde() +
                "\nligne : " + getLigneCredit() +
                "\nnum : " + getNumeroCompte()
        );
    }

}
