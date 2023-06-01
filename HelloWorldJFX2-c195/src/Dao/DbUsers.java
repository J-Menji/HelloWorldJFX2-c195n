package Dao;

import Controller.JDBC;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import models.Users;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
public class DbUsers {

    public static ObservableList<Users> getAllUsers()   {
        ObservableList<Users> userList = FXCollections.observableArrayList();

        try {
            String sql = "SELECT * FROM users WHERE user_Name = '" + user_Name+ "'";
            PreparedStatement preparedStatement = JDBC.getConnection().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            }
    }
}
**/