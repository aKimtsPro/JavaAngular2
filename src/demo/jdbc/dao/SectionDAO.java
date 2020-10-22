package demo.jdbc.dao;

import demo.jdbc.entity.Section;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SectionDAO extends DAO {

    public List<Section> getAll(){

        List<Section> list = new ArrayList<>();
        Section section;
        try(Connection co = DriverManager.getConnection(CO_STRING, USER, PSWD)){

            Statement stmt = co.createStatement();
            String requete = "SELECT * FROM section";
            ResultSet rs = stmt.executeQuery(requete);

            while(rs.next()){
                section = new Section();

                section.setSection_id(rs.getInt("section_id"));
                section.setSection_name(rs.getString("section_name"));
                section.setDelegate_id(rs.getInt("delegate_id"));

                list.add( section );
            }

        }
        catch (SQLException e){
            list = null;
        }

        return list;

    }

}
