package Ecommercefpt.Model;

import Ecommercefpt.entities.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAOImp implements ProductDAO{


    private final Connection conn = MySQLConnectionDB.getMyConnection();
    private final String SQL_CREATE_PRODUCT = "INSERT INTO products values (?,?,?,?)";
    private final String SQL_GET_By_ID = "SELECT * FROM products WHERE product_id = ?";
    private final String SQL_GET_ALL_PRODUCT = "SELECT * FROM products";
    private final String SQL_DELETE_PRODUCT = "delete FROM products WHERE product_id = ?";
    private final String SQL_UPDATE_PRODUCT = "Update products products WHERE product_id = ?";
    PreparedStatement pstm = null;

    public ProductDAOImp() throws SQLException {
    }

    @Override
    public void createProduct(Product product) throws SQLException {
        pstm = conn.prepareStatement(SQL_CREATE_PRODUCT);
        pstm.setInt(1,product.getProductId());
        pstm.setString(2,product.getProductName());
        pstm.setString(3,product.getProductDesc());
        pstm.setDouble(4,product.getPrice());
        pstm.executeUpdate();
        System.out.println("Insert sucess");
    }

    @Override
    public Product getProduct(int proId) throws SQLException {
        return null;
    }

    @Override
    public ArrayList<Product> getAllProduct() throws SQLException {
        ArrayList<Product> allProduct = new ArrayList<>();
        pstm =conn.prepareStatement(SQL_GET_ALL_PRODUCT);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            Product product = new Product();
            product.setProductId(rs.getInt(1));
            product.setProductName(rs.getString(2));
            product.setProductDesc(rs.getString(3));
            product.setPrice(rs.getDouble(4));
            allProduct.add(product);
        }
        return allProduct;
    }

    @Override
    public void updateProduct(Product product) throws SQLException {

    }

    @Override
    public boolean deleteProduct(int proId) throws SQLException {
        return false;
    }

    @Override
    public ArrayList<Product> findByName(String name) throws SQLException {
        return null;
    }
}
