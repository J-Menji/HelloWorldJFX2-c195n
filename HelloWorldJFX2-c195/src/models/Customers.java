package models;

public class Customers {

    private int customer_Id;
    private String customer_Name;
    private String customer_Address;
    private String postal_Code;
    private String phone;
    private int division_Id;
    private String division_Name;

    public Customers(int customer_Id, String customer_Name, String customer_Address, String postal_Code, String phone, int division_Id, String division_Name) {
        this.customer_Id = customer_Id;
        this.customer_Name = customer_Name;
        this.customer_Address = customer_Address;
        this.postal_Code = postal_Code;
        this.phone = phone;
        this.division_Id = division_Id;
        this.division_Name = division_Name;
    }

    public int getCustomer_Id() {
        return customer_Id;
    }

    public void setCustomer_Id(int customer_Id) {
        this.customer_Id = customer_Id;
    }

    public String getCustomer_Name() {
        return customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        this.customer_Name = customer_Name;
    }

    public String getCustomer_Address() {
        return customer_Address;
    }

    public void setCustomer_Address(String customer_Address) {
        this.customer_Address = customer_Address;
    }

    public String getPostal_Code() {
        return postal_Code;
    }

    public void setPostal_Code(String postal_Code) {
        this.postal_Code = postal_Code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getDivision_Id() {
        return division_Id;
    }

    public void setDivision_Id(int division_Id) {
        this.division_Id = division_Id;
    }

    public String getDivision_Name() {
        return division_Name;
    }

    public void setDivision_Name(String division_Name) {
        this.division_Name = division_Name;
    }
}
