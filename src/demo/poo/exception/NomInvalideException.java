package demo.poo.exception;

public class NomInvalideException extends RuntimeException {

    private final int nbrCharEnTrop;

    public NomInvalideException(int nbrCharEnTrop) {
        super("code erreur 2 : Trop " + (nbrCharEnTrop < 0 ? "peu ": "") + " de caractères (" + nbrCharEnTrop + ")" );
        this.nbrCharEnTrop = nbrCharEnTrop;
    }

    public int getNbrCharEnTrop() {
        return nbrCharEnTrop;
    }
}
