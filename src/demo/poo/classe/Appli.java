package demo.poo.classe;

public class Appli {

    public static void main(String[] args) {

        Personne luc = new Personne("luc", 50, ' ');
        Personne marie = new Personne();

        luc.sePresenter("salut", 5);
        System.out.println("-----------");
        marie.sePresenter();

        Chien c = new Chien();
        c.sePresenter();

    }
}
