package demo.poo.interfaces;

public class Oiseau extends Animal implements TrucQuiVole {

    public int envergure;

    public void voler(){
        System.out.println("l'oiseau vole");
    }

    public int getEnvergure() {
        return envergure;
    }

    public void setEnvergure(int envergure) {
        this.envergure = envergure;
    }
}
