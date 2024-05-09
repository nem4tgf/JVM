package Ecommercefpt;

import Ecommercefpt.Model.Model;
import Ecommercefpt.View.ProductConsoleUI;
import Ecommercefpt.entities.Customer;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {
        Model<Customer> customerModel = new Model<Customer>();

        ProductConsoleUI productConsoleUI = new ProductConsoleUI();
        ProductConsoleUI.start();
    }
}
