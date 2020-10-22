package demo.jdbc;

import demo.jdbc.dao.StudentDAO;
import demo.jdbc.entity.Student;

import java.sql.SQLException;

public class DemoDao {

    public static void main(String[] args) {

        Student std = null;

        try (StudentDAO dao = new StudentDAO()){
            std = dao.getById(1000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println(
            (std == null) ?
                "non trouvé" : std.getFirst_name() + " " + std.getLast_name()
        );

    }
}