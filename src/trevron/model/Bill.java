package trevron.model;

import java.time.LocalDateTime;

public class Bill {
    String customerName;
    String month;
    LocalDateTime date;
    int cost, appointmentNumber;

    public Bill(String customerName, LocalDateTime date, int cost, int appointmentNumber) {
        this.customerName = customerName;
        this.date = date;
        this.cost = cost;
        this.appointmentNumber = appointmentNumber;
        month = date.getMonth().toString();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getAppointmentNumber() {
        return appointmentNumber;
    }

    public void setAppointmentNumber(int appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }
}
