package demo.jdbc.entity;

public class Section {

    private int section_id;
    private String section_name;
    private int delegate_id;

    public int getSection_id() {
        return section_id;
    }

    public void setSection_id(int section_id) {
        this.section_id = section_id;
    }

    public String getSection_name() {
        return section_name;
    }

    public void setSection_name(String section_name) {
        this.section_name = section_name;
    }

    public int getDelegate_id() {
        return delegate_id;
    }

    public void setDelegate_id(int delegate_id) {
        this.delegate_id = delegate_id;
    }
}
