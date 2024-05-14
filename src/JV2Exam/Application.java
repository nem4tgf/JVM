package JV2Exam;

import JV2Exam.View.ContactConsoleUI;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {
        ContactConsoleUI contactConsoleUI = new ContactConsoleUI();
        contactConsoleUI.start();
    }
}
