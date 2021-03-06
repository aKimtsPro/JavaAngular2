package demo.poo.lambda.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoLambdaParam {

    public static void main(String[] args) {

        // classe anonyme
        Consumer<String> consume = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consume.accept("coucou");

        // lambda
        Consumer<String> consume2 = s -> System.out.println( s );

        // lambda ::
        Consumer<String> consume3 = System.out::println;


        List<Personne> list = new ArrayList<>();
        list.add(new Personne("luc", 50));
        list.add(new Personne("marie", 60));
        list.add(new Personne("dominique", 30));

        System.out.println("foreach structure iterative");
        for (Personne p : list) {
            p.sePresenter();
        }

        System.out.println("foreach méthode");
        list.forEach((Personne p) -> {
            p.sePresenter();
        });


        System.out.println("foreach methode ::");
        list.forEach(Personne::sePresenter);
        // Pour ce consumer on demande une méthode prenant une personne en param et pas de retour
        // Cette lambda fonctionne malgré le manque d'une personne en param
        // car la personne sur laquelle appliquer 'sePresenter()' est inconnue.
        // La dite personne sera donc notre paramètre.

    }

}
