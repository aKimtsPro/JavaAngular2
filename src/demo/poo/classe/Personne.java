package demo.poo.classe;

public class Personne {

    String nom;
    int age;
    char sexe;

    Personne(){
        this.nom = "inconnu";
        this.sexe = ' ';
        this.age = 0;
    }

    Personne(String nom, int age, char sexe){
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;
    }

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    void modifAge(int age){
        this.age = age;
    }

    // demo.poo.classe.Personne | sePresenter | /
    void sePresenter(){

        System.out.println("Personne : "+
                "\nnom : "+ nom +
                "\nage : "+ age );
    }

    // demo.poo.classe.Personne | sePresenter | (String)
    void sePresenter(String message){
        sePresenter();
        System.out.println("\n" + message);
    }

    // Personne | sePresenter | (String, int)
    int sePresenter(String message, int toReturn){
        sePresenter( message );
        return toReturn;
    }

    // Personne | sePresenter | int, String
    void sePresenter(int nbrPres, String message){
        for (int i = 0; i < nbrPres; i++) {
            sePresenter(message);
        }
    }

}
