package JV2Exam.View;


import JV2Exam.Controller.ContactController;
import JV2Exam.Entities.Contact;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactConsoleUI {
ContactController contactController = new ContactController();
        private final Scanner sc;

    public ContactConsoleUI() throws SQLException {
        this.sc = new Scanner(System.in);
    }

    private int menu(){
        System.out.println("====Contact Management====");
        System.out.println("1. All Contact");
        System.out.println("2. Create Contact");
        System.out.println("3.Update Contact");
        System.out.println("4.Delete Contact");
        System.out.println("5.Find by ID");
        System.out.println("6.Find by Name");
        System.out.println("0. Exit Contact");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public void createContact() throws SQLException {
        System.out.println("Enter id: ");
        int contact_id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Enter company : ");
        String company = sc.nextLine();
        System.out.println("Enter email : ");
        String email = sc.nextLine();
        System.out.println("Enter phone number: ");
        int phone_number = Integer.parseInt(sc.nextLine());
        Contact contact = new Contact(contact_id,name,company,email,phone_number);
        contactController.createContactController(contact);
    }



    public void getAllContactUI() throws SQLException{
        ArrayList<Contact> allContact = contactController.getAllContactController();
        allContact.forEach((contact)->{
            System.out.println("=====Contact Details=====");
            System.out.println(contact.getContact_id());
            System.out.println(contact.getName());
            System.out.println(contact.getCompany());
            System.out.println(contact.getEmail());
            System.out.println(contact.getPhone_number());
        });
    }


    public void updateContact() throws SQLException{
        System.out.println("Edit Contact ID: ");
        int contact_id = Integer.parseInt(sc.nextLine());
        Contact contact = contactController.getContactByID(contact_id);
        if (contact == null) {
            System.out.println("id not found.");
            return;
        }

        System.out.println("Edit Contact name : ");
        String name = sc.nextLine();
        if (!name.isEmpty()) {
            contact.setName(name);
        }

        System.out.println("Edit company : ");
        String company = sc.nextLine();
        if (!company.isEmpty()) {
            contact.setCompany(company);
        }
        System.out.println("Edit email: ");
        String email = sc.nextLine();
        if (!email.isEmpty()) {
            contact.setEmail(email);
            contact.setEmail(email);
        }

        contactController.updateContact(contact);

    }
    public void start() throws SQLException {
        while (true){
            int choice = menu();
            switch (choice){
                case 0: System.exit(0);break;
                case 1: getAllContactUI();break;
                case 2: createContact();break;
                case 3: updateContact();break;
                default: throw new AssertionError();
            }
        }
    }
}
