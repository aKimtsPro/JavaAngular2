package exo.poo.genericite;

public class CoureurF1 extends Sportif {

    public String marqueVoiture;

    public CoureurF1(String nom, String marqueVoiture) {
        super(nom);
        this.marqueVoiture = marqueVoiture;
    }

    public String getMarqueVoiture() {
        return marqueVoiture;
    }

    public void setMarqueVoiture(String marqueVoiture) {
        this.marqueVoiture = marqueVoiture;
    }
}
