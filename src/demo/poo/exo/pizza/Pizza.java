package demo.poo.exo.pizza;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pizza {

    private List<Ingredient> ingredientList = new ArrayList<>();
    private double prix;
    private Pate typePate;
    private boolean cuite = false;

    // constructeurs

    public Pizza(Pate typePate) {
        this.typePate = typePate;
        this.prix = typePate.getPrix();
    }

    // methodes

    public void ajouterIngredient(Ingredient toAdd){

        if(cuite)
            throw new PizzaCuiteException();

        ingredientList.add(toAdd);

    }

    public void retirerIngredient(Ingredient toRemove){

        if(cuite)
            throw new PizzaCuiteException();

        ingredientList.remove(toRemove);

    }

    public void cuire() throws EmptyPizzaException{

        if( ingredientList.isEmpty() )
            throw new EmptyPizzaException();

        if( cuite )
            throw new PizzaCuiteException();

        cuite = true;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "ingredientList=" + ingredientList.size() +
                ", prix=" + prix +
                ", typePate=" + typePate +
                ", cuite=" + cuite +
                '}';
    }

    // get/set


    private List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    private void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public double getPrix() {
        return prix;
    }

    private void setPrix(double prix) {
        this.prix = prix;
    }

    public Pate getTypePate() {
        return typePate;
    }

    public void setTypePate(Pate typePate) {
        this.typePate = typePate;
    }

    public boolean isCuite() {
        return cuite;
    }

    private void setCuite(boolean cuite) {
        this.cuite = cuite;
    }
}
