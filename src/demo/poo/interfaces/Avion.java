package demo.poo.interfaces;

import java.util.List;

public class Avion extends Vehicule implements TrucQuiVole {

    private int envergure;

    public void voler(){
        System.out.println("l'avion vole");
    }

    public int getEnvergure() {
        return envergure;
    }

    public void setEnvergure(int envergure) {
        this.envergure = envergure;
    }
}
