package demo.poo.exception;

public class ExceptionDemo {

    public static void main(String[] args) {

        Personne p = new Personne();

        try{
            // code dangereux
            p.setNom("jony");
            p.setAge(25);
        }
        catch ( AgeException e ) {
            System.out.println( e.getMessage() + e.getValeurInvalide() );
        }
        finally {
            System.out.println("dans le finally");
        }

        System.out.println("fin algo");

    }

}
