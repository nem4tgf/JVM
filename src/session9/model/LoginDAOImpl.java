package session9.model;

import session9.entity.Users;

import java.sql.*;

public class LoginDAOImpl  implements LoginDAO{

    private static  final Connection conn;

    static {
        try {
            conn = MySQLConnectionDB.getMyConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Statement stm = null;
    private PreparedStatement pstm = null;

    public LoginDAOImpl() throws SQLException {
    }

    @Override
    public String checkLoginStatement(Users user) throws SQLException {
        //Step1: query, Step2: Create Statement, Step3: ResultSet, Step4: while

        String username = user.getUsername();
        String password = user.getPassword();
        String query = "SELECT username FROM users where username = '"+username+"' and password like '"+password+"' ";

        //Tao statement moi lan thuc thi
        stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(query);
        while (rs.next()){
            System.out.println("Username is: " +rs.getString("username"));
            return rs.getString("username");
        }


        return "Not in the database";
    }

    @Override
    public String checkLoginPrepareStatement(Users user) throws SQLException {
        String query = "SELECT username from users where username like ? and password like ?";
        pstm = conn.prepareStatement(query);
        pstm.setString(1,user.getUsername());
        pstm.setString(2,user.getPassword());
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            System.out.println("Username is: " +rs.getString("username"));
            return rs.getString("username");
        }
        return "Not in the database";
    }

}
