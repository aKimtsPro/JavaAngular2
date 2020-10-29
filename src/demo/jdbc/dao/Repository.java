package demo.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public interface Repository<Entity, Id> {
    boolean insert(Entity toInsert);

    Entity getById(Id id);
    List<Entity> getAll();

    boolean update(Entity toUpdate);

    boolean delete(Id id);
}
