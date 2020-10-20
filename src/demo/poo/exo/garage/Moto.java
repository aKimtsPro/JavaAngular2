package demo.poo.exo.garage;

public final class Moto extends VehiculeARoue {

    private String nom;

    public Moto(String marque, String modele, int puissance, int anneeConstruction, int kmParcouru, String nom) {
        super(marque, modele, puissance, anneeConstruction, kmParcouru);
        this.setNom(nom);
    }

    @Override
    public void seDeplacer() {
        seDeplacer(30);
    }

    @Override
    public String toString() {
        return "Moto:" +
                "\n\t-marque : " + getMarque() +
                "\n\t-modele : " + getModele() +
                "\n\t-puissance : " + getPuissance() +
                "\n\t-annee de construction : " + getAnneeConstruction() +
                "\n\t-kmParcourus : " + getKmParcouru()+
                "\n\t-nom : " + getNom();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
