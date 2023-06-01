package models;

public class Users {

    public int user_Id;
    public String user_Name;
    public String password;

    public Users(int user_Id, String user_Name, String password) {
        this.user_Id = user_Id;
        this.user_Name = user_Name;
        this.password = password;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
