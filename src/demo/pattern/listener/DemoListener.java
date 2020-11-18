package demo.pattern.listener;

public class DemoListener {

    public static void main(String[] args) {

        Thermometre t = Thermometre.getInstance();

        Personne p1 = new Personne("luc", 10);
        t.addListener(p1);
        Personne p2 = new Personne("marie", 16);
        t.addListener(p2);
        ChaineMeteo cm = new ChaineMeteo("la chaine", "mateo");
        t.addListener(cm);

        // premier commentaire
        p1.onTemperatureChanged(t.getTemperature());
        p2.onTemperatureChanged(t.getTemperature());
        cm.onTemperatureChanged(t.getTemperature());

        // ajout d'un listener via classe anonyme

        t.addListener(new ThermometreListener() {
            @Override
            public void onTemperatureChanged(int temperature) {
                System.out.println("(via classe anonyme) La température est de " +temperature);
            }
        });
        t.addListener( (temperature) -> System.out.println("(via lambda) La température est de " +temperature) );

        Chien c = new Chien("fido");
        t.addListener( c::aboyer );

        // deuxieme commentaire
        t.setTemperature(14);



    }
}
