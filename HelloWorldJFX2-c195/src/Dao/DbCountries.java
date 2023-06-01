package Dao;

import Controller.JDBC;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import models.Countries;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;

public class DbCountries {

    public static ObservableList<Countries> getAllCountries() {
        ObservableList<Countries> countryList = FXCollections.observableArrayList();
        try {
            String sQuery = "SELECT * FROM countries";
            PreparedStatement preparedStatement = JDBC.getConnection().prepareStatement(sQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int countryId = resultSet.getInt("Country_ID");
                String countryName = resultSet.getString("Country");
                Countries countries = new Countries(countryId, countryName);
                countryList.add(countries);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return countryList;
    }
}
