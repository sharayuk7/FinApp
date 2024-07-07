package com.neueda.finapp.model;

public class User {
    private Long id;
    private String name;
    private Double balance;
    private String phoneNumber;

    public User(Long id, String name, Double balance, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

