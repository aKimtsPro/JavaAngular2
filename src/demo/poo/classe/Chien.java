package demo.poo.classe;


public class Chien {

    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    void sePresenter(){
        System.out.println("woof");
    }

    @Override
    public String toString(){
        return "Chien : " + "\n\tnom : " + getNom();
    }

    // Ctrl + O


    @Override
    public boolean equals(Object obj) {

        return obj instanceof Chien &&
                ((Chien) obj).getNom().equals(this.getNom());

    }
}
