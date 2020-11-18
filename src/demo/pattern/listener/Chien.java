package demo.pattern.listener;

public class Chien {

    private String nom;

    public void aboyer(int nbrAboi){
        for (int i = 0; i < nbrAboi; i++) {
            System.out.println("woof");
        }
    }

    public Chien(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
