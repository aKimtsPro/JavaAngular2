package demo.poo.exo.playlist;

import demo.poo.enumeration.Genre;

public class MusiqueHipHop extends Musique {

    public MusiqueHipHop(String nom, String longueur) {
        super(nom, longueur);
        setGenre(Genre.HIP_HOP);
    }

    @Override
    public void jouer() {
        System.out.println("hipidy hop");
    }
}
