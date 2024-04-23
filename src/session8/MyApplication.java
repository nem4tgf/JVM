package session8;

import java.sql.*;

public class MyApplication {
    public static void main(String[] args) throws SQLException {
//        createCustomer();
        getAllCustomer();
        getCustomerVsPreparedStatement();
    }
    //lay toan bo thong tin cua bang customer
    public static void getAllCustomer() throws SQLException {
        //Goi doi tuong connection(nhac object Connection dat vao class nay)
        Connection connection = MySQLConnectionDB.getMyConnection();
        //Tao statement( lenh thuc thi vs csdl)
        Statement stm = connection.createStatement();
        //truy van trong csdl
        String query = "SELECT * FROM Customers";
        //Thuc thi truy van va tra ket qua cho DT ResultSet
        //ResultSet chua kqua tra ve tu CSDL
        ResultSet rs = stm.executeQuery(query);
        //Doc ban ghi tren ResultSet
        while (rs.next()){
            //doc customer_id co kieu int
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


    //them ban ghi cho CSDL
    public static void createCustomer() throws SQLException{
        Connection connection = MySQLConnectionDB.getMyConnection();
        Statement stm = connection.createStatement();
        String query = "INSERT INTO customers(customer_id, first_name, last_name, email) VALUES(3,'NGUYEN', 'THANH NAM','nam@fpt.edu.vn')";
        //Ham executeUpdate() dc su dung cho muc dich insert, update, delete
        int count = stm.executeUpdate(query);
        System.out.println(count);
    }


    public static void getCustomerVsPreparedStatement() throws SQLException{
        Connection connection = MySQLConnectionDB.getMyConnection();
        //truy van
        String query = "SELECT * FROM customers where customer_id = ? and last_name like ?";
        //tao doi tuong la PrepareStatement
        PreparedStatement pstm = connection.prepareStatement(query);
        //Thiet kao tham so cho dau ? dau tien(So 1 )
        pstm.setInt(1,3);
        //Thiet kao tham so cho dau ? thu 2(so 2)
        pstm.setString(2,"Thanh Nam");

        //Ket qua tra ve ResultSet
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            System.out.println("==============Use PrepareStatement==============");
            System.out.println("Customer id:" +rs.getInt("customer_id"));
            System.out.println("First name:" +rs.getString(2) );
            System.out.println("Last name:" +rs.getString(3) );
            System.out.println("Email:" +rs.getString("email") );
        }
        connection.close();
    }
}
