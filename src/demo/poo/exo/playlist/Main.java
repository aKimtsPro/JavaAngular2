package demo.poo.exo.playlist;

public class Main {

    public static void main(String[] args) {

        Playlist playlist = new Playlist();

        playlist.jouer();

        playlist.ajouter(new MusiqueRock("ledzep", "9:34"));
        playlist.ajouter(new MusiqueClassique("jonhy cage", "4:33"));
        playlist.ajouter(new MusiqueHipHop("lamar", "4:10"));

        playlist.jouer();
        playlist.jouer();
        playlist.jouer();
        playlist.jouer();

    }

}
