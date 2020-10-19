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
}
