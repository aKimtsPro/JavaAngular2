package demo.jdbc;

import demo.jdbc.dao.SectionDAO;
import demo.jdbc.dao.StudentDAO;
import demo.jdbc.entity.Section;
import demo.jdbc.entity.Student;

import java.sql.SQLException;
import java.util.List;

public class DemoDao {

    public static void main(String[] args) {

        // StudentDAO
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

        // SectionDAO

        SectionDAO sDao = new SectionDAO();
        List<Section> sectList = sDao.getAll();
        System.out.println("nombre de section : "
                + ((sectList == null) ? "vide" : sectList.size()));

    }
}