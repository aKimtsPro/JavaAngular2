package demo.pattern.listener;

public class ChaineMeteo implements ThermometreListener {

    private String nom;
    private String nomPresent;

    public ChaineMeteo(String nom, String nomPresent) {
        this.nom = nom;
        this.nomPresent = nomPresent;
    }

    @Override
    public void onTemperatureChanged(int temperature){
        System.out.println(nom + " - " + nomPresent + " : il fait "+ temperature + " c'est trop pour la saison." );
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomPresent() {
        return nomPresent;
    }

    public void setNomPresent(String nomPresent) {
        this.nomPresent = nomPresent;
    }
}
