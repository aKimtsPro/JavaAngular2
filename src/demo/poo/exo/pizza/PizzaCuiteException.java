package demo.poo.exo.pizza;

public class PizzaCuiteException extends RuntimeException {

    public PizzaCuiteException() {
        super("La pizza est deja cuite.");
    }
}
