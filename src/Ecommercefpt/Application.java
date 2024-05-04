package Ecommercefpt;

import Ecommercefpt.View.ProductConsoleUI;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) {
        ProductConsoleUI productConsoleUI = new ProductConsoleUI();


    public Application() throws SQLException {
            ProductConsoleUI.start();
    }

    }
}
