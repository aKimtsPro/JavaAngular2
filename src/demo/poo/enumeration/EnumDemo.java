package demo.poo.enumeration;

import demo.poo.exo.playlist.Musique;
import demo.poo.exo.playlist.MusiqueConcrete;

public class EnumDemo {

    public static void main(String[] args) {

        Musique m = new MusiqueConcrete("bam", "3:20");
        m.setGenre( Genre.CLASSIQUE );

        Genre.CLASSIQUE.setMeilleurArtiste("mozart");

        System.out.println( m.getGenre().getMeilleurArtiste() );

    }
}
