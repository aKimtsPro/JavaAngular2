package demo.poo.classe;

import java.util.Scanner;

public class Patron extends Personne {

    public Patron() {
        super("-", 0, ' ');
        this.nomEntreprise = "-";
    }

    public Patron(String nom, int age, String nomEntreprise) {
        super(nom, age);
        this.nomEntreprise = nomEntreprise;
    }

    private String nomEntreprise;

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
        this.setNom("le nom");
    }

    @Override
    protected void sePresenter() {
        super.sePresenter();
        System.out.println("entreprise : " + this.getNomEntreprise());
    }

    @Override
    public void manger() {
        System.out.println("Le patron mange un hommard");
    }

    @Override
    public void manger(int nbrHommard) {
        System.out.printf("le patron mange %d hommard(s)\n", nbrHommard);
    }
}
