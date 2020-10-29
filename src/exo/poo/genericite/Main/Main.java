package exo.poo.genericite.Main;

import exo.poo.genericite.Competition;
import exo.poo.genericite.CoureurF1;
import exo.poo.genericite.JoueurTennis;

public class Main {

    public static void main(String[] args) {

        Competition<CoureurF1> comp = new Competition<>();
        CoureurF1 f1 = new CoureurF1("luc", "vroomMobile");
        comp.inscription(f1);
        f1 = new CoureurF1("marie", "Pazage");
        comp.inscription(f1);
        f1 = new CoureurF1("dominique", "vrimvrom");
        comp.inscription(f1);
        
        comp.terminer();

        System.out.println("Le gagnant est : " + comp.getGagnant().getNom());

        comp.terminer();


    }
}
