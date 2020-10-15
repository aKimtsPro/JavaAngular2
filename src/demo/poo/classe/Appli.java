package demo.poo.classe;

public class Appli {

    public static void main(String[] args) {

        Personne luc = new Personne();
        Personne marie = new Personne();

        luc.nom = "luc";
        luc.age = 50;
        luc.sexe = ' ';

        marie.nom = "marie";
        marie.age = 60;
        marie.sexe = ' ';

        luc.sePresenter("salut", 5);
        System.out.println("-----------");
        marie.sePresenter();

        Chien c = new Chien();
        c.sePresenter();

    }
}
