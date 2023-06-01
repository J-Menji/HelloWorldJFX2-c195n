package Dao;

import Controller.JDBC;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import models.Contacts;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbContacts {


    public static ObservableList<Contacts> getAllContacts() {
        ObservableList<Contacts> allContacts = FXCollections.observableArrayList();
        try {
            String sQuery = "SELECT * FROM contacts";
            PreparedStatement preparedStatement = JDBC.getConnection().prepareStatement(sQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int contactId = resultSet.getInt("Contact_ID");
                String contactName = resultSet.getString("Contact_Name");
                String email = resultSet.getString("Email");
                Contacts contacts = new Contacts(contactId, contactName, email);
                allContacts.add(contacts);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return allContacts;

    }
}
