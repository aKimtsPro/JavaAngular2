package demo.pattern.listener;

import java.util.Scanner;

public class InterfaceConsole {

    // region singleton

    private static InterfaceConsole instance;

    public static InterfaceConsole getInstance() {
        if(instance == null)
            instance = new InterfaceConsole();

        return instance;
    }

    private InterfaceConsole() {}

    // endregion

    private Thermometre thermometre = Thermometre.getInstance();

    public void start(){
        int newTemp;
        do{
            System.out.println("Entrez la température actuelle");
            newTemp = new Scanner(System.in).nextInt();
            thermometre.setTemperature(newTemp);
        }while (newTemp != 999);
    }

}
