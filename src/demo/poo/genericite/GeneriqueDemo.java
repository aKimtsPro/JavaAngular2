package demo.poo.genericite;

import demo.poo.interfaces.Avion;

import java.util.ArrayList;
import java.util.Scanner;

public class GeneriqueDemo {

    public static void main(String[] args) {

       Garage<Voiture> g = new Garage<>();
       Voiture v = new Voiture();
       Velo velo = new Velo();
       Object o = new Object();

       g.setVehicule(v);
    }

}
