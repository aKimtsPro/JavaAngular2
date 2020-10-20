package demo.poo.exo.garage;

public class Voiture extends VehiculeARoue {

    private int nbrPorte;

    public Voiture(String marque, String modele, int puissance, int anneeConstruction, int kmParcouru, int nbrPorte) {
        super(marque, modele, puissance, anneeConstruction, kmParcouru);
        this.setNbrPorte(nbrPorte);
    }

    @Override
    public void seDeplacer() {
        seDeplacer(50);
    }

    @Override
    public String toString() {
        return "Voiture:" +
                "\n\t-marque : " + getMarque() +
                "\n\t-modele : " + getModele() +
                "\n\t-puissance : " + getPuissance() +
                "\n\t-annee de construction : " + getAnneeConstruction() +
                "\n\t-kmParcourus : " + getKmParcouru() +
                "\n\t-nbrPorte : " + getNbrPorte();
    }

    public int getNbrPorte() {
        return nbrPorte;
    }

    public void setNbrPorte(int nbrPorte) {
        if(nbrPorte <= 5 && nbrPorte >= 0)
            this.nbrPorte = nbrPorte;
    }

}
