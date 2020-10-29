package exo.poo.genericite.exceptions;

public class ManqueParticipantException extends RuntimeException {

    private final int nbrManquant;

    public ManqueParticipantException(int nbrParticipant) {
        super("Il manque " + (3 - nbrParticipant) + " sportif à la compétition");
        this.nbrManquant =  (3 - nbrParticipant);
    }

    public int getNbrManquant() {
        return nbrManquant;
    }
}
