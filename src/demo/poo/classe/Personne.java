package demo.poo.classe;

class Personne {

    private String nom;
    private int age;
    private char sexe;

    public Personne(String nom, int age, char sexe){
        this.nom = nom;
        setAge(age);
        this.sexe = sexe;
    }

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age >= 0)
            this.age = age;
    }

    // demo.poo.classe.Personne | sePresenter | /
    protected void sePresenter(){

        System.out.println("Personne : "+
                "\nnom : "+ nom +
                "\nage : "+ age );
    }

    // demo.poo.classe.Personne | sePresenter | (String)
    public void sePresenter(String message){
        sePresenter();
        System.out.println("\n" + message);
    }

    // Personne | sePresenter | (String, int)
    public int sePresenter(String message, int toReturn){
        sePresenter( message );
        return toReturn;
    }

    // Personne | sePresenter | int, String
    public void sePresenter(int nbrPres, String message){
        for (int i = 0; i < nbrPres; i++) {
            sePresenter(message);
        }
    }

}
