package demo.poo.exo.banque.vers4;

public class Courant extends Compte{

    private double ligneCredit = 1000;

    public Courant(String numeroCompte, Personne titulaire) {
        super(numeroCompte, titulaire);
    }

    public void setLigneCredit(double ligneCredit) {
        if(ligneCredit>=0)
        {
            this.ligneCredit = ligneCredit;
        }
    }

    public double getLigneCredit() {
        return ligneCredit;
    }


    @Override
    public void retrait(double montant) {
        if( getSolde() - montant >= -ligneCredit )
            super.retrait(montant);
        else
            System.out.println("retrait impossible");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nligne credit : " + this.getLigneCredit();
    }
}
