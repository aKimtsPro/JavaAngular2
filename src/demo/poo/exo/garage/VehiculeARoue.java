package demo.poo.exo.garage;

import java.time.LocalDate;

public class VehiculeARoue extends Vehicule {

    private int anneeConstruction;
    private int kmParcouru;

    public VehiculeARoue(String marque, String modele, int puissance, int anneeConstruction, int kmParcouru) {
        super(marque, modele, puissance);
        this.setAnneeConstruction(anneeConstruction);
        this.setKmParcouru(kmParcouru);
    }

    public void seDeplacer(int nbrKm){
        if( nbrKm >= 0)
        {
            System.out.println("Le véhicule à roue se déplace de " + nbrKm + "km.");
            setKmParcouru( getKmParcouru() + nbrKm );
        }
        else
        {
            System.out.println("argument invalide (nbrKm doit être positif)");
        }
    }

    public int getAnneeConstruction() {
        return anneeConstruction;
    }

    public void setAnneeConstruction(int anneeConstruction) {
        if( LocalDate.now().getYear() >= anneeConstruction )
            this.anneeConstruction = anneeConstruction;
    }

    public int getKmParcouru() {
        return kmParcouru;
    }

    private void setKmParcouru(int kmParcouru) {
        if( kmParcouru >= 0 )
            this.kmParcouru = kmParcouru;
    }

    @Override
    public String toString() {
        return "VehiculeARoue:" +
                "\n\t-marque : " + getMarque() +
                "\n\t-modele : " + getModele() +
                "\n\t-puissance : " + getPuissance() +
                "\n\t-annee de construction : " + getAnneeConstruction() +
                "\n\t-kmParcourus : " + getKmParcouru();
    }
}
