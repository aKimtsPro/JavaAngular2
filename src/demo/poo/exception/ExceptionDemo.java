package demo.poo.exception;

public class ExceptionDemo {

    public static void main(String[] args) {

        Personne p = new Personne();

        p.setNom("johny");

        try{
            // code dangereux

            p.setAge(25);
        }
        catch ( NomInvalideException e ){
            System.out.println( e.getMessage() );
        }
        catch ( AgeException e ) {
            System.out.println( e.getMessage() + e.getValeurInvalide() );
        }

        System.out.println("fin algo");

    }

}
