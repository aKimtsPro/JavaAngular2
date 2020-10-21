package demo.poo.exo.playlist;

public class MusiqueHipHop extends Musique {

    public MusiqueHipHop(String nom, String longueur) {
        super(nom, longueur);
    }

    @Override
    public void jouer() {
        System.out.println("hipidy hop");
    }
}
