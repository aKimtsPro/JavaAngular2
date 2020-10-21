package demo.poo.exo.playlist;

public class MusiqueClassique extends Musique {

    public MusiqueClassique(String nom, String longueur) {
        super(nom, longueur);
    }

    @Override
    public void jouer() {
        System.out.println("pompidoum");
    }
}
