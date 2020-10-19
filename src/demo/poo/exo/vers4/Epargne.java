package demo.poo.exo.vers4;

import java.time.LocalDate;

public class Epargne extends Compte {

    private LocalDate dateDernierRetrait;

    public Epargne(String numeroCompte, Personne titulaire) {
        super(numeroCompte, titulaire);
    }

    // Methods

    @Override
    public void retrait(double montant) {
        if(getSolde() - montant >= 0){
            super.retrait(montant);
            setDateDernierRetrait( LocalDate.now() );
            System.out.println("retrait de " + montant + " le " + getDateDernierRetrait());
        }
        else
        {
            System.out.println("retrait impossible");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ndernier retrait : " + this.getDateDernierRetrait();
    }

    // Get/Set

    public LocalDate getDateDernierRetrait() {
        return dateDernierRetrait;
    }

    private void setDateDernierRetrait(LocalDate dateDernierRetrait) {
        this.dateDernierRetrait = dateDernierRetrait;
    }
}
