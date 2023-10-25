package com.example.chatapp;

public class LaundererOrders_Model {

    private String userEmail;

    public LaundererOrders_Model() {
    }

    public LaundererOrders_Model(String userEmail) {
        userEmail = userEmail;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
