package demo.jdbc.exos;

import demo.jdbc.dao.SectionDAO;
import demo.jdbc.dao.SectionErrorException;
import demo.jdbc.entity.Section;

public class Exo2 {

    public static void main(String[] args) {

        SectionDAO dao = new SectionDAO();
        Section sect = new Section();

        sect.setSection_id(1330);
        sect.setSection_name("cours");
        sect.setDelegate_id(55);

        boolean updated = false;
            updated = dao.update(sect);

        System.out.println("'Ladders!' changed to 'cours' : " + updated );

    }
}
