package demo.poo.exo.garage;

public class Vehicule {

    private String marque = "inconnu";
    private String modele; // null
    private int puissance; // 0

    public Vehicule(String marque, String modele, int puissance) {
        this.setMarque(marque);
        this.setModele(modele);
        this.setPuissance(puissance);
    }

    public void seDeplacer(){
        System.out.println("Le vehicule se déplace.");
    }

    @Override
    public String toString() {
        return "Vehicule:" +
                "\n\t-marque : " + getMarque() +
                "\n\t-modele : " + getModele() +
                "\n\t-puissance : " + getPuissance();
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        if( marque.length() >= 5 && marque.length() <= 20 )
            this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        if( puissance >= 0 )
            this.puissance = puissance;
    }
}
