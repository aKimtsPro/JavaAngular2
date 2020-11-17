package demo.poo.stream;

import demo.poo.lambda.demo.Personne;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoStreamIntermediaire {

    public static void main(String[] args) {

        List<Personne> list = new ArrayList<>();
        list.add(new Personne("luc", 50));
        list.add(new Personne("marie", 6));
        list.add(new Personne("louis", 30));

        System.out.println("*--* Les Streams *--*");

        // sur les streams sont définis des méthodes intermédiaires et des méthodes terminales.
        // - les méthodes intermédiaires permettent de chaine les filtrage, mapage, ...
        // - les méthodes terminales permettent de mettre fin à l'instruction
        //   et de récupérer le résultat voulu

        // ** Les actions intermédiaires s'enregistre au fur et à mesure et ne seront effectuées
        //    qu'au moment de l'exécution de l'action terminale

        // Chainage de méthodes intermédiaires :
        System.out.println("----- chainage -----");
        list.stream() // Stream<Personne>
                .filter(Personne::isOld) // Stream<Personne>
                .map(Personne::getNom) // Stream<String>
                //.map(String::length) // Stream<Integer> != IntStream
                //.mapToInt(String::length) // IntStream
                .forEach(System.out::println);

        System.out.println("*--- Les méthodes intermédiaires ---*");

        // filter
        // Filtre les éléments en concordance avec le predicate
        System.out.println("----- filter -----");
        list.stream() // Stream<Personne>
                .filter(Personne::isOld) // Stream<Personne>
                .forEach(System.out::println);

        // map
        // Transforme UN element en UN autre
        System.out.println("----- map -----");
        list.stream() // Stream<Personne>
                .map(Personne::getNom) // Stream<String>
                .forEach(System.out::println);


        // flatmap
        // Transforme UN element en une SERIE d'autres

        System.out.println("----- flatmap -----");
        list.stream() // Stream<Personne>
                .flatMap(personne -> {
                    List<Character> listChar = new ArrayList<>();
                    for (int i = 0; i < personne.getNom().length(); i++) {
                        listChar.add( personne.getNom().charAt(i) );
                    }
                    return listChar.stream(); }) // Stream<Character>
                .forEach(System.out::println);

        // distinct
        // Exclu les éléments en double (grâce à la méthode .equals(...))

        System.out.println("----- distinct -----");
        list.stream() // Stream<Personne>
                .flatMap(personne -> {
                    List<Character> listChar = new ArrayList<>();
                    for (int i = 0; i < personne.getNom().length(); i++) {
                        listChar.add( personne.getNom().charAt(i) );
                    }
                    return listChar.stream(); }) // Stream<Character>
                .distinct() // Stream<Character>
                .forEach(System.out::println);

        // sorted
        // range les elements à l'aide d'un comparator
        // Comparator<T> : reférence à une méthode prenant 2 param de mm type et renvoyant un int
        //              si le int est négatif, le premier param sera premier,
        //              sinon, le second sera premier

        System.out.println("----- sorted -----");
        list.stream()
                .sorted(Personne::compareTo)   // la personne etant comparable, le comparator est
                .forEach(System.out::println); // facultatif

        // peek
        // equivalent de foreach en action intermédiaire

        System.out.println("----- peek -----");
        list.stream() // Stream<Personne>
                .peek(System.out::println) // Stream<Personne>
                .map(Personne::getNom) // Stream<String>
                .forEach(System.out::println);

        // limit
        // ne récupére que les n premiers éléments

        System.out.println("----- limit -----");
        list.stream()
                .limit(2)
                .forEach(System.out::println);

        // skip
        // ne récupère pas les n premiers éléments

        System.out.println("----- skip -----");
        list.stream()
                .skip(2)
                .forEach(System.out::println);

    }
}
