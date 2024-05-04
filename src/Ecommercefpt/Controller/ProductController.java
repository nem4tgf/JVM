package Ecommercefpt.Controller;

import Ecommercefpt.Model.ProductDAOImp;
import Ecommercefpt.entities.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public class ProductController {
    //Step 2: Gọi thể hiện của Model
    ProductDAOImp productDAOImp = new ProductDAOImp();

    public ProductController() throws SQLException {
    }
    public ArrayList<Product> getAllProductController() throws SQLException{
        //call model step 2
        ArrayList<Product> products = productDAOImp.getAllProduct();
        //Step 3:
        return products;
    }

    public void createProductController(Product product) throws SQLException{
        productDAOImp.createProduct(product);
    }
    //Code tiep cac controller method khac ben duoi
}
