package demo.poo.lambda.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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
            System.out.println(p);
        }

        System.out.println("foreach méthode");
        list.forEach((Personne p) -> {
            System.out.println(p);
        });

        System.out.println("foreach methode ::");
        list.forEach(System.out::println);

    }

}
