package demo.poo.exo.playlist;

public class MusiqueRock extends Musique {

    public MusiqueRock(String nom, String longueur) {
        super(nom, longueur);
    }

    @Override
    public void jouer() {
        System.out.println("tringtitring");
    }
}
