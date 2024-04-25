package session8;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchExample {
    public static void main(String[] args) throws SQLException {
        Connection connection = MySQLConnectionDB.getMyConnection();
        //xu li theo batch, cung 1 luc chay nhieu cau lenh
        //update, insert
        Statement stm = connection.createStatement();
        //query 1
        String query1 = "update customers set first_name = 'Tran' where customer_id = 1";
        stm.addBatch(query1);

        //query 2
        String query2 = "update customers set first_name ='Ngo' where customer_id = 2";
        stm.addBatch(query2);

        int []counts = stm.executeBatch();
        System.out.println("Query 1: "+counts[0]);
        System.out.println("Query 2: "+counts[1]);
        connection.commit();
    }
}
