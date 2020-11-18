package demo.pattern.listener;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ExempleInterface2 {

    public static void main(String[] args) {

        Thermometre t = Thermometre.getInstance();

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton btn = new JButton("appuyez ici");
        btn.setActionCommand("push");
        btn.addActionListener((actionEvent) -> t.setTemperature(t.getTemperature()+1));

        t.addListener( (temp) -> btn.setText("la temperature est de " + temp) );

        frame.add(btn);


        //fenetre 2

        JFrame frame2 = new JFrame();
        frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton btn2 = new JButton("appuyez ici");
        btn2.setActionCommand("push");
        btn2.addActionListener((actionEvent) -> t.setTemperature(t.getTemperature()+1));

        t.addListener( (temp) -> btn2.setText("la temperature est de " + temp) );

        frame2.add(btn2);



        frame.setVisible(true);
        frame2.setVisible(true);



    }

}
