package demo.poo.lambda.exo;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Personne {

    private String nom;
    private Predicate<Burger> goutEnBurger;
    private Consumer<Burger> faconDeManger;

    public Personne(String nom, Predicate<Burger> goutEnBurger, Consumer<Burger> faconDeManger) {
        this.nom = nom;
        this.goutEnBurger = goutEnBurger;
        this.faconDeManger = faconDeManger;
    }

    public void manger(Burger burger){
        faconDeManger.accept(burger);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Predicate<Burger> getGoutEnBurger() {
        return goutEnBurger;
    }

    public void setGoutEnBurger(Predicate<Burger> goutEnBurger) {
        this.goutEnBurger = goutEnBurger;
    }

    public Consumer<Burger> getFaconDeManger() {
        return faconDeManger;
    }

    public void setFaconDeManger(Consumer<Burger> faconDeManger) {
        this.faconDeManger = faconDeManger;
    }

    @Override
    public String toString() {
        return "Personne: " +
                "\n\t- nom : " + nom;
    }
}
