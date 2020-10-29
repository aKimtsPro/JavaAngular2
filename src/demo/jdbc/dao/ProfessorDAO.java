package demo.jdbc.dao;

import demo.jdbc.entity.Professor;

import java.util.List;

public class ProfessorDAO extends DAO<Professor, Integer> {
    @Override
    public boolean insert(Professor toInsert) {
        return false;
    }

    @Override
    public Professor getById(Integer integer) {
        return null;
    }

    @Override
    public List<Professor> getAll() {
        return null;
    }

    @Override
    public boolean update(Professor toUpdate) {
        return false;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }
}
