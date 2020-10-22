package demo.jdbc.exos;

import java.sql.*;

public class Exo1 {

    public static void main(String[] args) {



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
            String requete = "SELECT first_name, section_name" +
                    " FROM student" +
                    " LEFT JOIN section" +
                    "   ON student.section_id = section.section_id" +
                    " WHERE first_name LIKE 'k%'";
            ResultSet rs = stmt.executeQuery(requete);

            // Etape 4 - lire les resultats
            while( rs.next() ){
                String firstname = rs.getString("first_name");
                String sectionName = rs.getString("section_name");

                System.out.println(firstname+" "+sectionName);
            }

            // Etape FINALE
            // co.close() -- se fait de base grace à autoClosable

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
