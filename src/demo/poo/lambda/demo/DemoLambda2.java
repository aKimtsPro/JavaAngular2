package demo.poo.lambda.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collectors;

public class DemoLambda2 {

    public static void main(String[] args) {


        // Definition temporaire d'une lambda :
        // référence à une méthode préexistante ou ecrite "sur le tas"

        // Les interfaces fonctionnelles permettent de catégoriser les lambdas

        //---------------------------------------------------------//
        System.out.println("-----------------------------------");
        // RUNNABLE

        // pas de param
        // pas de retour

        Runnable run = () -> System.out.println("salut, je suis un runnable!");
        run.run();


        //---------------------------------------------------------//
        System.out.println("-----------------------------------");
        // CONSUMER<T>

        // 1 param de type T
        // pas de retour

        List<Personne> personneList = Arrays.asList(
                new Personne("luc", 50),
                new Personne("marie", 4),
                new Personne("dominique", 18)
        );

        // exemple : forEach(Consumer<Personne> consumer)

        // via methode existante
        personneList.forEach( System.out::println );
        // via methode ecrite "sur le tas"
        // - luc, 50ans
        personneList.forEach( jean_luc -> System.out.println("- "+jean_luc.getNom()+", "+jean_luc.getAge()+"ans.") );



        //---------------------------------------------------------//
        System.out.println("-----------------------------------");
        // SUPPLIER<T>

        // pas de param
        // retour de type T

        Supplier<Personne> supplier = () -> new Personne("luc", 5);


        // exemple : orElseGet(Supplier<Personne> supplier)

        Optional<Personne> opt = Optional.empty();

        // via methode existante respectant l'interface
        Personne pers = opt.orElseGet( Personne::new );

        // si il n'existe pas de methode on le défini "sur le tas"
        pers = opt.orElseGet( supplier );

        System.out.println(pers);



        //---------------------------------------------------------//
        System.out.println("-----------------------------------");
        // FUNCTION<T,U>    (enfant : UnaryOperator<T> extends Function<T,T>)

        // 1 param de type T
        // retour de type U

        Function<String, LocalDate> func = LocalDate::parse;

        List<String> strings = Arrays.asList("2010-01-01","2012-11-05","1970-01-01");

        List<LocalDate> dates = strings.stream()
                .map(func)
                .collect(Collectors.toList());

        System.out.println(dates);

        Function<LocalDate, Personne> createPersonneFromBDate = (date) ->
                new Personne("inconnu", LocalDate.now().getYear()-date.getYear());

        List<Personne> persFromDate = dates.stream()
                .map(createPersonneFromBDate)
                .collect(Collectors.toList());

        System.out.println(persFromDate);


        //---------------------------------------------------------//
        System.out.println("-----------------------------------");
        // BIFUNCTION<T,U,V>       (enfant : BinaryOperator<T> extends BiFunction<T,T,T>)

        // 1 param de type T
        // 1 param de type U
        // retour de type V

        // ici le constructeur avec 2 params est reconnu car la ref est associée à une bifunction
        BiFunction<String, Integer, Personne> bifunc = Personne::new;
        BiFunction<String, LocalDate, Personne> bifunc2 = (string, localdate)->
                new Personne(string, LocalDate.now().getYear() - localdate.getYear());



        //---------------------------------------------------------//
        System.out.println("-----------------------------------");
        // PREDICATE<T>

        // 1 param de type T
        // retour de type boolean

        // Ici on fait référence à la méthode isOld d'une personne
        // cette methode n'a pas de paramètre mais la personne sur laquelle appliquer isOld()
        // est inconnue. Cette personne inconnu est interprétée comme paramètre.
        Predicate<Personne> predicate = Personne::isOld;
        boolean b = predicate.test(pers);

        // Exemple : filter( Predicate<Personne> predicate )
        // dans personneList:
        // - luc, 50ans;
        // - marie, 4ans;
        // - dominique, 18ans;

        List<Personne> listMajeur = personneList.stream()
                .filter( predicate )
                .collect(Collectors.toList());

        System.out.println( listMajeur );

        List<Personne> personneNomL = personneList.stream()
                .filter( personne -> personne.getNom().charAt(0) == 'l' )
                .collect(Collectors.toList());

        System.out.println( personneNomL );



        // ATTENTION au référence de méthode existante sur methode à partir de classe ou d'instances:

        Consumer<Personne> consumer = Personne::sePresenter;

        // Si on fait référence à une méthode NON STATIC d'un classe, l'instance sur laquelle
        // l'appliquer est inconnue == param supplémentaire
        BiFunction<Consumer<Personne>,Consumer<Personne>, Consumer<Personne>> bifunction = Consumer::andThen;
        BinaryOperator<Consumer<Personne>> biOperator = Consumer::andThen;

        // Si on fait référence à une méthode d'une instance, l'instance sur laquelle
        // l'appliquer est connue == pas de param supplémentaire
        Function<Consumer<Personne>, Consumer<Personne>> function = consumer::andThen;
        UnaryOperator<Consumer<Personne>> uOperator = consumer::andThen;

    }
}
