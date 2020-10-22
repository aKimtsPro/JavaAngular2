package demo.poo.exo.pizza;

public class Main {

    public static void main(String[] args){

        Pizza p = new Pizza(Pate.MOYENNE);
        System.out.println( p );

        p.ajouterIngredient(new Ingredient("",0));

        if(!p.isCuite())
        {
            p.ajouterIngredient(new Ingredient("",0));
            try {
                p.cuire();
            }
            catch (EmptyPizzaException e)
            {
                System.out.println(e.getMessage());
            }
        }


    }
}
