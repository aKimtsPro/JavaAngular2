package demo.poo.exo.playlist;

import demo.poo.enumeration.Genre;

public class MusiqueClassique extends Musique {

    public MusiqueClassique(String nom, String longueur) {
        super(nom, longueur);
        setGenre(Genre.CLASSIQUE);

        System.out.println("le meilleur artiste classique est : "+ Genre.CLASSIQUE.getMeilleurArtiste());
    }

    @Override
    public void jouer() {
        System.out.println("pompidoum");
    }
}
