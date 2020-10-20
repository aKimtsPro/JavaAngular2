package demo.poo.collection;

import demo.poo.classe.Chien;

import java.util.ArrayList;

public class Chenil {

    private ArrayList<Chien> chienList = new ArrayList<>();

    public ArrayList<Chien> getChienList() {
        return (ArrayList<Chien>) chienList.clone();
    }

    public void setChienList(ArrayList<Chien> chiens) {
        this.chienList = chiens;
    }

    public void add(Chien toAdd){

        if(!chienList.contains(toAdd))
            chienList.add(toAdd);

    }

    public void afficherList(){
        for (Chien element : chienList) {
            System.out.println("- nom :" + element.getNom());
        }
    }
}
