package Dao;

import Controller.JDBC;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import models.Appointment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

/*
public class DbAppointments {

    public static ObservableList<Appointment> getAllAppointments() throws SQLException {

        ObservableList<Appointment> appointmentsList = FXCollections.observableArrayList();


            String sql = "SELECT * FROM appointments";
            PreparedStatement preparedStatement = JDBC.getConnection().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())    {
                int appointment_Id = resultSet.getInt("Appointments_ID");
                String title_appointment = resultSet.getString("Title");
                String description = resultSet.getString("Description");
                String location = resultSet.getString("Location");
                String type = resultSet.getString("Type");
                LocalDateTime startTime = resultSet.getTimestamp("Start").toLocalDateTime();
                LocalDateTime endTime = resultSet.getTimestamp("End").toLocalDateTime();
                int customer_Id = resultSet.getInt("Customer_ID");
                int user_Id = resultSet.getInt("User_ID");
                int contact_Id = resultSet.getInt("Contact_ID");

                Appointment appointment = new Appointment(appointment_Id,title_appointment,description,location,type,startTime,endTime,customer_Id,user_Id,contact_Id);
                appointmentsList.add(appointment);

            }
            return appointmentsList;

    }


    public static int deleteAppointment(int customer, Connection connection) throws SQLException    {

        String sqlDelete = "DELETE FROM appointment WHERE Appointment_ID";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlDelete);
        preparedStatement.setInt(1, customer);

    }
}
**/