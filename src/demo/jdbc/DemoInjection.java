package demo.jdbc;

import demo.jdbc.dao.SectionDAO;
import demo.jdbc.dao.SectionErrorException;
import demo.jdbc.entity.Section;

public class DemoInjection {

    public static void main(String[] args) {

        SectionDAO dao = new SectionDAO();

        Section sect = new Section();
        sect.setSection_id(100);
        sect.setSection_name("injection sql' WHERE section_name LIKE 'c%'; -- ");
        sect.setDelegate_id(0);

        boolean updated = false;
        updated = dao.update(sect);

        System.out.println("updated? : " + updated);

    }

}
