package Ecommercefpt.View;

import Ecommercefpt.Controller.ProductController;
import Ecommercefpt.entities.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductConsoleUI {
    //Step 1: cal controller
    ProductController productController = new ProductController();
    //Fields
    private final Scanner sc;

    public ProductConsoleUI() throws SQLException {
        this.sc = new Scanner(System.in);
    }
    private int menu(){
        System.out.println("=========Product Management=========");
        System.out.println("1. All product");
        System.out.println("2. Create product");
        System.out.println("0. Exit");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public void getAllProductUI() throws SQLException{
        //step 4
        ArrayList<Product> allProduct = productController.getAllProductController();
        allProduct.forEach((product -> {
            System.out.println("======Product Deteails");
            System.out.println(product.getProductId());
            System.out.println(product.getProductName());
            System.out.println(product.getProductDesc());
            System.out.println(product.getPrice());
        }));

    }

    public void createProductUI() throws SQLException{
        System.out.println("Enter Id: ");
        int pro_id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter product name: ");
        String name = sc.nextLine();
        System.out.println("Enter product desc: ");
        String product_desc = sc.nextLine();
        System.out.println("Enter product Price: ");
        double price = Double.parseDouble(sc.nextLine());
        Product product = new Product(pro_id,product_desc,name,price);
        productController.createProductController(product);
    }

    public static void start() throws SQLException{
        while (true){
            int choice = menu();
            switch (choice){
                case 0:System.exit(0); break;
                case 1:getAllProductUI(); break;
                case 2: createProductUI();break;
            }
        }
    }
}
