package session2;

public class Person {
    private String name;
    private Integer bornYear;
    private String phone;

    public Person() {
    }

    public Person(java.lang.String name, Integer bornYear, java.lang.String phone) {
        this.name = name;
        this.bornYear = bornYear;
        this.phone = phone;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public Integer getBornYear() {
        return bornYear;
    }

    public void setBornYear(Integer bornYear) {
        this.bornYear = bornYear;
    }

    public java.lang.String getPhone() {
        return phone;
    }

    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Person{" +
                "name=" + name +
                ", bornYear=" + bornYear +
                ", phone=" + phone +
                '}';
    }
}