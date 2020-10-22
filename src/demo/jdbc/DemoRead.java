package demo.jdbc;

import java.sql.*;

public class DemoRead {

    public static void main(String[] args) {

        // a faire :
        // Etape 0.1 - charger le driver
        // Etape 0.2 - créer la connexionString
        // Etape 1 - se connecter
        // Etape 2 - créer une requete
        // Etape 3 - exécuter la requete
        // Etape 4 - lire les resultats


        // Etape 0.1 - charger le driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("le driver est chargé");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Etape 0.2 - créer la connexionString
        String coString = "jdbc:mysql://localhost:3308/dbslide?serverTimezone=UTC";

        // Etape 1 - se connecter
        try ( Connection co = DriverManager.getConnection(coString, "root", "") ) {

            System.out.println("connexion réussi.");

            // Etape 2 - créer une requete
            Statement stmt = co.createStatement();

            // Etape 3 - exécuter la requète
            ResultSet rs = stmt.executeQuery("SELECT first_name, last_name FROM student");

            // Etape 4 - lire les resultats
            while( rs.next() ){
                String firstname = rs.getString("first_name");
                String lastname = rs.getString("last_name");

                System.out.println(firstname+" "+lastname);
            }

            // Etape FINALE
            // co.close() -- se fait de base grace à autoClosable

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
