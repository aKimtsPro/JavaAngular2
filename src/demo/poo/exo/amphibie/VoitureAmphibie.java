package demo.poo.exo.amphibie;

public class VoitureAmphibie extends Voiture implements Navigant {

    private String couleur;

    public VoitureAmphibie(float poid, String modele, String couleur) {
        super(poid, modele);
        setCouleur(couleur);
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public void naviguer() {
        System.out.println("la voiture amphibie navigue.");
    }
}
