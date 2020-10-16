package demo.poo.classe;

public class Patron extends Personne {

    private String nomEntreprise;

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
        this.nom = "nom";
    }
}
