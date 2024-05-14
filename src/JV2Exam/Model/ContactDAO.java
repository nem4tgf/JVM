package JV2Exam.Model;


import JV2Exam.Entities.Contact;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ContactDAO {
    void createContact(Contact contact) throws SQLException;
    Contact getContact (int contact_id) throws SQLException;
    ArrayList<Contact> getAllContact() throws  SQLException;
    void updateContact(Contact contact) throws  SQLException;
    boolean deleteContact(int contact_id) throws SQLException;
    ArrayList<Contact> findByName (String name) throws SQLException;
}
