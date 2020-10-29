package demo.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public abstract class DAO<Entity, Id> implements Repository<Entity, Id> {
    protected final String CO_STRING = "jdbc:mysql://localhost:3308/dbslide?serverTimezone=UTC";
    protected final String USER = "root";
    protected final String PSWD = "";

    public Connection openConnection() throws SQLException {
        return DriverManager.getConnection(CO_STRING, USER, PSWD);
    }




}
