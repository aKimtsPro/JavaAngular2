package demo.poo.exo.amphibie;

public class Voiture extends Vehicule implements Roulant {

    private String modele;

    public Voiture(float poid, String modele) {
        super(poid);
        setModele(modele);
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    @Override
    public void seDeplacer() {
        rouler();
    }

    @Override
    public void rouler() {
        System.out.println("la voiture roule");
    }
}
