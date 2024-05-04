package session9.model;

import session9.entity.Customers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public interface CustomerDAO {
//    public ArrayList<Customers> getAllCustomer();
 //   public Customers findCustomerById(int id);

    public static void getAllCustomer() throws SQLException {
        Connection connection =  MySQLConnectionDB.getMyConnection();
        String query = "SELECT * FROM customers";
        PreparedStatement pstm = connection.prepareStatement(query);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            int cusId = rs.getInt(1);
            String first_name = rs.getString(2);
            String last_name = rs.getString(3);
            String email = rs.getString(4);
            System.out.println("===========================");
            System.out.println("Customer Id: " +cusId);
            System.out.println("First name: " +first_name);
            System.out.println("Last name: " +last_name);
            System.out.println("Email: " +email);
        }
        connection.close();
    }

    public static void findCustomerById() throws SQLException {
        Connection connection = MySQLConnectionDB.getMyConnection();

        String query = "SELECT * FROM customers WHERE customer_id = ?  ";
        PreparedStatement pstm = connection.prepareStatement(query);
        pstm.setInt(1,3);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            System.out.println("==============Use PrepareStatement==============");
            System.out.println("Customer id:" + rs.getInt("customer_id"));
            System.out.println("First name:" + rs.getString(2));
            System.out.println("Last name:" + rs.getString(3));
            System.out.println("Email:" + rs.getString("email"));

        }
        connection.close();
    }


    public static void createCustomer() throws SQLException{
        Connection connection = MySQLConnectionDB.getMyConnection();
        String query = "INSERT INTO customer(customer_id, first_name, last_name, email) VALUES ( 5, 'Nguyen','Gia Huy', 'huy@fpt.edu')";
        PreparedStatement pstm = connection.prepareStatement(query);
        ResultSet count = pstm.executeQuery();
        System.out.println(count);

    }


    public static void main(String[] args) throws SQLException {
        getAllCustomer();
        //findCustomerById();
        createCustomer();

    }

}
