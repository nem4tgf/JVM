package JV2Exam.Entities;

public class Contact {
    private int contact_id;
    private String name;
    private String company;
    private String email;
    private int phone_number;

    public Contact(int contact_id, String name, String company, String email, int phone_number) {
        this.contact_id = contact_id;
        this.name = name;
        this.company = company;
        this.email = email;
        this.phone_number = phone_number;
    }

    public Contact() {
    }

    public int getContact_id() {
        return contact_id;
    }

    public void setContact_id(int contact_id) {
        this.contact_id = contact_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public int getId() {
        return 0;
    }
}
