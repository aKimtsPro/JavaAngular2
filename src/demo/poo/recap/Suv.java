package demo.poo.recap;

public class Suv extends Voiture{

    public void seDeplacer(){
        System.out.println("vroom");
    }

    @Override
    public void rouler() {
        System.out.println("roule roule");
    }

    @Override
    public void chanter() {
        System.out.println("la la la");
    }
}
