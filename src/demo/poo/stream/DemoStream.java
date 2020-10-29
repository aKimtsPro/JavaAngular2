package demo.poo.stream;

import demo.poo.lambda.demo.Personne;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {

    public static void main(String[] args) {

        List<Personne> list = new ArrayList<>();
        list.add(new Personne("luc", 50));
        list.add(new Personne("marie", 60));
        list.add(new Personne("luc", 30));

        // je veux recupérer une liste des personnes agés de moins de 55ans;
        System.out.println("--- forme algo basique ---");
        List<String> resultat = new ArrayList<>();

        for (Personne personne : list) {
            if(personne.getAge() < 55)
                resultat.add(personne.getNom());
        }

        resultat.forEach(System.out::println);

        // avec les streams
        System.out.println("--- forme stream ---");

//        List<Personne> streamResultat = list.stream()
//                .filter((Personne personne) -> {
//                    return personne.getAge() < 55;
//                }).collect(Collectors.toList());

        List<String> streamResultat = list.stream()
                .filter(personne -> personne.getAge() < 55)
                .map(Personne::getNom)
                .distinct()
                .collect(Collectors.toList());

        streamResultat.forEach(System.out::println);


        // Je souhaite avoir la somme des ages des personnes dont le nom commence par 'l'
        double somme = list.stream()
                .filter(personne -> personne.getNom().charAt(0) == 'l')
                .map(Personne::getAge)
                .reduce((elementPrecedent,elementSuivant) -> elementPrecedent + elementSuivant)
                .get();

        System.out.println("la somme  = " + somme);




    }
}
