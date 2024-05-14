package JV2Exam.Controller;
import JV2Exam.Entities.Contact;
import JV2Exam.Model.ContactDAOImp;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContactController {
    ContactDAOImp contactDAOImp = new ContactDAOImp();

    public ContactController() throws SQLException {
    }
    public ArrayList<Contact> getAllContactController() throws SQLException{

        ArrayList<Contact> contacts = contactDAOImp.getAllContact();

        return contacts;
    }

    public void createContactController(Contact contact) throws SQLException{
        contactDAOImp.createContact(contact);
    }
    public Contact getContactByID(int contact_id) throws SQLException{
        Contact contact = (Contact) this.getById(contact_id);
        this.getById(contact.getId());
        return contact;
    }

    private Contact getById(int id) {
        return null;
    }
    public void updateContact(Contact contact) throws SQLException{
        contactDAOImp.updateContact(contact);
    }

    public void deleteContact(int contact) throws SQLException{
        contactDAOImp.deleteContact(contact);
    }
}

