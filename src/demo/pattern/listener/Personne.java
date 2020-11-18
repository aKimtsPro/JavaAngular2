package demo.pattern.listener;

public class Personne  implements ThermometreListener {

    private  String nom;
    private int seuilTemp;

    public Personne(String nom, int seuilTemp) {
        this.nom = nom;
        this.seuilTemp = seuilTemp;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSeuilTemp() {
        return seuilTemp;
    }

    public void setSeuilTemp(int seuilTemp) {
        this.seuilTemp = seuilTemp;
    }

    @Override
    public void onTemperatureChanged(int t){
        System.out.println(nom + " : Il fait " +t+ ", c'est " + (t >= seuilTemp ? "chaud" : "froid") );
    }

}
