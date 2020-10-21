package demo.poo.exception;

public class Personne {

    private String nom; // entre 5 et 20 caractères
    private int age; // positif

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if( nom.length() >= 5 && nom.length() <= 20 )
            this.nom = nom;
        else
        {
            int trop = nom.length() - ( (nom.length() < 5) ? 5 : 20 );
            throw new NomInvalideException( trop ); // unchecked
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if(age >= 20)
            this.age = age;
        else{
            throw new AgeException( age ); // checked
        }
    }
}
