package demo.poo.lambda.demo;

public class Personne {

    private String nom;
    private int age;

    public Personne() {
    }

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void sePresenter(){
        System.out.println(age + " | " + nom);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isOld(){
        return this.getAge() >= 18;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "\nnom='" + nom + '\'' +
                ", \nage=" + age +
                '}';
    }
}
