package demo.jdbc.exos;

import demo.jdbc.dao.CourseDAO;
import demo.jdbc.entity.Course;

import java.util.List;

public class Exo3Part2 {
    public static void main(String[] args) {

//        Course c1 = new Course();
//        c1.setCourse_id("00000000");
//        c1.setCourse_name("Programmation JAVA");
//        c1.setCourse_ects(5);
//        c1.setProfessor_id(5);
//
//        Course c2 = new Course();
//        c2.setCourse_id("00000001");
//        c2.setCourse_name("Programmation Typescript");
//        c2.setCourse_ects(3);
//        c2.setProfessor_id(5);
//
        CourseDAO dao = new CourseDAO();
//        dao.insert(c1);
//        dao.insert(c2);

        int affected = dao.updateECTSForNameContains(0, "Programmation");
        System.out.println("nombre de lignes modifées : " + affected);

        List<Course> listCours = dao.getWithProfessorNameBegin("gi");
        for (Course cours : listCours) {
            System.out.println(cours.getCourse_name());
        }

    }
}
