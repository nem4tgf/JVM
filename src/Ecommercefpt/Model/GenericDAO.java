package Ecommercefpt.Model;

import Ecommercefpt.entities.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface GenericDAO<T> {
    void create(T entity) throws SQLException;

    void create(Product entity) throws SQLException;

    T getById(int id) throws SQLException;
    List<T> getAll() throws SQLException;
    void update(T entity) throws SQLException;
    boolean delete(int id) throws SQLException;
    List<T> findByName(String name) throws SQLException;


}

