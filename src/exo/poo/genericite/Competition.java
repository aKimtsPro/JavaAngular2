package exo.poo.genericite;

import exo.poo.genericite.exceptions.CompetTermineException;
import exo.poo.genericite.exceptions.ManqueParticipantException;

import java.util.ArrayList;
import java.util.List;

public class Competition<S extends Sportif> {

    private Podium<S> podium;
    private List<S> participants = new ArrayList<>();
    private boolean finished = false;

    // methods

    public void inscription(S aInscrire){

        if(finished)
            throw new CompetTermineException(finished);

        if(aInscrire == null)
            throw new IllegalArgumentException("aInscrire should not be null");

        participants.add(aInscrire);

    }

    public void terminer(){

        if(finished)
            throw new CompetTermineException(finished);

        if(participants.size() < 3)
            throw new ManqueParticipantException(participants.size());

        this.finished = true;
        this.podium = new Podium<>(
                participants.get(0),
                participants.get(1),
                participants.get(2)
        );
    }

    public S getGagnant(){
        if(!finished)
            throw new CompetTermineException(finished);

        return podium.getOr();
    }


    // get/set

    public Podium<S> getPodium() {
        return podium;
    }

    public boolean isFinished() {
        return finished;
    }
}
