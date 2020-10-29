package demo.poo.lambda.demo;

public class Main {

    public static void main(String[] args) {

        // classe anonyme
        Rouler objet = new Rouler() {
            @Override
            public void rouler() {
                System.out.println( "roule roule ");
            }

            @Override
            public void chanter() {
                System.out.println("lalala");
            }
        };

        Personne p = new Personne("luc", 50){
            @Override
            public void sePresenter() {
                System.out.println(this.getAge() + " ... " + this.getNom());
            }
        };




        Volant v = new Volant() {
            @Override
            public void voler() {
                System.out.println("flap flap");
            }
        };
        System.out.println("v - " + v);
        v.voler();

        // Les lambda permettent de créer des objets de classes anonymes
        // à partir d'interface n'OBLIGEANT à redéfinir qu'UNE méthode.
        Volant v2 = () -> { System.out.println("flap flap de la lambda"); };
        System.out.println("v2 - " + v2);
        v2.voler();

        // :: permet de faire référence à une méthode qui existe déjà d'un élément(ceci est une lambda aussi)
        Volant v3 = objet::chanter;
        System.out.println("v3 - " + v3);
        v3.voler();

    }

}
