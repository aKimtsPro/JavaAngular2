package demo.jdbc.exos;

import demo.jdbc.dao.CourseDAO;
import demo.jdbc.entity.Course;

import java.sql.SQLException;
import java.util.List;

public class Exo3 {

    public static void main(String[] args) {

        // Test getById
        CourseDAO dao = new CourseDAO();
        Course gotten = dao.getById( "  EING2234       " );

        if(gotten != null)
            System.out.println(gotten.getCourse_name());
        else
            System.out.println("Cours non trouvé");

        // Test getAll
        System.out.println("--- test getAll ---");
        List<Course> listCours = dao.getAll();
        for( Course cours : listCours ){
            System.out.println( cours.getCourse_name() );
        }

        // Test insert
        System.out.println("--- test insert ---");
        gotten.setCourse_id("00000001");
        gotten.setCourse_name("java");
        boolean inserted = dao.insert(gotten);
        System.out.println("inserted? " + inserted);

        // Test update
        System.out.println("--- test update ---");
        gotten.setCourse_ects(10);
        boolean updated = dao.update(gotten);
        System.out.println("updated? " + updated);

        // Test delete
        System.out.println("--- test delete ---");
        boolean deleted = dao.delete("00000001");
        System.out.println("deleted? " + deleted);
    }
}
