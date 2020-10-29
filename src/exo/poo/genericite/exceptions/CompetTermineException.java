package exo.poo.genericite.exceptions;

public class CompetTermineException extends RuntimeException {

    private final boolean finished;

    public CompetTermineException(boolean finished) {
        super(finished ? "action impossible si la compet est terminée"
                : "action impossible si la compet n'est pas terminée");

        this.finished = finished;
    }

    public boolean isFinished() {
        return finished;
    }
}
