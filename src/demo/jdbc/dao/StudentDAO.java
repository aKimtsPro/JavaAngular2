package demo.jdbc.dao;

import demo.jdbc.entity.Student;

import java.sql.*;

public class StudentDAO extends DAO implements AutoCloseable{

    private final Connection co;

    public StudentDAO() throws SQLException {
        co = DriverManager.getConnection(CO_STRING,USER,PSWD);
    }

    public Student getById(int id){

        Student stud = null;
        try{
            Statement stmt = co.createStatement();
            String requete = "SELECT * FROM student WHERE student_id = " + id;
            ResultSet rs = stmt.executeQuery(requete);

            if( rs.next() ){
                stud = new Student();

                stud.setStudent_id(rs.getInt("student_id"));
                stud.setFirst_name(rs.getString("first_name"));
                stud.setLast_name(rs.getString("last_name"));
                stud.setBirth_date( rs.getDate("birth_date").toLocalDate() );
                stud.setLogin(rs.getString("login"));
                stud.setSection_id(rs.getInt("section_id"));
                stud.setYear_result(rs.getInt("year_result"));
                stud.setCourse_id(rs.getString("course_id"));
            }

        }
        catch (SQLException e) {
            stud = null;
        }

        return stud;

    }

    @Override
    public void close() throws Exception {
        co.close();
    }
}
