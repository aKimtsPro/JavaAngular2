package demo.jdbc.entity;

public class Course {

    private String course_id;
    private String course_name;
    private double course_ects;
    private int professor_id;

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public double getCourse_ects() {
        return course_ects;
    }

    public void setCourse_ects(double course_ects) {
        this.course_ects = course_ects;
    }

    public int getProfessor_id() {
        return professor_id;
    }

    public void setProfessor_id(int professor_id) {
        this.professor_id = professor_id;
    }
}
