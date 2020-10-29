package demo.jdbc.dao;

import java.util.List;

public abstract class DAO<Entity, Id> {
    protected final String CO_STRING = "jdbc:mysql://localhost:3308/dbslide?serverTimezone=UTC";
    protected final String USER = "root";
    protected final String PSWD = "";

    public abstract boolean insert(Entity toInsert);

    public abstract Entity getById(Id id);
    public abstract List<Entity> getAll();

    public abstract boolean update(Entity toUpdate);

    public abstract boolean delete(Id id);


}
