package demo.poo.classe;

public class Employe extends Personne{

    private double salaire;

    public Employe() {
        super("nom", 0, ' ');
        this.salaire = 0;
    }

    public Employe(String nom, int age, char sexe, double salaire) {
        super(nom, age, sexe);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
