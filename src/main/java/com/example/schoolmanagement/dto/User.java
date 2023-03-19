package com.example.schoolmanagement.dto;

import lombok.Getter;
import lombok.Setter;

public class User {

    @Setter
    @Getter
    private Integer id;

    protected String name;
    private int age;
    private String address;
    private String email;

    String packageVariable;

    public User(Integer id, String name, int age, String address, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public User() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
