package session9.controller;

import session9.entity.Users;
import session9.model.LoginDAOImpl;

import java.sql.SQLException;

public class LoginController {
    //Call  instance of Model step 2
    LoginDAOImpl loginDao = new LoginDAOImpl();

    public LoginController() throws SQLException {
    }
    public String loginStatementController (Users user) throws SQLException{
        //Strp 2 and 3
        String message = loginDao.checkLoginStatement(user);
        //return loginDao.checkLoginStatement(user);
        //Step 3:
        return message;
    }

    public String LoginPreparedStatementController (Users user) throws  SQLException{
        //Step 2
        String message = loginDao.checkLoginPrepareStatement(user);
        //Step 3
        return message;
    }
    public String loginPreparedStatementController (Users user) throws SQLException {
        return loginDao.checkLoginPrepareStatement(user);
    }
}
