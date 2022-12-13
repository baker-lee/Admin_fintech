package com.example.admin_fintech.subscribe.dto;

public class Subscribe {
    private String email;
    private String indate;

    public Subscribe() {
    }

    public Subscribe(String email, String indate) {
        this.email = email;
        this.indate = indate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    @Override
    public String toString() {
        return "Subscribe{" +
                "email='" + email + '\'' +
                ", indate='" + indate + '\'' +
                '}';
    }
}
