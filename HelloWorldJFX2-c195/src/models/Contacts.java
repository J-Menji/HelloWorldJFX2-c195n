package models;

public class Contacts {
    public int contact_Id;
    public String contact_Name;
    public String email;

    public Contacts(int contact_Id, String contact_Name, String email) {
        this.contact_Id = contact_Id;
        this.contact_Name = contact_Name;
        this.email = email;
    }

    public int getContact_Id() {
        return contact_Id;
    }

    public void setContact_Id(int contact_Id) {
        this.contact_Id = contact_Id;
    }

    public String getContact_Name() {
        return contact_Name;
    }

    public void setContact_Name(String contact_Name) {
        this.contact_Name = contact_Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
