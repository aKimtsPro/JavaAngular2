package demo.poo.optional;

import demo.poo.lambda.demo.Personne;

import java.util.Optional;

public class DemoOptional {

    public static void main(String[] args) {

        // Comment créer un Optional

        Personne p = new Personne("luc", 50);

        // creer un optional toujours vide
        Optional<Personne> optVide = Optional.empty();
        // creer un optional toujours rempli
        Optional<Personne> optRempli = Optional.of(p);
        // creer un optional pouvant etre vide ou rempli selon la valeur en param
        Optional<Personne> optRempliOuVide = Optional.ofNullable(p);

        // Comment extraire la valeur comprise à l'intérieur (si il y en a une) ?

        // Le get renvoie la valeur ou lance un NoSuchElementException de type unchecked
        // si l'Optional est vide

//--------- Personne personne = optVide.get();

        // Le or fourni un optional alternatif si l'Optional sur lequel il s'applique est vide

//--------- Optional<Personne> optAlternatif = optVide.or(() -> Optional.of(p));
//--------- System.out.println(optAlternatif.get());

        // Le orElse recupére soit la valeur de l'optional si non vide soit
        // la valeur alternative préexistante mise en param si vide.

//--------- Personne personne = optVide.orElse(p);
//--------- System.out.println(personne);


        // Le orElseGet récupère soit la valeur dans l'optional si non vide
        // ou exécute le supplier et récupère sa valeur si vide

//---------- Personne personne = optVide.orElseGet( () -> new Personne("marie", 60) );
//---------- System.out.println( personne );

        // orElseThrow == get

//---------- Personne personne = optVide.orElseThrow();

        // surcharge prenant un supplier de Throwable:
        // Récupère la valeur de l'Optional ou lance l'exception fournie par le
        // Supplier d'exception

//---------- try{
    //           Personne personne = optVide
    //                   .orElseThrow(() -> new Exception("L'optVide est vide... C'est etonant"));
    //       }
    //       catch (Exception e){
    //           System.out.println( e.getMessage() );
//---------- }

        // isPresent et isEmpty renvoient des boolean indiquant si l'optional
        // est rempli ou vide respectivement

        boolean rempli = optVide.isPresent();
        boolean vide = optVide.isEmpty();

        // ifPresent permet d'execute un action sur la base d'un Consumer si
        // l'Optional est rempli

//---------- optVide.ifPresent( System.out::println );

        // ifPresentOrElse(Consumer, Runnable)
        // - valeur présente dans l'Optional: exécution du Consumer avec la personne en param
        // - valeur absente dans l'Optional: exécution du Runnable

//---------- optRempli.ifPresentOrElse(
    //       System.out::println,
    //       () -> System.out.println("L'element n'est pas présent")
//---------- );

    }
}
