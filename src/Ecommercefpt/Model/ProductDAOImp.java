//package Ecommercefpt.Model;
//
//import Ecommercefpt.entities.Product;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ProductDAOImp implements GenericDAO<Product>{
//
//
//    private final Connection conn = MySQLConnectionDB.getMyConnection();
//    private final String SQL_CREATE_PRODUCT = "INSERT INTO products values (?,?,?,?)";
//    private final String SQL_GET_By_ID = "SELECT * FROM products WHERE product_id = ?";
//    private final String SQL_GET_ALL_PRODUCT = "SELECT * FROM products";
//    private final String SQL_DELETE_PRODUCT = "delete FROM products WHERE product_id = ?";
//    private final String SQL_UPDATE_PRODUCT = "Update products products WHERE product_id = ?";
//    PreparedStatement pstm = null;
//
//    public ProductDAOImp() throws SQLException {
//    }
//
//
//    @Override
//    public void create(Product entity) throws SQLException {
//        pstm = conn.prepareStatement(SQL_CREATE_PRODUCT);
//        pstm.setInt(1, entity.getProductId());
//        pstm.setString(2,entity.getProductName());
//        pstm.setString(3,entity.getProductDesc());
//        pstm.setDouble(4,entity.getPrice());
//        pstm.executeUpdate();
//        System.out.println("Insert success");
//    }
//
//    @Override
//    public Product getById(int id) throws SQLException {
//        pstm = conn.prepareStatement(SQL_GET_By_ID);
//        pstm.setInt(1,id);
//        ResultSet rs = pstm.executeQuery();
//        if(rs.next()){
//            Product product = new Product();
//            product.setProductId(rs.getInt("product_id"));
//            product.setProductName(rs.getString("product_name"));
//            product.setProductDesc(rs.getString("product_desc"));
//            product.setPrice(rs.getDouble("price"));
//            return product;
//        }
//        return null;
//    }
//
//    @Override
//    public List<Product> getAll() throws SQLException {
//        List<Product> allProducts = new ArrayList<>();
//        pstm = conn.prepareStatement(SQL_GET_ALL_PRODUCT);
//        ResultSet rs = pstm.executeQuery();
//        while (rs.next()){
//            Product product = new Product();
//            product.setProductId(rs.getInt(1));
//            product.setProductName(rs.getString(2));
//            product.setProductDesc(rs.getString(3));
//            product.setPrice(rs.getDouble(4));
//            allProducts.add(product);
//        }
//        return allProducts;
//    }
//
//    @Override
//    public void update(Product entity) throws SQLException {
//        pstm = conn.prepareStatement(SQL_UPDATE_PRODUCT);
//        pstm.setInt(1, entity.getProductId());
//        pstm.setString(2,entity.getProductName());
//        pstm.setString(3,entity.getProductDesc());
//        pstm.setDouble(4,entity.getPrice());
//        pstm.executeUpdate();
//        System.out.println("Update success");
//    }
//
//    @Override
//    public boolean delete(int id) throws SQLException {
//        pstm = conn.prepareStatement(SQL_DELETE_PRODUCT);
//        pstm.setInt(1,id);
//        System.out.println("Delete success");
//        return false;
//    }
//
//    @Override
//    public List<Product> findByName(String name) throws SQLException {
//        return null;
//    }
//
//    public void createProduct(Product product) {
//    }
//
//    public ArrayList<Product> getAllProduct() {
//        return null;
//    }
//}
