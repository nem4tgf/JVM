package Ecommercefpt.Model;

import Ecommercefpt.entities.Product;

import java.sql.SQLException;
import java.util.List;

public class CustomerDAOImp implements GenericDAO<Product> {

    @Override
    public void create(Product entity) throws SQLException {

    }

    @Override
    public Product getById(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Product> getAll() throws SQLException {
        return null;
    }

    @Override
    public void update(Product entity) throws SQLException {

    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public List<Product> findByName(String name) throws SQLException {
        return null;
    }
}
