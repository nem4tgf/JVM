package Ecommercefpt.Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public interface CustomerDAO {
    public static void addCustomers() throws SQLException {
        Connection connection = MySQLConnectionDB.getMyConnection();
        Statement stm = connection.createStatement();
        String query1 ="INSERT INTO customers(customer_id, first_name, last_name, email) " +
                "VALUES (7,'Nguyen','Ngoc Ngan','ngan@fpt.edu')";
            stm.addBatch(query1);
        String query2 ="INSERT INTO customers(customer_id, first_name, last_name, email) " +
                "VALUES (8,'Nguyen','Gia Huy','huy@fpt.edu')";
            stm.addBatch(query2);
        int []counts =stm.executeBatch();
        System.out.println("Query 1: "+counts[0]);
        System.out.println("Query 2: "+counts[1]);
        connection.commit();
    }

    public static void editCustomers() throws SQLException {
        Connection connection = MySQLConnectionDB.getMyConnection();
        Statement stm = connection.createStatement();
        String query1 ="update customers set first_name = 'Le', last_name = 'Thi Mau', email = 'mau@fpt.vn' " +
                "where customer_id = 7";
            stm.addBatch(query1);
        String query2 ="update customers set first_name = 'Tran', last_name = 'Nhan Tam', email = 'tam@fpt.vn'" +
                " where customer_id = 8";
            stm.addBatch(query2);
        int []counts =stm.executeBatch();
        System.out.println("Query 1: "+counts[0]);
        System.out.println("Query 2: "+counts[1]);
        connection.commit();
    }

    public static void deleteCustomers() throws SQLException {
        Connection connection = MySQLConnectionDB.getMyConnection();
        Statement stm = connection.createStatement();
        String query1 ="delete from customers where customer_id = 7";
        stm.addBatch(query1);
        String query2 ="delete from customers where customer_id = 8";
        stm.addBatch(query2);
        int []counts =stm.executeBatch();
        System.out.println("Query 1: "+counts[0]);
        System.out.println("Query 2: "+counts[1]);
        connection.commit();
    }

    public static void main(String[] args) throws SQLException {
       // addCustomers();
        //editCustomers();
        deleteCustomers();
    }
}
