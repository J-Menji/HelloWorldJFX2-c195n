package models;

import java.time.LocalDateTime;

public class Appointment {
    private int appointment_Id;
    private String title_appointment;
    private String description;
    private String location;
    private String type;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    public int customer_Id;
    public int user_Id;
    public int contact_Id;

    public Appointment(int appointment_Id, String title_appointment, String description, String location, String type, LocalDateTime startTime, LocalDateTime endTime, int customer_Id, int user_Id, int contact_Id) {
        this.appointment_Id = appointment_Id;
        this.title_appointment = title_appointment;
        this.description = description;
        this.location = location;
        this.type = type;
        this.startTime = startTime;
        this.endTime = endTime;
        this.customer_Id = customer_Id;
        this.user_Id = user_Id;
        this.contact_Id = contact_Id;
    }

    public int getAppointment_Id() {
        return appointment_Id;
    }

    public void setAppointment_Id(int appointment_Id) {
        this.appointment_Id = appointment_Id;
    }

    public String getTitle_appointment() {
        return title_appointment;
    }

    public void setTitle_appointment(String title_appointment) {
        this.title_appointment = title_appointment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public int getCustomer_Id() {
        return customer_Id;
    }

    public void setCustomer_Id(int customer_Id) {
        this.customer_Id = customer_Id;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public int getContact_Id() {
        return contact_Id;
    }

    public void setContact_Id(int contact_Id) {
        this.contact_Id = contact_Id;
    }
}
