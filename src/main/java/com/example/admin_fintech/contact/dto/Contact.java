package com.example.admin_fintech.contact.dto;

public class Contact {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String message;
    private String indate;

    public Contact() {
    }

    public Contact(int id, String name, String email, String phone, String message, String indate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.message = message;
        this.indate = indate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", message='" + message + '\'' +
                ", indate='" + indate + '\'' +
                '}';
    }
}
