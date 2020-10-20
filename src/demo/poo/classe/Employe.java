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

    @Override
    public void manger() {
        System.out.println("la personne mange un burger");
    }

    @Override
    public void manger(int nbrBurger) {
        System.out.printf("la personne mange %d burger(s)\n", nbrBurger);

    }
}
