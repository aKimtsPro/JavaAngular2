package demo.poo.exo.vers2;

public class Courant {
    String numeroCompte;
    double solde;
    double ligneCredit = 1000;
    Personne titulaire;

    public Courant() {
    }

    public Courant(String numeroCompte, Personne titulaire) {
        this.numeroCompte = numeroCompte;
        this.titulaire = titulaire;
    }

    public Courant(String numeroCompte, double solde, Personne titulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.titulaire = titulaire;
    }

    void depot (double montant){
        if (montant<=0)
            System.out.println("error");
        else
            solde = solde+montant;
    }
    void retrait (double montant){

        if (montant<=0)
            System.out.println("error");
        else if (montant>solde+ligneCredit)
            System.out.println("pas assez d'argent");
        else
            solde= solde- montant;

    }

}
