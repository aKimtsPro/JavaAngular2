package demo.poo.exception;

public class AgeException extends Exception {

    private final int valeurInvalide;

    public AgeException( int valeurInvalide ) {
        super("code erreur 1 : Valeur de l'age invalide(" + valeurInvalide + ")");
        this.valeurInvalide = valeurInvalide;
    }

    public int getValeurInvalide() {
        return valeurInvalide;
    }
}
