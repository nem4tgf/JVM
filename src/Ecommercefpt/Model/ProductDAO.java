package Ecommercefpt.Model;

import Ecommercefpt.entities.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductDAO {
    void createProduct(Product product) throws SQLException;
    Product getProduct (int proId) throws SQLException;
    ArrayList<Product> getAllProduct() throws  SQLException;
    void updateProduct(Product product) throws  SQLException;
    boolean deleteProduct(int proId) throws SQLException;

    ArrayList<Product> findByName (String name) throws SQLException;


}
