package JV2Exam.Model;

import JV2Exam.Entities.Contact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContactDAOImp implements ContactDAO{



    private final Connection conn = MySQLConnectionDB.getMyConnection();
    private final String SQL_CREATE_CONTACT = "INSERT INTO contact values (?,?,?,?,?)";
    private final String SQL_GET_By_ID = "SELECT * FROM contact WHERE contact_id = ?";
    private final String SQL_GET_ALL_CONTACT = "SELECT * FROM contact";
    private final String SQL_DELETE_CONTACT = "delete FROM contact WHERE contact_id = ?";
    private final String SQL_UPDATE_CONTACT = "Update contact WHERE contact_id = ?";
    PreparedStatement pstm = null;

public ContactDAOImp() throws SQLException{
}


    @Override
    public void createContact(Contact contact) throws SQLException {
       pstm = conn.prepareStatement(SQL_CREATE_CONTACT);
       pstm.setInt(1,contact.getContact_id());
       pstm.setString(2,contact.getName());
        pstm.setString(3,contact.getCompany());
        pstm.setString(4,contact.getEmail());
        pstm.setInt(5,contact.getPhone_number());
        pstm.executeUpdate();
        System.out.println("Contact Created!");

    }

    @Override
    public Contact getContact(int contact_id) throws SQLException {
        pstm = conn.prepareStatement(SQL_GET_By_ID);
        pstm.setInt(1,contact_id);
        ResultSet rs = pstm.executeQuery();
        if(rs.next()){
            Contact contact = new Contact();
            contact.setContact_id(rs.getInt("contact_id"));
            contact.setName(rs.getString("name"));
            contact.setCompany(rs.getString("company"));
            contact.setEmail(rs.getString("email"));
            contact.setPhone_number(rs.getInt("phone_number"));
            return contact;
        }
        return null;
    }

    @Override
    public ArrayList<Contact> getAllContact() throws SQLException {
        ArrayList<Contact> allContacts = new ArrayList<>();
        pstm = conn.prepareStatement(SQL_GET_ALL_CONTACT);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            Contact contact = new Contact();
            contact.setContact_id(rs.getInt(1));
            contact.setName(rs.getString(2));
            contact.setCompany(rs.getString(3));
            contact.setEmail(rs.getString(4));
            contact.setPhone_number(rs.getInt(5));
            allContacts.add(contact);
        }
        return allContacts;
    }

    @Override
    public void updateContact(Contact contact) throws SQLException {
        pstm = conn.prepareStatement(SQL_UPDATE_CONTACT);
        pstm.setString(1,contact.getName());
        pstm.setString(2,contact.getCompany());
        pstm.setString(3,contact.getEmail());
        pstm.setInt(4, contact.getPhone_number());
        pstm.setInt(5,contact.getContact_id());
        pstm.executeUpdate();
        System.out.println("Update success");


    }

    @Override
    public boolean deleteContact(int contact_id) throws SQLException {
        pstm = conn.prepareStatement(SQL_DELETE_CONTACT);
        pstm.setInt(1,contact_id);
        ResultSet rs = pstm.executeQuery();
        if(rs.next()){
            Contact contact = new Contact();
            contact.setContact_id(rs.getInt("contact_id"));
            contact.setName(rs.getString("name"));
            contact.setCompany(rs.getString("company"));
            contact.setEmail(rs.getString("email"));
            contact.setPhone_number(rs.getInt("phone_number"));
        }
        return false;
    }

    @Override
    public ArrayList<Contact> findByName(String name) throws SQLException {
        return null;
    }
}

