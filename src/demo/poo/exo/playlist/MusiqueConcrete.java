package demo.poo.exo.playlist;

public class MusiqueConcrete extends Musique {
    public MusiqueConcrete(String nom, String longueur) {
        super(nom, longueur);
    }

    @Override
    public void jouer() {
        System.out.println("bambimbam");
    }
}
