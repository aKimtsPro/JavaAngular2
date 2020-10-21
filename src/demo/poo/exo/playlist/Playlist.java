package demo.poo.exo.playlist;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Musique> playlist = new ArrayList<>();
    private int indexToPlay; // = 0

    public void ajouter(Musique musique){
        playlist.add(musique);
    }

    public void supprimer(Musique musique){
        playlist.remove(musique);
    }

    public void jouer(){

        if(playlist.isEmpty()){
            System.out.println("La playlist est vide. Il n'y a rien à jouer.");
            return;
        }

        playlist.get(indexToPlay).jouer();

        if(indexToPlay == playlist.size()-1)
            indexToPlay = 0;
        else
            indexToPlay++;

    }

    // get/set

    public int getIndexToPlay() {
        return indexToPlay;
    }

    private void setIndexToPlay(int indexToPlay) {
        this.indexToPlay = indexToPlay;
    }

    private List<Musique> getPlaylist() {
        return playlist;
    }

    private void setPlaylist(List<Musique> playlist) {
        this.playlist = playlist;
    }

}
