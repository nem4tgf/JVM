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



//    public static void main(String[] args) throws SQLException {
//        getAllCustomer();
//    }

}
