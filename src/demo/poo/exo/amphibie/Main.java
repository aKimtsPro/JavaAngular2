package demo.poo.exo.amphibie;

public class Main {

    public static void main(String[] args) {

        Navigant n = new VoitureAmphibie(0,"","");

        VoitureAmphibie va = null;
        if(n instanceof VoitureAmphibie)
             va = (VoitureAmphibie)n;


        if(va != null)
            System.out.println(va.getCouleur());



    }
}
