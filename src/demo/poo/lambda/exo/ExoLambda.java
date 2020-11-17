package demo.poo.lambda.exo;

import java.util.function.Predicate;

public class ExoLambda {

    public static void main(String[] args) {

        Personne p = new Personne(
                "luc",
                (burger -> burger.getTauxSel() > 5 && burger.getQualiteIng() > 8),
                (burger -> System.out.println("miam"))
        );

        Burger bon = new Burger(6,9, 250);
        Burger mauvais = new Burger(4,4, 350);

        System.out.println("Le burger 'bon' est bon : " + bon.estBon(p.getGoutEnBurger()));
        p.manger(bon);

        System.out.println("\nLe burger 'mauvais' est bon : " + mauvais.estBon(p.getGoutEnBurger()));
        p.manger(mauvais);

        p.setGoutEnBurger( burger -> burger.getPoid() > 300  );
        p.setFaconDeManger((burger) -> System.out.println(p.getNom() + " mange le burger, il est " +
                (burger.estBon( p.getGoutEnBurger() )?"bon":"mauvais")));

        System.out.println("\nLe burger 'bon' est bon : " + bon.estBon(p.getGoutEnBurger()));
        p.manger(bon);

        System.out.println("\nLe burger 'mauvais' est bon : " + mauvais.estBon(p.getGoutEnBurger()));
        p.manger(mauvais);



    }

}
