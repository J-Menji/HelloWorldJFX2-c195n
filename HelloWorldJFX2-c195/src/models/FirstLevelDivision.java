package models;

public class FirstLevelDivision {

    private int division_Id;
    private String division_Name;
    public int country_Id;

    public FirstLevelDivision(int division_Id, String division_Name, int country_Id) {
        this.division_Id = division_Id;
        this.division_Name = division_Name;
        this.country_Id = country_Id;
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

    public int getCountry_Id() {
        return country_Id;
    }

    public void setCountry_Id(int country_Id) {
        this.country_Id = country_Id;
    }
}
