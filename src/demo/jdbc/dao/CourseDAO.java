package demo.jdbc.dao;

import demo.jdbc.entity.Course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO extends DAO<Course, String>{

    public Course getById(String id){

        try(Connection co = DriverManager.getConnection(CO_STRING, USER, PSWD)){

            String requete = "SELECT * FROM course WHERE course_id = ?";
            PreparedStatement ps = co.prepareStatement(requete);
            ps.setString( 1, id.trim() );

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                Course read = new Course();

                read.setCourse_id(rs.getString("course_id"));
                read.setCourse_name(rs.getString("course_name"));
                read.setCourse_ects(rs.getDouble("course_ects"));
                read.setProfessor_id(rs.getInt("professor_id"));

                return read;
            }
            return null;
        }
        catch (SQLException e){
            return null;
        }

    }

    public List<Course> getAll(){

        try(Connection co = DriverManager.getConnection(CO_STRING, USER, PSWD)){

            String requete = "SELECT * FROM course";
            PreparedStatement ps = co.prepareStatement(requete);

            ResultSet rs = ps.executeQuery();
            List<Course> listCours = new ArrayList<>();

            while( rs.next() ){
                Course toAdd = new Course();

                toAdd.setCourse_id(rs.getString("course_id"));
                toAdd.setCourse_name(rs.getString("course_name"));
                toAdd.setCourse_ects(rs.getDouble("course_ects"));
                toAdd.setProfessor_id(rs.getInt("professor_id"));

                listCours.add( toAdd );
            }
            return listCours;
        }
        catch (SQLException e){
            return null;
        }

    }

    public boolean insert(Course toInsert){

        if(toInsert == null)
            throw new IllegalArgumentException("toInsert should not be null");

        try(Connection co = DriverManager.getConnection(CO_STRING, USER, PSWD)){

            String requete = "INSERT INTO course (course_id, course_name, course_ects, professor_id)" +
                    " VALUES (?, ?, ?, ?)";
            PreparedStatement ps = co.prepareStatement(requete);

            ps.setString(1, toInsert.getCourse_id());
            ps.setString(2, toInsert.getCourse_name());
            ps.setDouble(3, toInsert.getCourse_ects());
            ps.setInt( 4, toInsert.getProfessor_id());

            return ps.executeUpdate() == 1;

        }
        catch (SQLException e){
            return false;
        }

    }

    public boolean delete(String id){

        try(Connection co = DriverManager.getConnection(CO_STRING, USER, PSWD)){

            String requete = "DELETE FROM course WHERE course_id = ?";
            PreparedStatement ps = co.prepareStatement(requete);

            ps.setString( 1, id );

            return ps.executeUpdate() == 1;

        }
        catch (SQLException e){
            return false;
        }

    }

    public boolean update(Course toUpdate){

        if( toUpdate == null )
            throw new IllegalArgumentException("toUpdate should not be null");

        try(Connection co = this.openConnection()){

            String requete = "UPDATE course" +
                    " SET course_name = ?, course_ects = ?, professor_id = ?" +
                    " WHERE course_id = ?";
            PreparedStatement ps = co.prepareStatement(requete);

            ps.setString(1, toUpdate.getCourse_name());
            ps.setDouble(2, toUpdate.getCourse_ects());
            ps.setInt(3 , toUpdate.getProfessor_id());
            ps.setString(4, toUpdate.getCourse_id());

            return ps.executeUpdate() == 1;
        }
        catch (SQLException e){
            return false;
        }

    }

    public int updateECTSForNameContains(double ects, String contained){

        try(Connection co = DriverManager.getConnection(CO_STRING, USER, PSWD)){

            String requete = "UPDATE course SET course_ects = ? WHERE course_name LIKE ?";
            PreparedStatement ps = co.prepareStatement(requete);

            ps.setDouble( 1, ects );
            ps.setString( 2, "%"+contained+"%" );

            return ps.executeUpdate();

        }
        catch (SQLException e){
            return 0;
        }

    }

    public List<Course> getWithProfessorNameBegin(String beginning){

        try(Connection co = DriverManager.getConnection(CO_STRING, USER, PSWD)){

            String requete = "SELECT * FROM course" +
                    " WHERE professor_id IN " +
                    "(SELECT professor_id " +
                    " FROM professor" +
                    " WHERE professor_name LIKE ?)";

            PreparedStatement ps = co.prepareStatement(requete);

            ps.setString(1, beginning+"%");

            ResultSet rs = ps.executeQuery();
            List<Course> listCours = new ArrayList<>();

            while( rs.next() ){
                Course toAdd = new Course();

                toAdd.setCourse_id(rs.getString("course_id"));
                toAdd.setCourse_name(rs.getString("course_name"));
                toAdd.setCourse_ects(rs.getDouble("course_ects"));
                toAdd.setProfessor_id(rs.getInt("professor_id"));

                listCours.add( toAdd );
            }
            return listCours;
        }
        catch (SQLException e) {
            return null;

        }

    }

}
