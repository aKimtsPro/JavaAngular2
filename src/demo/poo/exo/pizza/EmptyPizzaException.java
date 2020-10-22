package demo.poo.exo.pizza;

public class EmptyPizzaException extends Exception{

    public EmptyPizzaException() {
        super("La pizza est vide.");
    }
}
