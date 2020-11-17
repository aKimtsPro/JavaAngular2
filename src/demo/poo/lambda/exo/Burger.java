package demo.poo.lambda.exo;

import java.util.function.Predicate;

public class Burger {

    private int tauxSel;
    private int qualiteIng;
    private int poid;

    public Burger(int tauxSel, int qualiteIng, int poid) {
        this.tauxSel = tauxSel;
        this.qualiteIng = qualiteIng;
        this.poid = poid;
    }

    public boolean estBon(Predicate<Burger> predicate){
        return predicate.test( this );
    }

    public int getTauxSel() {
        return tauxSel;
    }

    public void setTauxSel(int tauxSel) {
        this.tauxSel = tauxSel;
    }

    public int getQualiteIng() {
        return qualiteIng;
    }

    public void setQualiteIng(int qualiteIng) {
        this.qualiteIng = qualiteIng;
    }

    public int getPoid() {
        return poid;
    }

    public void setPoid(int poid) {
        this.poid = poid;
    }

    @Override
    public String toString() {
        return "Burger:" +
                "\n\t- tauxSel = " + tauxSel +
                "\n\t- qualiteIng = " + qualiteIng +
                "\n\t- poid = " + poid;
    }
}
