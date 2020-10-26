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

    public Section getById(int id){

        Section s = null;

        try(Connection co = DriverManager.getConnection(CO_STRING, USER, PSWD)){

            Statement stmt = co.createStatement();
            String requete = "SELECT * FROM section WHERE section_id = " + id;
            ResultSet rs = stmt.executeQuery(requete);

            if( rs.next() ){
                s = new Section();

                s.setSection_id( rs.getInt("section_id") );
                s.setSection_name( rs.getString("section_name") );
                s.setDelegate_id( rs.getInt("delegate_id") );
            }
        }
        catch( SQLException e ){
            s = null;
        }
        return s;
    }

    public boolean delete(int id){

        try( Connection co = DriverManager.getConnection(CO_STRING, USER, PSWD)){

            Statement stmt = co.createStatement();
            String requete = "DELETE FROM section WHERE section_id = " + id;

            return stmt.executeUpdate(requete) == 1;
        }
        catch (SQLException e){
            return false;
        }

    }

    public boolean insert(Section toInsert){

        if( toInsert == null ){
            throw new IllegalArgumentException("toInsert should not be null");
        }

        try( Connection co = DriverManager.getConnection(CO_STRING, USER, PSWD) ){

            Statement stmt = co.createStatement();
            String requete = "INSERT INTO section VALUES " +
                    "( " + toInsert.getSection_id() +
                    ", '" + toInsert.getSection_name() + "'" +
                    ", " + toInsert.getDelegate_id() +" )";

            return stmt.executeUpdate(requete) == 1;
        }
        catch (SQLException e){
            return false;
        }

    }

    public boolean update(Section toUpdate) throws SectionErrorException{

        if(toUpdate == null)
            throw new IllegalArgumentException("toUpdate shoud not be null");

        try( Connection co = DriverManager.getConnection(CO_STRING, USER, PSWD) ){

            String toPrepare =
                    "UPDATE section " +
                    " SET section_name = ?, delegate_id = ? " +
                    " WHERE section_id = ?";

            PreparedStatement ps = co.prepareStatement( toPrepare );

            ps.setString( 1, toUpdate.getSection_name() );
            ps.setInt( 2, toUpdate.getDelegate_id() );
            ps.setInt( 3, toUpdate.getSection_id() );

            return ps.executeUpdate() == 1;



//            Statement stmt = co.createStatement();
//            String requete = "UPDATE section SET" +
//                    " section_name = '" + toUpdate.getSection_name() + "'"+
//                    ", delegate_id = " + toUpdate.getDelegate_id() +
//                    " WHERE section_id = " + toUpdate.getSection_id();
//
//
//            return stmt.executeUpdate(requete) == 1;
        }
        catch (SQLException e){
            e.printStackTrace();
            throw new SectionErrorException();
        }

    }
}
