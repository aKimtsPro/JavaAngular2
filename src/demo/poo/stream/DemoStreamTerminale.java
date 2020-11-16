package demo.poo.stream;

import demo.poo.lambda.demo.Personne;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoStreamTerminale {

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

        // Les methodes terminales mettent fin à l'utilisation du stream et
        // permettent de récupérer l'information désirée.

        //Les méthodes terminales
        System.out.println("*--- Les méthodes terminales ---*");

        // foreach
        // execute un consumer pour chaque element du Stream

        System.out.println("----- foreach -----");

        list.stream()
                .forEach(System.out::println);

        // collect
        // rassemble les éléments du stream dans un collection grâce à un collector

        ArrayList<Personne> personnes = list.stream()
                .collect( Collectors.toCollection(ArrayList::new) );

        // reduce
        // permet de récupérer un élément de meme type que la Stream
        // suite à un BinaryOperator

        System.out.println("----- reduce -----");
        Optional<String> concat = list.stream()
                .map(Personne::getNom)
                .reduce((ele1, ele2 )-> ele1 + " - " + ele2);

        System.out.println( concat.get() ); // attention get barbare

        // min
        // permet de récupérer l'élément minimum sur base d'un Comparator

        System.out.println("----- min -----");
        Optional<Personne> opt = list.stream()
                .min( Personne::compareTo );

        System.out.println( opt.get() ); // get sauvage

        // max
        // permet de récupérer l'élément maximum sur base d'un Comparator

        System.out.println("----- max -----");
        opt = list.stream()
                .max(Personne::compareTo);

        System.out.println( opt.get() ); // get immonde

        // count
        // compte le nombre d'élément de la Stream

        System.out.println("----- count -----");
        long count = list.stream()
                .count();

        System.out.println("nombre d'élément : " + count);

        // anyMatch  ( ><noneMatch )
        // vérifie si au moins un élément correspond à une condition sur la base d'un Predicate

        System.out.println("----- anyMatch -----");

        boolean anyBeginsWithL = list.stream()
                .anyMatch( (pers) -> pers.getNom().charAt(0) == 'l' || pers.getNom().charAt(0) == 'L' );

        System.out.println("Il " +(anyBeginsWithL?"":"n'")+  "existe " + (anyBeginsWithL?"":"pas") +
                "au moins une personne dont le nom commence par 'l' ou 'L'");

        // allMatch
        // vérifie si tous les éléments correspondent à une condition sur base d'un predicate

        System.out.println("----- allMatch -----");
        boolean allBeginsWithL =list.stream()
                .allMatch( (pers) -> pers.getNom().charAt(0) == 'l' || pers.getNom().charAt(0) == 'L' );

        System.out.println("Tous les elements " +(allBeginsWithL?"":"ne ") + "correspondent " + (allBeginsWithL?"":"pas ")+
                "avec le predicate");

        // noneMatch  ( >< anyMatch )
        // vérifie si aucun des éléments ne correspond à une condition sur la base d'un Predicate

        System.out.println("----- noneMatch -----");
        boolean noneBeginsWithL = list.stream()
                .noneMatch( (pers) -> pers.getNom().charAt(0) == 'l' || pers.getNom().charAt(0) == 'L' );

        System.out.println((noneBeginsWithL? "Aucun":"Un") + " des éléments"+(noneBeginsWithL? " ne":"")+" commence par 'l' ou 'L'");


        // findFirst
        // récupére le premier élément du Stream

        System.out.println("----- findFirst -----");
        opt = list.stream()
                .findFirst();

        System.out.println(opt.get()); // get degueulasse

        // findAny
        // récupère un élément (n'importe lequel) du Stream (souvent le premier mais auxune garantie)

        System.out.println("----- findAny -----");
        opt = list.stream()
                .findAny();

        System.out.println(opt.get()); // get honteux



    }
}
