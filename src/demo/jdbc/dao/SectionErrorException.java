package demo.jdbc.dao;

public class SectionErrorException extends Exception {

    public SectionErrorException() {
        super("probleme avec l'interaction de SectionDAO et la DB");
    }
}
