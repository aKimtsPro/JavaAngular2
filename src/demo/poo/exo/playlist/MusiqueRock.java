package demo.poo.exo.playlist;

import demo.poo.enumeration.Genre;

public class MusiqueRock extends Musique {

    public MusiqueRock(String nom, String longueur) {
        super(nom, longueur);
        setGenre(Genre.ROCK);
    }

    @Override
    public void jouer() {
        System.out.println("tringtitring");
    }
}
